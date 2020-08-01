<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="authenticated.inquiry.list.label.title" width="30%" path="title"/>
	<acme:list-column code="authenticated.inquiry.list.label.creation" width="20%" path="creation"/>
	<acme:list-column code="authenticated.inquiry.list.label.deadline" width="20%" path="deadline"/>
	<acme:list-column code="authenticated.inquiry.list.label.minMoney" width="15%" path="minMoney"/>
	<acme:list-column code="authenticated.inquiry.list.label.maxMoney" width="15%" path="maxMoney"/>
</acme:list>