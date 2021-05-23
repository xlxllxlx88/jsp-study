<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>action4.jsp</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
	
	// <인자명, 인자값[배열]>
	Map<String,String[]> map = request.getParameterMap();
	// 인자명들
	Set<String> names = map.keySet();
	Iterator<String>  it = names.iterator();

	while (it.hasNext()) {
		
		// 낱개의 인자명(이름)
		String name = it.next();
		// 값이 여러개일 수도 있으니까 배열로 받자
		String[] value = map.get(name);
		
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