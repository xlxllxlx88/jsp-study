<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>if 태그</title>
</head>
<body>
<c:if test="true">
무조건 수행<br>
</c:if>

<!-- http://localhost:8181/jstl_el_ex/jstl/use_if_tag.jsp?name=bk&age=20 -->
<!-- 무조건 수행
name 파라미터의 값이 bk 입니다.
당신의 나이는 18세 이상입니다. -->

<c:if test="${param.name == 'bk'}">
name 파라미터의 값이 ${param.name} 입니다.<br>
</c:if>

<c:if test="${param.age >= 18}">
당신의 나이는 18세 이상입니다.
</c:if>
</body>
</html>
