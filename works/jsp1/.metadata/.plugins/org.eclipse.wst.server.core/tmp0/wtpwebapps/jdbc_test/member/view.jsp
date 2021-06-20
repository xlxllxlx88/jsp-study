<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>회원정보 조회</title>
</head>
<body>
	<c:if test="${not empty msg}">
	<script>
		alert("${msg}");
		// 홈페이지로 이동
		location.href="home.jsp";
	</script>
	</c:if>
	
	<!-- 회원정보 조회 -->
	<table>
	
		<!-- 아이디-->
		<tr>
			<td>
				<label for="id">아이디 : </label>
			</td>
			<td>
				<c:out value="${member.id}" />
			</td>
		</tr>
		<!-- // 아이디 -->
		
		<!-- 패쓰워드 -->
		<tr>
			<td>
				<label>패쓰워드 : </label>
			</td>
			<td>
				<c:out value="${member.pw}" />
			</td>
		</tr>
		<!-- // 패쓰워드 -->
		
		<!-- 이름 -->
		<tr>
			<td>
				<label>이름 : </label>
			</td>
			<td>
				<c:out value="${member.name}" />
			</td>
		</tr>
		<!-- // 이름 -->
		
		<!-- 주소 -->
		<tr>
			<td>
				<label>주소 : </label>
			</td>
			<td>
				<c:out value="${member.address}" />
			</td>
		</tr>
		<!-- // 주소 -->
		
		<!-- 가입일 -->
		<tr>
			<td>
				<label>가입일 : </label>
			</td>
			<td>
				<c:out value="${member.joindate}" />
			</td>
		</tr>
		<!-- // 가입일 -->
	
	</table>
	
	<!--// 회원정보 조회 -->
	
</body>
</html>