<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/app/cmm_JSP.jsp"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
<title>shphlp</title>
</head>



<frameset frameborder="0" framespacing="0" rows="40, *, 43">
	<frame name="_top" src="<c:url value='/Top.do' />" scrolling="no" title="헤더">
		<frameset frameborder="0" framespacing="0" cols="20%, 80%">
			<frame name="_left" src="<c:url value='/Left.do' />" scrolling="yes" title="메뉴페이지">
			<frame name="_content" src="<c:url value='/Content.do' />" title="메인페이지">
		</frameset>
	<frame name="_bottom" src="<c:url value='/Bottom.do' />" scrolling="no" title="푸터">
</frameset>
