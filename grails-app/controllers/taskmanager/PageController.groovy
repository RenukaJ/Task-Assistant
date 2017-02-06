package taskmanager

class PageController {

    def index() { }
    
    
    def callFromUrl() {
        log.debug "redirecting to shortner page"
//        render(view: '/task/urlShorteningPage')
        redirect (controller : 'task', action:'displayURLPage')
        
    }
    
    def callFromTask() {
        log.debug "redirecting to tasklist page"
        redirect (controller : 'task', action:'displayTaskPage')
//        render(view: 'index.gsp')
    }
}
