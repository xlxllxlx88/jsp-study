<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>홈</title>
</head>
<body>

	<c:if test="${not empty msg}">
	<script>
		alert("${msg}");
	</script>
	</c:if>
홈
</body>
</html>