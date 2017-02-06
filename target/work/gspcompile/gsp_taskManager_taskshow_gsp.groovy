import taskmanager.Task
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_taskManager_taskshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'task.label', default: 'Task'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(resource(dir:'images',file:'todolistheader.jpg'))
printHtmlPart(5)
invokeTag('message','g',16,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(7)
invokeTag('message','g',19,['code':("default.home.label")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',20,['class':("list"),'action':("index")],2)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('message','g',21,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',21,['class':("create"),'action':("create")],2)
printHtmlPart(10)
invokeTag('message','g',25,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (taskInstance?.subject)) {
printHtmlPart(15)
invokeTag('message','g',33,['code':("task.subject.label"),'default':("Subject")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',35,['bean':(taskInstance),'field':("subject")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (taskInstance?.dueDate)) {
printHtmlPart(19)
invokeTag('message','g',42,['code':("task.dueDate.label"),'default':("Due Date")],-1)
printHtmlPart(20)
invokeTag('formatDate','g',44,['date':(taskInstance?.dueDate)],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (taskInstance?.finished)) {
printHtmlPart(21)
invokeTag('message','g',51,['code':("task.finished.label"),'default':("Finished")],-1)
printHtmlPart(22)
invokeTag('formatBoolean','g',53,['boolean':(taskInstance?.finished)],-1)
printHtmlPart(17)
}
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
createTagBody(3, {->
invokeTag('message','g',61,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',61,['class':("edit"),'action':("edit"),'resource':(taskInstance)],3)
printHtmlPart(25)
invokeTag('actionSubmit','g',62,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(26)
})
invokeTag('form','g',64,['url':([resource:taskInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',66,[:],1)
printHtmlPart(28)
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
