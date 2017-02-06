import taskmanager.Task
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_taskManager_task_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: taskInstance, field: 'subject', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("task.subject.label"),'default':("Subject")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("subject"),'required':(""),'value':(taskInstance?.subject)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: taskInstance, field: 'dueDate', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("task.dueDate.label"),'default':("Due Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',19,['name':("dueDate"),'precision':("day"),'value':(taskInstance?.dueDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: taskInstance, field: 'finished', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("task.finished.label"),'default':("Finished")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',28,['name':("finished"),'value':(taskInstance?.finished)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1481016220000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
