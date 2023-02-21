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
<%  
String name="ismart"; 

out.print("value setted");
%>  <br>			
<jsp:setProperty property="name" name="is" value="<%=name %>"/>  
  
Record:<br>  
<jsp:getProperty property="name" name="is"/><br>
</body>
</html>