
<%@ page import="taskmanager.Task" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main">
        <g:javascript>
            window.appContext = '${request.contextPath}';
        </g:javascript>
        <g:javascript library="urlShortener" />
        <g:set var="entityName" value="${message(code: 'task.label', default: 'Task')}" />
        <style>
            input[type=submit] {
            color:#08233e;
            font:2.4em Futura, ‘Century Gothic’, AppleGothic, sans-serif;
            font-size:70%;
            padding:14px;
            background:url(overlay.png) repeat-x center #ffcc00;
            background-color:rgba(255,204,0,1);
            border:1px solid #ffcc00;
            -moz-border-radius:10px;
            -webkit-border-radius:10px;
            border-radius:10px;
            border-bottom:1px solid #9f9f9f;
            -moz-box-shadow:inset 0 1px 0 rgba(255,255,255,0.5);
            -webkit-box-shadow:inset 0 1px 0 rgba(255,255,255,0.5);
            box-shadow:inset 0 1px 0 rgba(255,255,255,0.5);
            cursor:pointer;
            }
            input[type=submit]:hover {
            background-color:rgba(255,204,0,0.8);
            }
        </style>
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>

<!-- main to do list index -->
        <div id="header">
            <p style="text-align:center; margin-top:0px; margin-bottom:0px; padding:0px;">
                <img src="${resource(dir:'images',file:'todolistheader.jpg')}" alt="header" />
            </p>
        </div>
        <a href="#list-task" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                </ul>
            </div>
            <div id="list-task" class="content scaffold-list" role="main">
                <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <table>
                <thead>
                    <tr>

                        <g:sortableColumn property="subject" title="${message(code: 'task.subject.label', default: 'Subject')}" />

                        <g:sortableColumn property="dueDate" title="${message(code: 'task.dueDate.label', default: 'Due Date')}" />

                        <g:sortableColumn property="finished" title="${message(code: 'task.finished.label', default: 'Finished')}" />

                    </tr>
                </thead>
                <tbody>
                    <g:each in="${taskInstanceList}" status="i" var="taskInstance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                            <td><g:link action="show" id="${taskInstance.id}">${fieldValue(bean: taskInstance, field: "subject")}</g:link></td>

                            <td><g:formatDate date="${taskInstance.dueDate}" /></td>

                            <td><g:formatBoolean boolean="${taskInstance.finished}" /></td>

                        </tr>
                    </g:each>
                </tbody>
            </table>
            <div class="pagination">
                <g:paginate total="${taskInstanceCount ?: 0}" />
            </div>
        </div>
        <div>
            <input id="shareButtonId" onClick= "shareUrl();" type="submit" value="Share your To-Do List">
            <input id="shareUrlId" type="text" name="ShareURL" value="${shortUrl}">
            <br>
        </div>
    </body>
</html>
