	<div id="menu">
		<h2 class="accessibility">Navigation</h2>
		<ul class="clearfix">
			<li><a href="${ctx}/home/home.html" title="Home"><span><fmt:message key="menu.home" /></span></a></li>
			<li><a href="${ctx}/#" title="Invoice"><span><fmt:message key="menu.invoice" /></span></a></li>
			<li><a href="${ctx}/#" title="Goods"><span><fmt:message key="menu.goods" /></span></a></li>
			<li><a href="${ctx}/#" title="Sales"><span><fmt:message key="menu.sales" /></span></a></li>
			<li><a href="${ctx}/gener/spec.html" title="Spec"><span><fmt:message key="menu.spec" /></span></a></li>
			<li><a href="${ctx}/gener/jarList.html" title="Jar"><span><fmt:message key="menu.jarlist" /></span></a></li>
			<li><a href="${ctx}/gener/jarList.html" title="Jar"><span><fmt:message key="menu.jarlist" /></span></a></li>
		<%if(login!=null){%> 
			<li><a href="${ctx}/home/home.html" title="admin"><span id="admin"><fmt:message key="menu.admin" /></span></a></li>
		<%}%>			
		</ul>
	</div>