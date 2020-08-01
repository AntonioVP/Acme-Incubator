<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="authenticated.overture.list.label.title" width="40%" path="title"/>
	<acme:list-column code="authenticated.overture.list.label.creation" width="30%" path="creation"/>
	<acme:list-column code="authenticated.overture.list.label.deadline" width="30%" path="deadline"/>
</acme:list>