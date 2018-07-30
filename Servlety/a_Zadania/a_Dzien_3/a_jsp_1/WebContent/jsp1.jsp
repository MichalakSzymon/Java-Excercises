<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
java.util.Calendar today = new java.util.GregorianCalendar();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>To jest HTML</h1>
<%
int counter = 10;
for (int i=0; i<counter; i++){ %>
<p><% out.print(i); %></p>
<%}
%>
<%= new java.util.Date() %>
<hr>
<%= today.get(Calendar.HOUR) %>:<%= today.get(Calendar.MINUTE) %>:<%= today.get(Calendar.SECOND) %>
</body>
</html>