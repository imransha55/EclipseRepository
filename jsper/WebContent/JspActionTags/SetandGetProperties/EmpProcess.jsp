<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="is" class="GetandSetProperties.Emp"></jsp:useBean>  
<jsp:setProperty property="name" name="is"/> 
<jsp:setProperty property="*" name="is"/> 
Record:<br>  
<jsp:getProperty property="name" name="is"/><br>  
<jsp:getProperty property="password" name="is"/><br>  
<jsp:getProperty property="mail" name="is" /><br>  
<a href="Process2.jsp">VistiPage</a><br><br>
<a href="setPropertyUsingVariable.jsp">setProoertyUsingvariable</a>
  
</body>
</html>