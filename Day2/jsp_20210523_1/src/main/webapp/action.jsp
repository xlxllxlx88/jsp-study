<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	//post방식일 때 선처리
	request.setCharacterEncoding("UTF-8");
%>
<body>
인자-1 : <%=request.getParameter("name1") %><br>
인자-2 : <%=request.getParameter("name2") %>

</body>
</html>