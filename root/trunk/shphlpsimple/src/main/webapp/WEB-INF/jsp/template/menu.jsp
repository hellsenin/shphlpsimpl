<!--http://dynamicdrive.com/dynamicindex1/droptabmenu.htm-->
		<h2 class="accessibility">Navigation</h2>

		<div id="moonmenu" class="halfmoon">
			<ul class="clearfix">
<!--					<li><a href="${ctx}/home/home.html" title="Home"><span><fmt:message key="menu.home" /></span></a></li>-->
					<li><a href="${ctx}<%=Constants.HOME_home_ACTION %>" title="Home"><span><fmt:message key="menu.home" /></span></a></li>
					<li><a href="${ctx}/#" title="Invoice" rel="dropmenu1_e"><span><fmt:message key="menu.invoice" /></span></a></li>
					<li><a href="${ctx}/#" title="Goods" rel="dropmenu2_e"><span><fmt:message key="menu.goods" /></span></a></li>
					<li><a href="${ctx}/#" title="Sales" rel="dropmenu3_e"><span><fmt:message key="menu.sales" /></span></a></li>
				<%
				if(login!=null){
				%> 
					<li><a href="${ctx}/gener/adminMain.html" title="admin" rel="dropmenu4_e"><span id="admin"><fmt:message key="menu.admin" /></span></a></li>
					<li><a href="${ctx}/home/home.html" title="evolution" rel="dropmenu5_e"><span id="evolution"><fmt:message key="menu.evolution" /></span></a></li>
				<%}%>			
			</ul>
		</div>
		
		<br style="clear: left;" />
		
		<!--1st drop down menu -->                                                   
		<div id="dropmenu1_e" class="dropmenudiv_e">
			<a href="http://www.dynamicdrive.com/style/csslibrary/category/C1/">Horizontal CSS Menus</a>
			<a href="http://www.dynamicdrive.com/style/csslibrary/category/C2/">Vertical CSS Menus</a>
		</div>
		
		<!--2nd drop down menu -->                                                
		<div id="dropmenu2_e" class="dropmenudiv_e" style="width: 150px;">
			<a href="http://www.cssdrive.com">CSS Drive</a>
			<a href="http://www.javascriptkit.com">JavaScript Kit</a>
		</div>
		
		<!--3nd drop down menu -->                                                
		<div id="dropmenu3_e" class="dropmenudiv_e" style="width: 150px;">
			<a href="http://www.cssdrive.com">CSS Drive</a>
			<a href="http://www.javascriptkit.com">JavaScript Kit</a>
			<a href="http://www.codingforums.com">Coding Forums</a>
			<a href="http://www.javascriptkit.com/jsref/">JavaScript Reference</a>
		</div>
		
		<!--4nd drop down menu -->                                                
		<div id="dropmenu4_e" class="dropmenudiv_e" style="width: 150px;">
			<a href="${ctx}<%=Constants.MEMBER_getMembers_ACTION %>" title="memberlist"><span><fmt:message key="menu.admin.memberlist" /></span></a>
			<a href="${ctx}<%=Constants.GROUP_getGroups_ACTION %>" title="memberlist"><span><fmt:message key="menu.admin.grouplist" /></span></a>
			<a href="${ctx}<%=Constants.MEMBER_getMembers_ACTION %>" title="memberlist"><span><fmt:message key="menu.admin.rolelist" /></span></a>
			<a href="${ctx}<%=Constants.MEMBER_getMembers_ACTION %>" title="memberlist"><span><fmt:message key="menu.admin.actionlist" /></span></a>
		</div>
		
		<!--5nd drop down menu -->                                                
		<div id="dropmenu5_e" class="dropmenudiv_e" style="width: 150px;">
			<a href="${ctx}/gener/spec.html" title="Spec"><span><fmt:message key="menu.evolution.spec" /></span></a>
			<a href="${ctx}/gener/jarList.html" title="Jar"><span><fmt:message key="menu.evolution.jarlist" /></span></a>
		</div>
		
		<script type="text/javascript">
		//SYNTAX: tabdropdown.init("menu_id", [integer OR "auto"])
		tabdropdown.init("moonmenu", 0)
		</script>
 