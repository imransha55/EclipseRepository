<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="obj" class="javaBean.Calc"></jsp:useBean>
<% int m=obj.cube(5);
out.print("cube of 5 is: "+m);%>
</body>
</html>