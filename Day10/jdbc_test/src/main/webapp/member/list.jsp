<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>전체 회원 목록</title>
</head>
<body>

	<table border="1">
		<c:forEach var="member" items="${members}" varStatus="st">
			<tr>
				<td>${(page-1)*5 + st.count}</td>
				<td>${member.id}</td>
				<td>***********</td>
				<td>${member.name}</td>
				<td>${member.address}</td>
				<td>
					<a href="#">삭제</a>&nbsp;
					<a href="#">수정</a>
				</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="6">
				<div align="center">
					<c:forEach begin="1" end="${totPage}" step="1" varStatus="st">
						<a href="${rootPath}/list.do?page=${st.count}">${st.count}</a>
					</c:forEach>
				</div>
			</td>
		</tr>
	</table>
	
</body>
</html>