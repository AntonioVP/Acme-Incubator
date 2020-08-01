<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="authenticated.tool-record.form.label.title" path="title"/>
	<acme:form-textbox code="authenticated.tool-record.form.label.activitySector" path="activitySector"/>
	<acme:form-textbox code="authenticated.tool-record.form.label.nameInventor" path="nameInventor"/>
	<acme:form-textarea code="authenticated.tool-record.form.label.description" path="description"/>
	<acme:form-url code="authenticated.tool-record.form.label.website" path="website"/>
	<acme:form-textbox code="authenticated.tool-record.form.label.email" path="email"/>
	<acme:form-checkbox code="authenticated.tool-record.form.label.openSource" path="openSource"/>
	<acme:form-integer code="authenticated.tool-record.form.label.stars" path="stars"/>
	
  	<acme:form-return code="authenticated.tool-record.form.button.return"/>
</acme:form>