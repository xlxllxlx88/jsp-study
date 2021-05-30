<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>weelcome</title>
</head>
<body>
	<!-- 메뉴 표시줄 작성 -->
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class=container>
			<div class="navbar-header">
				<a class="navbar-brand" href="./welcome.jsp">Home</a>
			</div>
		</div>
	</nav>
	
	<!-- 변수가 각각의 문자열을 저장하도록 선언문 태그 작성 -->
	<%!
		String greeting = "Welcome to WebShopping Mall";
		String tagline = "Welcome to Web Market!";
	%>
	
	<!-- 웹페이지 제목을 표현하도록 부트스트랩 CSS 작성 -->
	<div class="jumbotron">
		<div class="container">
			<h1><%=greeting%></h1>
		</div>
	</div>
	
	<!-- 웹페이지 본문을 표현하도록 부트스트랩 CSS 작성 -->
	<div class="container">
		<div class="text-center">
			<h3><%=tagline%></h3>
		</div>
	</div>
	
	<!-- 웹페이지 바닥글을 표현하도록 부트스트랩 CSS 작성 -->
	<footer class="container">
		<p>&copy: WebMarket</p>
	</footer>
</body>
</html>