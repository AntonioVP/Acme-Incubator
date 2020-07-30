<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.custom-parameter.form.label.spamWordsEn" path="spamWordsEn"/>
	<acme:form-textbox code="administrator.custom-parameter.form.label.spamWordsEs" path="spamWordsEs"/>
	<acme:form-double code="administrator.custom-parameter.form.label.spamThreshold" path="spamThreshold"/>
	<acme:form-textbox code="administrator.custom-parameter.form.label.sectors" path="sectors"/>
	
	<acme:form-return code="administrator.custom-parameter.form.button.return"/>
</acme:form>