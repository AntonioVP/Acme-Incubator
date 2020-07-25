<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.vidalBulletin.list.label.type" path="type" width="10%"/>
	<acme:list-column code="anonymous.vidalBulletin.list.label.title" path="title" width="20%"/>
	<acme:list-column code="anonymous.vidalBulletin.list.label.author" path="author" width="20%"/>
	<acme:list-column code="anonymous.vidalBulletin.list.label.text" path="text" width="50%"/>
</acme:list>