<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.francoBulletin.label.title" width="25%" path="title"/>
	<acme:list-column code="anonymous.francoBulletin.label.text" width="75%" path="text"/>
</acme:list>