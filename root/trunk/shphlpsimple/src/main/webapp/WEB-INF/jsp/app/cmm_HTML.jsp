<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>


<%
	response.setContentType("text/html; charset=UTF-8");
	response.setHeader("pragma","no-cache");
	request.setCharacterEncoding("UTF-8");
	
	out.print("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">");
%>

<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>
<c:set var="ctx" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}"/>


<c:set var="jsBtnAdd" value="${pmisRecord.psave_fl}"/>
<c:set var="jsBtnSave" value="${pmisRecord.psave_fl}"/>
<c:set var="jsBtnModify" value="${pmisRecord.psave_fl}"/>
<c:set var="jsBtnDel" value="${pmisRecord.pdelt_fl}"/>
<c:set var="jsBtnAdd" value="${pmisRecord.pprint_fl}"/>
