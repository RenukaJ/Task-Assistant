package taskmanager



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.converters.JSON

@Transactional(readOnly = true)
class TaskController {

     def shortenUrl() {
        
        def result = [:]
        def shortUrl ='';
        try{
        log.debug "debugging1"
        Shortener shUrl = new Shortener();
        //String longURL="http://localhost:8080/TaskManager/";
        log.debug "debugging2"+ params.longURL
        shortUrl = shUrl.shorten(params.longURL);
        //System.out.println("Shortened url"+shortUrl);
        log.debug "debugging3"+shortUrl
        result['shortUrl'] = shortUrl
//          
//            map.putAt('shortUrl')
//        log.debug "debugging4"
//        map['shortURL'] = shortUrl;
//        log.debug "debugging5"+map

        }catch(Exception e){
            log.error e.printStackTrace();
        }
        render result as JSON
//        render view:'index', model:[shortURL:shortURL]
//        return [shortURL: shortURL]   
    }
    
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Task.list(params), model:[taskInstanceCount: Task.count()]
    }
    
    def displayTaskPage(){
        def model = [:]
        log.debug "in displayTaskPage of taskController"
        render( view: '/task/index',model:model)
    }
    def displayURLPage(){
        def model =[:]    
        log.debug "in displayURLPage of taskController"
        render(view: '/task/urlShorteningPage', model:model)
    }
    
    def show(Task taskInstance) {
        respond taskInstance
    }

    def create() {
        respond new Task(params)
    }

    @Transactional
    def save(Task taskInstance) {
        if (taskInstance == null) {
            notFound()
            return
        }

        if (taskInstance.hasErrors()) {
            respond taskInstance.errors, view:'create'
            return
        }

        taskInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'task.label', default: 'Task'), taskInstance.id])
                redirect taskInstance
            }
            '*' { respond taskInstance, [status: CREATED] }
        }
    }

    def edit(Task taskInstance) {
        respond taskInstance
    }

    @Transactional
    def update(Task taskInstance) {
        if (taskInstance == null) {
            notFound()
            return
        }

        if (taskInstance.hasErrors()) {
            respond taskInstance.errors, view:'edit'
            return
        }

        taskInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Task.label', default: 'Task'), taskInstance.id])
                redirect taskInstance
            }
            '*'{ respond taskInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Task taskInstance) {

        if (taskInstance == null) {
            notFound()
            return
        }

        taskInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Task.label', default: 'Task'), taskInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'task.label', default: 'Task'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
