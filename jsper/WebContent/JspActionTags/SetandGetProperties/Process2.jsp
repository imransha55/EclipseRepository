<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="is" class="GetandSetProperties.Emp" scope="session"></jsp:useBean>  

Record:<br>  
//not assigned <br>
<jsp:getProperty property="name" name="is"/><br>  
<jsp:getProperty property="password" name="is"/><br>  
<jsp:getProperty property="mail" name="is" /><br>  
<a href="EmpIndex.html">Home</a>
</body>
</html>