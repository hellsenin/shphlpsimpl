<%@ page language="java" errorPage="/WEB-INF/jsp/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ include file="variable.jsp"%>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="UTF-8">
<head>
	<title>Welcome <fmt:message key="webapp.name" /> - <decorator:title default="Welcome" /></title>
	<%@ include file="hearder.jsp"%>
	<decorator:head />
</head>

<body>
<a name="top"></a>
<!-- page -->
<div id="page">
    <!-- Title -->
    <%@ include file="top.jsp"%>
	<!-- Menu-->
	<%@ include file="menu.jsp"%>
	
	<!-- content -->
	<div id="content">
	
	   <!-- Main-->
		<div id="main">
			<h1><decorator:title /></h1>
			<%@ include file="messages.jsp"%> 
			<decorator:body /><!-- ContentMain -->
			<br></br>
			<div id="underground"><decorator:getProperty property="page.underground" /></div>
		</div>
	   <!-- Sub-->
       <!------------wide----------->
	   
	</div>
	<!-- end content -->
	
	<!-- footer -->
	<%@ include file="footer.jsp"%>
	<!-- end footer -->
</div>
<!-- end page -->

</body>
</html>
