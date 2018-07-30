<%@ page import = "java.time.LocalDate"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! LocalDate today = LocalDate.now(); %>
<fmt:formatDate value="${date}" var="formattedDate" 
                type="date" pattern="yyyy-MM-dd" />
${formattedDate}
<fmt:setLocale value="en_US" scope="page"/>
<% double Amount=99.14115; pageContext.setAttribute("Amount", Amount); %>
<fmt:formatNumber pattern="00.000" value="<%=Amount %>" /> <br />
<fmt:formatNumber pattern="00.00000" value="<%=Amount %>" /> <br />
<fmt:formatNumber pattern=".000%" value="<%=Amount/1000 %>" /> <br />
<fmt:formatNumber pattern="00.000zł" value="<%=Amount %>" /> <br />

</body>
</html>