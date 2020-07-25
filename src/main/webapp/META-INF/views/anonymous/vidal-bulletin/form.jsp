<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-select code="anonymous.vidalBulletin.form.label.type" path="type">
		<acme:form-option code="anonymous.vidalBulletin.form.label.type.forReal" value="ForReal"/>
		<acme:form-option code="anonymous.vidalBulletin.form.label.type.bigNews" value="BigNews"/>
		<acme:form-option code="anonymous.vidalBulletin.form.label.type.joke" value="Joke"/>
	</acme:form-select>
	<acme:form-textbox code="anonymous.vidalBulletin.form.label.title" path="title"/>
	<acme:form-textbox code="anonymous.vidalBulletin.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.vidalBulletin.form.label.text" path="text"/>
	
	<acme:form-submit code="anonymous.vidalBulletin.form.button.create" action="/anonymous/vidal-bulletin/create"/>
	<acme:form-return code="anonymous.vidalBulletin.form.button.return"/>
</acme:form>