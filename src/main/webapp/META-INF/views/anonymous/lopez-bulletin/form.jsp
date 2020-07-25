<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.lopez-bulletin.form.label.author" path="author"/>
	<acme:form-textbox code="anonymous.lopez-bulletin.form.label.text" path="text"/>
	
	<acme:form-submit code="anonymous.lopez-bulletin.form.button.create" action="/anonymous/lopez-bulletin/create"/>
  	<acme:form-return code="anonymous.lopez-bulletin.form.button.return"/>
</acme:form>