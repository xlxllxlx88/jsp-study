<%@taglib uri="http://java.sun.com/jstl/xml" prefix="x"%><%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>

result : <%=request.getAttribute("txt2") %><br>
result : ${requestScope.txt2}<br>
result : ${txt2}<br>
result : <c:out value="${txt2}&copy" escapeXml="true"></c:out><br>
result : <c:out value="${txt2}&copy" escapeXml="false"></c:out><br>
result : <c:out value="<${txt2}>" escapeXml="true"></c:out><br>
result : <c:out value="<${txt2}>" escapeXml="false"></c:out><br>
result : <c:out value="&lt;${txt2}&gt;" escapeXml="false"></c:out><br>
</body>
</html>