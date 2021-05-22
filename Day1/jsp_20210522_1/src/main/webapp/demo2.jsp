<!-- XML/HTML 주석 -->
<%-- -JSP 주석 --%>
<%-- page 지시자(디렉티브:directive) : %@ ~~~~ --%>
<%-- page directive가 나와야 JSP다!!!--%>
<%-- MIME 타입 찾아보기 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
	// 선언부(declaration) : JSE(O), JEE(X)
	// 코드가 노출될 위험이 있으므로 실무적으로 사용 안함 > 대처법) Java Bean
	public String print() {
		System.out.println("Java Code");
		//out.println("asd"); //JEE(JSP) code (X)
	return "Java Code";
	
}
%>
<%-- DOCTYPE : HTML 시작 --%>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>2021.05.22 JSP 수업</title>
</head>
<body>
<%  // 스크립트릿 (scriptlet) : JEE (O), 프로그램 논리(logic) 부분
	// 대체) JSTL
	
	String str = "JSP";

	if(str.equals("JSP")){
		out.println("<b>Servlet의 축약</b><br>");
	}

	// JSP 기본(내장) 객체 :out(웹브라우저 출력용 jsp 기본 객체)
	// 인스턴스 생성 과정없이 바로 사용하는객체
	out.println("code : " + print() + "<br>");
	out.println("code : " + print());
%>
<hr>

<!-- <hr> 태그 가로선 -->
<!-- 표현식(expression) : 주의사항 ";" 마무리에 사용금지 -->
<!-- 대체) EL -->
- str : <%= str + " 2.3 " + print() %>
</body>
</html>