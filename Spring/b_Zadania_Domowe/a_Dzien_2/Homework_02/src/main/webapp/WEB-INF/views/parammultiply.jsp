<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Wartość	przekazana	multiply: ${size} </p>
<table>
<% for(int i=1; i<=(Integer.parseInt((String)request.getAttribute("rows"))); i++) { %>
<tr> 
<% for(int j=1; j<=(Integer.parseInt((String)request.getAttribute("cols"))); j++) { %>
<t<%=(i==1 || j==1)?"h":"d" %>> <%= i*j %> </t<%=(i==1 || j==1)?"h":"d" %>>
<% } %>
</tr>
<% } %>
</table>
</body>
</html>