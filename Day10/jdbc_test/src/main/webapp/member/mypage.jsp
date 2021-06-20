<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>My page</title>
</head>
<body>
<%
 	// 임시 세션 : 로그인을 전제(가정)
	session.setAttribute("ID_SESSION", "spring123");
%>

회원 : ${ID_SESSION}&nbsp;
<a href="${rootPath}/update.do?id=${ID_SESSION}">회원 정보 수정</a>&nbsp;
<a href="${rootPath}/delete.do?id=${ID_SESSION}">회원 정보 삭제</a>&nbsp;
</body>
</html>