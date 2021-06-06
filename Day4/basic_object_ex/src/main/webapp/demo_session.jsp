<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>demo session</title>
</head>
<body>
<%
	List<String> list = (List<String>)session.getAttribute("cart");
	
	for (String s : list) {
		out.println(s+"<br>");
	}
%>
</body>
</html>