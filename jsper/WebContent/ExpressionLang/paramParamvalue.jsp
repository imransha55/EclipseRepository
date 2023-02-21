<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*" %>
<%String title = "Accessing Request Param";%>
<!DOCTYPE html>
<html>
   <head>
      <title><% out.print(title); %></title>
   </head>
   
   <body>
      <center>
         <h1><% out.print(title); %></h1>
      </center>
      
      <div align = "center">
         <p>${param["username"]}</p>
      </div>
   </body>
</html>