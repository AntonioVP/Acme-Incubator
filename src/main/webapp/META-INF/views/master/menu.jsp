<%--
- menu.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java" import="acme.framework.helpers.PrincipalHelper,acme.entities.roles.Provider,acme.entities.roles.Consumer"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:menu-bar code="master.menu.home">
	
	<!-- Parte izquierda del menu -->
	<acme:menu-left>
		
		<!-- Cosas de Anonymous -->
		<acme:menu-option code="master.menu.anonymous" access="isAnonymous()">
		
			<acme:menu-suboption code="master.menu.anonymous.notice-list" action="/anonymous/notice/list"/>
			
			<acme:menu-separator/>
			
			<acme:menu-suboption code="master.menu.anonymous.favourite-link" action="http://www.example.com/"/>
			<acme:menu-suboption code="master.menu.anonymous.favourite-link-Pablo" action="https://www.youtube.com/watch?v=tVuvTKMpDcM"/>
			<acme:menu-suboption code="master.menu.anonymous.favourite-link-Gabriel" action="https://www.github.com/"/>
      		<acme:menu-suboption code="master.menu.anonymous.favourite.antonioV" action="https://www.chess.com"/>
      		<acme:menu-suboption code="master.menu.anonymous.favourite-link-Thibaut" action="https://i.imgflip.com/48cc3w.jpg"/>
      		
      		<acme:menu-separator/>
			
			<acme:menu-suboption code="master.menu.anonymous.francoBulletin-list" action="/anonymous/franco-bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.francoBulletin-create" action="/anonymous/franco-bulletin/create"/>
			
			<acme:menu-separator/>
			
			<acme:menu-suboption code="master.menu.anonymous.gutierrezBulletin-list" action="/anonymous/gutierrez-bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.gutierrezBulletin-create" action="/anonymous/gutierrez-bulletin/create"/>
			
			<acme:menu-separator/>

			<acme:menu-suboption code="master.menu.anonymous.vidalBulletin.list" action="/anonymous/vidal-bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.vidalBulletin.form" action="/anonymous/vidal-bulletin/create"/>
			
			<acme:menu-separator/>
      
			<acme:menu-suboption code="master.menu.anonymous.lopezBulletin-list" action="/anonymous/lopez-bulletin/list"/>
			<acme:menu-suboption code="master.menu.anonymous.lopezBulletin-create" action="/anonymous/lopez-bulletin/create"/>

			
			<acme:menu-separator/>
			
			<acme:menu-suboption code="master.menu.anonymous.technology-record.list" action="/anonymous/technology-record/list"/>
			
			<acme:menu-separator/>
			
			<acme:menu-suboption code="master.menu.anonymous.notice-list" action="/anonymous/notice/list"/>

		</acme:menu-option>

    <!-- MENU AUTHENTICATED -->
    
		<acme:menu-option code="master.menu.authenticated" access="isAuthenticated()">
			<acme:menu-suboption code="master.menu.authenticated.technology-record.list" action="/authenticated/technology-record/list"/>
			<acme:menu-separator/>
			<acme:menu-suboption code="master.menu.authenticated.tool-record.list" action="/authenticated/tool-record/list"/>
      <acme:menu-separator/>
      <acme:menu-suboption code="master.menu.authenticated.challenge" action="/authenticated/challenge/list"/>
      <acme:menu-separator/>
      <acme:menu-suboption code="master.menu.authenticated.inquiry" action="/authenticated/inquiry/list"/>
      <acme:menu-separator/>
			<acme:menu-suboption code="master.menu.authenticated.notice-list" action="/authenticated/notice/list"/>
      <acme:menu-separator/>
			<acme:menu-suboption code="master.menu.authenticated.overture-list" action="/authenticated/overture/list"/>
		</acme:menu-option>


    <!-- MENU ADMIN -->

		<acme:menu-option code="master.menu.administrator" access="hasRole('Administrator')">
			<acme:menu-suboption code="master.menu.administrator.dashboard.show" action="/administrator/dashboard/show"/>
			<acme:menu-suboption code="master.menu.administrator.custom-parameter" action="/administrator/custom-parameter/show"/>
			<acme:menu-separator/>
			<acme:menu-suboption code="master.menu.administrator.user-accounts" action="/administrator/user-account/list"/>
			<acme:menu-separator/>
			<acme:menu-suboption code="master.menu.administrator.notice-list" action="/administrator/notice/list"/>
			<acme:menu-separator/>
			<acme:menu-suboption code="master.menu.administrator.shutdown" action="/master/shutdown"/>
		</acme:menu-option>
		
		
		<acme:menu-option code="master.menu.provider" access="hasRole('Provider')">
			<acme:menu-suboption code="master.menu.provider.favourite-link" action="http://www.example.com/"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.consumer" access="hasRole('Consumer')">
			<acme:menu-suboption code="master.menu.consumer.favourite-link" action="http://www.example.com/"/>
		</acme:menu-option>
	</acme:menu-left>

	<!-- Parte derecha del menu -->
	<acme:menu-right>
		<acme:menu-option code="master.menu.sign-up" action="/anonymous/user-account/create" access="isAnonymous()"/>
		<acme:menu-option code="master.menu.sign-in" action="/master/sign-in" access="isAnonymous()"/>

		<acme:menu-option code="master.menu.user-account" access="isAuthenticated()">
			<acme:menu-suboption code="master.menu.authenticated.inquiry" action="/authenticated/inquiry/list"/>
			<acme:menu-separator/>
			<acme:menu-suboption code="master.menu.user-account.general-data" action="/authenticated/user-account/update"/>
			<acme:menu-suboption code="master.menu.user-account.become-provider" action="/authenticated/provider/create" access="!hasRole('Provider')"/>
			<acme:menu-suboption code="master.menu.user-account.provider" action="/authenticated/provider/update" access="hasRole('Provider')"/>
			<acme:menu-suboption code="master.menu.user-account.become-consumer" action="/authenticated/consumer/create" access="!hasRole('Consumer')"/>
			<acme:menu-suboption code="master.menu.user-account.consumer" action="/authenticated/consumer/update" access="hasRole('Consumer')"/>
		</acme:menu-option>

		<acme:menu-option code="master.menu.sign-out" action="/master/sign-out" access="isAuthenticated()"/>
	</acme:menu-right>
</acme:menu-bar>
