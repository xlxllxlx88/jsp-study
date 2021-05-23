<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>action3.jsp</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
	
	// 인자의 이름들 : 반복자 패턴(iterater : Iteratior, Enumeration)
	// index 검색 방식(X), 다음(next) 요소 검색 방식(O) : 성능 향상
	Enumeration<String> enums = request.getParameterNames();

	while (enums.hasMoreElements()) {
		
		// 낱개의 인자명(이름)
		String name = enums.nextElement();
		// 값이 여러개일 수도 있으니까 배열로 받자
		String[] value = request.getParameterValues(name);
		
		if(value.length == 1) {
			// 인자의 값이 낱개일 경우
			out.println(name + " : " + value[0] + "<br>");
		} else {
			// 인자의 값이 다수일 경우
			out.println(name + " : ");
			for(String n : value) {
				out.println(n + " ");
			}
			
			out.println("<br>");
			
		}
	}
%>
<body>

</body>
</html>