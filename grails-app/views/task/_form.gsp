<%@ page import="taskmanager.Task" %>



<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'subject', 'error')} required">
	<label for="subject">
		<g:message code="task.subject.label" default="Subject" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="subject" required="" value="${taskInstance?.subject}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'dueDate', 'error')} required">
	<label for="dueDate">
		<g:message code="task.dueDate.label" default="Due Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dueDate" precision="day"  value="${taskInstance?.dueDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'finished', 'error')} ">
	<label for="finished">
		<g:message code="task.finished.label" default="Finished" />
		
	</label>
	<g:checkBox name="finished" value="${taskInstance?.finished}" />

</div>

