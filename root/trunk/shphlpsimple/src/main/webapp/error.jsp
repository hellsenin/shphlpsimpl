<%@ page language="java" isErrorPage="true"   pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<head>
<title><fmt:message key="loginform.title" />Error</title>
</head>
	<div id="account">
	    <h3 class="accessibility">Error</h3>

An Error has occurred in this application.  

<% if (exception != null) { %>
    <% exception.printStackTrace(new java.io.PrintWriter(out)); %>
<% } else { %>
    Please check your log files for further information.
<% } %>
