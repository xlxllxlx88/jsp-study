<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>action2.jsp</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");

	// checkbox와 같이 한개의 필드가 다수의 값을 가질 경우
	String name5[] = request.getParameterValues("name5");
	for(String name : name5) {
	   out.println(name + " ");
	   out.println("<br>");
	}
	
	String name6[] = request.getParameterValues("name6");
	for(String name : name6) {
	   out.println(name + " ");
	   out.println("<br>");
	}
%>
<body>

</body>
</html>