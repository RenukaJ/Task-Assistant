import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_taskManager_tasklandingPage_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/landingPage.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
expressionOut.print(request.contextPath)
printHtmlPart(4)
})
invokeTag('javascript','g',14,[:],2)
printHtmlPart(5)
invokeTag('javascript','g',59,['library':("urlShortener")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',60,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(6, 3)
invokeTag('captureTitle','sitemesh',61,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',61,[:],2)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',62,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(resource(dir:'images',file:'headerGrails.png'))
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
expressionOut.print(resource(dir:'images',file:'urlshortner.png'))
printHtmlPart(11)
})
invokeTag('link','g',70,['controller':("task"),'action':("displayURLPage")],2)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(12)
expressionOut.print(resource(dir:'images',file:'todo.jpg'))
printHtmlPart(13)
})
invokeTag('link','g',71,['controller':("task"),'action':("index")],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(12)
expressionOut.print(resource(dir:'images',file:'todo.jpg'))
printHtmlPart(13)
})
invokeTag('link','g',76,['controller':("task"),'action':("index")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(12)
expressionOut.print(resource(dir:'images',file:'urlshortner.png'))
printHtmlPart(13)
})
invokeTag('link','g',77,['controller':("task"),'action':("displayURLPage")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',79,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1481141366000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
