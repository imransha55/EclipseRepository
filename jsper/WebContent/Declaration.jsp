<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String uname="ismart";
int cube(int n)
{
	return n*n*n;
}

%>
<%= "cube of 55 is: "+cube(55)+"<br/>"+uname%>


</body>
</html>