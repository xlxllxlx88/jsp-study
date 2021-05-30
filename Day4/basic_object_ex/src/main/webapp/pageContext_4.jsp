<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<HTML lang="ko">
<HEAD>
<TITLE> pageContext 객체 </TITLE>
</HEAD>
<BODY>

<%
pageContext.setAttribute("pageValue","pageContext Example");
Object code=pageContext.getAttribute("pageValue");

if (code != null){
          String strValue=(String)code;
          out.println("page Value=" + strValue + "<BR>");
}
else{
          out.println("Not found!!");
}
%>

<hr>

<c:set var="code2" value="<%=code%>"/>

<hr>
code : <%=code%><br>
<!-- pageScope : EL 내장 객체 (생략가능) -->
code : ${code}<br>
JSTL(code2) : ${code2}<br>
JSTL(code2-1) : <%= pageContext.getAttribute("code2") %><br>
JSTL(code2-2) : ${code2}<br>
pageValue : ${pageValue}<br>
pageValue : ${pageScope.pageValue}


</BODY>
</HTML>