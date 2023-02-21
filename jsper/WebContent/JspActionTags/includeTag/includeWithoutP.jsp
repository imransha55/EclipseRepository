<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<i style="color: purple;">this is process file</i>
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  <br>
<i style="color: purple;">Process file ended</i>
<hr>
</body>
</html>