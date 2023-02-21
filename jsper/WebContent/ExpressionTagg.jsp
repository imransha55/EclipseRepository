<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%="Ismart Sha Welcomes you "+request.getParameter("nam") %><BR><BR>
Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
</body>
</html>