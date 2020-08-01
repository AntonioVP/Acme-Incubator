<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-integer code="administrator.dashboard.form.label.totalNotices" path="totalNotices"/>
	<acme:form-integer code="administrator.dashboard.form.label.totalTechnologyRecords" path="totalTechnologyRecords"/>
	<acme:form-integer code="administrator.dashboard.form.label.totalToolRecords" path="totalToolRecords"/>
	
	<acme:form-double code="administrator.dashboard.form.label.minMoneyActiveInquiries" path="minMoneyActiveInquiries"/>
	<acme:form-double code="administrator.dashboard.form.label.maxMoneyActiveInquiries" path="maxMoneyActiveInquiries"/>
	<acme:form-double code="administrator.dashboard.form.label.avgMinMoneyActiveInquiries" path="avgMinMoneyActiveInquiries"/>
	<acme:form-double code="administrator.dashboard.form.label.avgMaxMoneyActiveInquiries" path="avgMaxMoneyActiveInquiries"/>
	<acme:form-double code="administrator.dashboard.form.label.stdMinMoneyActiveInquiries" path="stdMinMoneyActiveInquiries"/>
	<acme:form-double code="administrator.dashboard.form.label.stdMaxMoneyActiveInquiries" path="stdMaxMoneyActiveInquiries"/>
	
	<acme:form-double code="administrator.dashboard.form.label.minMoneyActiveOvertures" path="minMoneyActiveOvertures"/>
	<acme:form-double code="administrator.dashboard.form.label.maxMoneyActiveOvertures" path="maxMoneyActiveOvertures"/>
	<acme:form-double code="administrator.dashboard.form.label.avgMinMoneyActiveOvertures" path="avgMinMoneyActiveOvertures"/>
	<acme:form-double code="administrator.dashboard.form.label.avgMaxMoneyActiveOvertures" path="avgMaxMoneyActiveOvertures"/>
	<acme:form-double code="administrator.dashboard.form.label.stdMinMoneyActiveOvertures" path="stdMinMoneyActiveOvertures"/>
	<acme:form-double code="administrator.dashboard.form.label.stdMaxMoneyActiveOvertures" path="stdMaxMoneyActiveOvertures"/>
	
	
	<h2>
		<acme:message code="administrator.dashboard.form.label.chart.technologyBySector" />
	</h2>
	
	<div>
		<canvas id="canvas1"></canvas>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			var data = {
					labels : [
						
						<jstl:forEach var="item" items="${technologiesGroupBySector}">
							"<jstl:out value="${item[1]}"/>",
						</jstl:forEach>
					],
					datasets : [
						{
							backgroundColor: "#333333",
							data : [
							<jstl:forEach var="item" items="${technologiesGroupBySector}">
								"<jstl:out value="${item[0]}"/>",
							</jstl:forEach>
							]
						}						
					]
			};
			var options = {
					legend : {
						display : false
					},
					scales : {
						yAxes:[{
							ticks:{
								suggestedMin:0.0
							}
						}]
					}
			};
			var canvas, context;
			
			canvas = document.getElementById("canvas1");
			context = canvas.getContext("2d");
			new Chart(context, {
				type : "bar",
				data : data,
				options : options
			});
		});
	</script>
	
	
	<h2>
		<acme:message code="administrator.dashboard.form.label.chart.ratio-technologies" />
	</h2>
	
	<div>
		<canvas id="canvas2"></canvas>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			var data = {
					labels : [
						"Open Source", "Closed Source"
					],
					datasets : [
						{	
						
							backgroundColor:[
								"#AAFFAA", "#FFAAAA"
							],
							borderColor: "#000000",
							data : [
								<jstl:forEach var="item" items="${ratioOpenClosedSourceTechnologies}">
									"<jstl:out value="${item[0]}"/>",
								</jstl:forEach>
							]
						
						},
						{
							
						}
					]
			};
			var options = {
					legend : {
						display : false
					}
			};
			var canvas, context;
			
			canvas = document.getElementById("canvas2");
			context = canvas.getContext("2d");
			new Chart(context, {
				type : "pie",
				data : data,
				options : options
			});
		});
	</script>
	
	
	<h2>
		<acme:message code="administrator.dashboard.form.label.chart.toolBySector" />
	</h2>
	
	<div>
		<canvas id="canvas3"></canvas>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			var data = {
					labels : [
						
						<jstl:forEach var="item" items="${toolsGroupBySector}">
							"<jstl:out value="${item[1]}"/>",
						</jstl:forEach>
					],
					datasets : [
						{
							backgroundColor: "#333333",
							data : [
							<jstl:forEach var="item" items="${toolsGroupBySector}">
								"<jstl:out value="${item[0]}"/>",
							</jstl:forEach>
							]
						}						
					]
			};
			var options = {
					legend : {
						display : false
					},
					scales : {
						yAxes:[{
							ticks:{
								suggestedMin:0.0
							}
						}]
					}
			};
			var canvas, context;
			
			canvas = document.getElementById("canvas3");
			context = canvas.getContext("2d");
			new Chart(context, {
				type : "bar",
				data : data,
				options : options
			});
		});
	</script>
	
	
	<h2>
		<acme:message code="administrator.dashboard.form.label.chart.ratio-tools" />
	</h2>
	
	<div>
		<canvas id="canvas4"></canvas>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			var data = {
					labels : [
						"Open Source", "Closed Source"
					],
					datasets : [
						{	
						
							backgroundColor:[
								"#AAFFAA", "#FFAAAA"
							],
							borderColor: "#000000",
							data : [
								<jstl:forEach var="item" items="${ratioOpenClosedSourceTools}">
									"<jstl:out value="${item[0]}"/>",
								</jstl:forEach>
							]
						
						},
						{
							
						}
					]
			};
			var options = {
					legend : {
						display : false
					}
			};
			var canvas, context;
			
			canvas = document.getElementById("canvas4");
			context = canvas.getContext("2d");
			new Chart(context, {
				type : "pie",
				data : data,
				options : options
			});
		});
	</script>
	
</acme:form>