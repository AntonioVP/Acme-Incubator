<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="anonymous.technology-record.list.label.title" width="40%" path="title"/>
	<acme:list-column code="anonymous.technology-record.list.label.activitySector" width="30%" path="activitySector"/>
	<acme:list-column code="anonymous.technology-record.list.label.stars" width="30%" path="stars"/>
</acme:list>