<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

session : ${sessionScope.cart}<br>

	<c:forEach items="${cart}" var="c" varStatus="st">
		${st.count} : ${c} <br>	
	</c:forEach> 
	
</body>
</html>