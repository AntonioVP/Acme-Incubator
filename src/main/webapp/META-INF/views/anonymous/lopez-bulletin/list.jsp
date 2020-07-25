<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.lopez-bulletin.list.label.moment" width="20%" path="moment"/>
	<acme:list-column code="anonymous.lopez-bulletin.list.label.author" width="20%" path="author"/>
	<acme:list-column code="anonymous.lopez-bulletin.list.label.text" width="60%" path="text"/>
</acme:list>