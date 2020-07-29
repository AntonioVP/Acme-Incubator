<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.challenge.form.label.title" path="title"/>
	<acme:form-textbox code="authenticated.challenge.form.label.deadline" path="deadline"/>
	<acme:form-textbox code="authenticated.challenge.form.label.description" path="description"/>
	<acme:form-money code="authenticated.challenge.form.label.rewardExpert" path="rewardExpert"/>
	<acme:form-money code="authenticated.challenge.form.label.rewardAverage" path="rewardAverage"/>
	<acme:form-money code="authenticated.challenge.form.label.rewardRookie" path="rewardRookie"/>
	
  	<acme:form-return code="authenticated.challenge.form.button.return"/>
</acme:form>