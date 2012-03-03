<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
	/** 
	 * @Class Name : EgovDeptSearch.java
	 * @Description : EgovDeptSearch Search 화면
	 * @Modification Information
	 * @
	 * @  수정일                     수정자               수정내용
	 * @ ----------    --------    ---------------------------
	 * @ 2009.03.26    lee.m.j     최초 생성
	 *
	 *  @author lee.m.j
	 *  @since 2009.03.26
	 *  @version 1.0
	 *  @see
	 *  
	 */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="<c:url value='/css/egovframework/com/cmm/com.css' />"
	rel="stylesheet" type="text/css">
<title>무료쿠폰 무한배포</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
}

img {
	border: 0;
}

#java_ex {
	margin: 0;
	padding: 0;
	width: auto;
	margin: 0 auto 0 auto;
}

#java_ex ul {
	margin: 5px 0 5px 0;
	width: 100%;
	border-bottom: 1px solid #cccccc;
	padding: 0 0 5px 0;
}

#java_ex ul li {
	display: inline;
	list-style: none;
	font-size: 12px
}

#java_ex ul.non_btm {
	border-bottom: 0;
}

#java_ex h1 {
	font-size: 14px;
}
</style>
<style type="text/css">
/* 공통 (각자취향대로) S */
html,body {
	margin: 0px;
	padding: 0px;
	width: 100%;
	height: 100%;
	font-size: 12px;
	font-family: 굴림, Gulim, sans-serif;
	line-height: 160%;
	background-color: #fff;
}

h1,h2,h3,h4,h5,h6,ul,ol,li,dl,dt,dd,form,p {
	margin: 0;
	padding: 0;
	list-style: none;
	font-size: 12px;
	font-family: 굴림, Gulim, sans-serif;
	font-weight: normal;
}

div,ul,li,p,tr,td,th {
	margin: 0;
	padding: 0;
	font-family: 굴림, Gulim, sans-serif;
	color: #666;
	font-size: 12px;
}

img {
	border: 0;
	vertical-align: middle;
} /* 무조건 middle */
a {
	color: #666;
	text-decoration: none;
	cursor: pointer;
}

a:hover,a:active {
	color: #4D74B0;
	text-decoration: none;
}

select {
	overflow: visible;
}

input,textarea,select {
	vertical-align: middle;
	font-family: 굴림, Gulim, sans-serif;
	color: #666;
	font-size: 12px;
}
/* 공통 E */

/* 팝업 레이어 S */
.popupLayer {
	position: absolute;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	z-index: 100;
	-ms-filter: alpha(opacity = 50);
	filter: alpha(opacity = 50);
	opacity: 0.3;
	-moz-opacity: 0.3;
}

.popupLayer .back {
	position: absolute;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	background: #000;
	z-index: 101;
}

.popup_box {
	position: absolute;
	left: 50%;
	top: 50%;
	z-index: 102;
	background: #fff;
}

.popup_box .popup_contents {
	position: absolute;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	z-index: 102;
}

.popup_box .popup_contents ul {
	width: 100%;
}

.popup_box .popup_contents ul li {
	display: inline;
	list-style: none;
}

.popupLayer iframe,.popup_box iframe {
	position: absolute;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
}
/* 팝업 레이어 E */
</style>


<script>
	function copyit(theField) {
		var tempval = eval("document." + theField);
		tempval.focus();
		tempval.select();
		therange = tempval.createTextRange();
		therange.execCommand("Copy");
		
		alert("[ Crt + V ]로 붙여 넣으세요.");
	    location.href = "<c:url value='/omnivore/pb/cpn/CouponCreation.do' />";
	}
</script>
</head>

<body>
	<form name='form1'>
		<textarea name='text1'>${SHPTEMP.tmp_col00}</textarea>
		<input type="button" value="copy" onclick="copyit('form1.text1');">
	</form>
			
</body>
</html>
