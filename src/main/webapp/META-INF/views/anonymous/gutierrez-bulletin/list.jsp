<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.gutierrezBulletin.label.name" width="25%" path="name"/>
	<acme:list-column code="anonymous.gutierrezBulletin.label.advertise" width="75%" path="advertise"/>
</acme:list>