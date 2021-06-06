<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>에러 처리 메시지 페이지</title>
</head>
<body>

	<hr>
	에러 타입: <%= exception.getClass().getName() %> <br>
	에러 메시지: <b><%= exception.getMessage() %></b>


<!-- exception : jsp 기본객체, 에러 메세지를 볼수있고 처리가 가능하다 -->
</body>
</html>