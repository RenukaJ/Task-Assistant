import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_taskManager_taskurlShorteningPage_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/urlShorteningPage.gsp" }
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
printHtmlPart(2)
invokeTag('javascript','g',15,['library':("urlShortener")],-1)
printHtmlPart(5)
invokeTag('captureMeta','sitemesh',38,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(6, 3)
invokeTag('captureTitle','sitemesh',39,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',39,[:],2)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',40,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(resource(dir:'images',file:'urlShortenerHeader.png'))
printHtmlPart(9)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(10)
invokeTag('message','g',50,['code':("default.home.label")],-1)
printHtmlPart(11)
expressionOut.print(longUrl)
printHtmlPart(12)
expressionOut.print(shortUrl)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1481146218000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
