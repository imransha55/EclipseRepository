<%@ page contentType="text/html; charset=ISO-8859-1"  pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="i" %>

<html>
<body>
<h1>Taglib Directive:</h1>
<hr></hr>
<i:set var="name" value="ismartSha Techno"></i:set>
<i:out value="${name}"></i:out>

<i:if test="${3>2}">
<h2>This is True Block 3>2</h2>
</i:if>	
</body>

 </html>