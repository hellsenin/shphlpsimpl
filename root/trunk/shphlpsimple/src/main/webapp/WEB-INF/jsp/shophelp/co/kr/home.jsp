<%@ page language="java" errorPage="/WEB-INF/jsp/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ include file="variable.jsp"%>
<head>
<title><fmt:message key="home.title" /></title>
<link type="text/css" rel="stylesheet" href="${ctx}/styles/lightbox.css" />
</head>
<p><fmt:message key="hangul.test" /></p>
<div><br>
This is Home <br>
<fmt:message bundle="${usrlistmsg}" key="userList.title" /> <br>
여기는 홈 <br>
서비스 준비 중입니다. <br>
<div class="message"><span id="cnt" style="font-weight: bold">0</span> seconds since last page refresh.</div>

</div>

<script>
	function onLoad(){
		
	}
	
	var sec = 0;
	function counter() {
		setTimeout("counter();", 1000);
		document.getElementById("cnt").innerHTML = sec++;
	}
	counter();
	
	
</script>