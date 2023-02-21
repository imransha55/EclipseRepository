<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="cal.html"></jsp:include><br><br>
<%!
int sub(int p, int q)
{
	return p-q;
}
int sum(int p, int q)
{
	return p+q;
}
%>
<% 
String in1=request.getParameter("on");
String in2=request.getParameter("to");

if((in1!=null) && (in2!=null))
{
	int n1= Integer.parseInt(in1);
	int n2=Integer.parseInt(in2);
	int add= sum(n1,n2);
	int subt=sub(n1,n2);
	out.print("<br/> Sum= "+ add);
	out.print("<br/> subtraction= "+ subt);
}
%>

</body>
</html>