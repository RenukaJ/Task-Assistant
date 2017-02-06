package taskmanager

class Task {

    String subject
    Date dueDate
    Boolean finished
    
//    static belongsTo = [User]
//    
    static constraints = {
        subject(blank:false)
        dueDate(nullable:true)
        finished(nullable:true)
    }
}
