<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println(request.getAttribute("Name") + " " + request.getAttribute("Password"));
out.println("Welcome to the Index page");
%>
</body>
</html>