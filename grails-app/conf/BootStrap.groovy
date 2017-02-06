
import taskmanager.Task

class BootStrap {

    def init = { servletContext ->
        if(!Task.count()){
            new Task(subject: 'Check emails', dueDate: '', finished: 'true').save(failOnError: true)
            new Task(subject: 'Buy groceries', dueDate: '', finished: 'false').save(failOnError: true)
            
        }
    }
    def destroy = {
    }
}
