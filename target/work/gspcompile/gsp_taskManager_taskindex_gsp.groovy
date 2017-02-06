import taskmanager.Task
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_taskManager_taskindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/index.gsp" }
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
createTagBody(2, {->
printHtmlPart(3)
expressionOut.print(request.contextPath)
printHtmlPart(4)
})
invokeTag('javascript','g',9,[:],2)
printHtmlPart(2)
invokeTag('javascript','g',10,['library':("urlShortener")],-1)
printHtmlPart(2)
invokeTag('set','g',11,['var':("entityName"),'value':(message(code: 'task.label', default: 'Task'))],-1)
printHtmlPart(5)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',34,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',34,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',34,[:],2)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',35,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
expressionOut.print(resource(dir:'images',file:'todolistheader.jpg'))
printHtmlPart(8)
invokeTag('message','g',44,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(9)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(10)
invokeTag('message','g',47,['code':("default.home.label")],-1)
printHtmlPart(11)
createTagBody(2, {->
invokeTag('message','g',48,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',48,['class':("create"),'action':("create")],2)
printHtmlPart(12)
invokeTag('message','g',52,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(13)
if(true && (flash.message)) {
printHtmlPart(14)
expressionOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('sortableColumn','g',60,['property':("subject"),'title':(message(code: 'task.subject.label', default: 'Subject'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',62,['property':("dueDate"),'title':(message(code: 'task.dueDate.label', default: 'Due Date'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',64,['property':("finished"),'title':(message(code: 'task.finished.label', default: 'Finished'))],-1)
printHtmlPart(18)
loop:{
int i = 0
for( taskInstance in (taskInstanceList) ) {
printHtmlPart(19)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(20)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: taskInstance, field: "subject"))
})
invokeTag('link','g',72,['action':("show"),'id':(taskInstance.id)],3)
printHtmlPart(21)
invokeTag('formatDate','g',74,['date':(taskInstance.dueDate)],-1)
printHtmlPart(21)
invokeTag('formatBoolean','g',76,['boolean':(taskInstance.finished)],-1)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',83,['total':(taskInstanceCount ?: 0)],-1)
printHtmlPart(24)
expressionOut.print(shortUrl)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',91,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1481147204000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
