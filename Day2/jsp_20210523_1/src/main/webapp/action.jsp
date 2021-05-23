<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>action.jsp</title>
<script type="text/javascript">
	console.log("===========");
	console.log("인자 도착!");
	console.log("===========");
</script>
</head>
<%
	// post방식일 때 선처리 : ISO-8859-1 -> UTF-8
	// requset : HTTP 요청 기본(내장) 객체(인스턴스)
	// 별도의 인스턴스(객체) 생성 과정이 불필요
	request.setCharacterEncoding("UTF-8");
%>
<body>
인자-1 : <%=request.getParameter("name1") %><br>
인자-2 : <%=request.getParameter("name2") %>

</body>
</html>