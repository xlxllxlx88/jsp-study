<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE HTML>
<HTML lang="ko">
<HEAD>
<TITLE> pageContext 객체 </TITLE>
</HEAD>
<BODY>

<% 
out.println("회원님 환영합니다.<BR>");
out.flush();
// pageContext.include("/pageContext_3.jsp");
// pageContext.include("./pageContext_3.jsp");
pageContext.include("pageContext_3.jsp");
out.println("저희 사이트를 애용해 주셔서 감사합니다.");
%>

<hr>
<%
	String page2 = "pageContext_3.jsp";
%>
<jsp:include page="<%=page2 %>">
	<jsp:param name="page2" value="<%=page2 %>" />
</jsp:include>

<hr>
<%@ include file="pageContext_3.jsp" %>

</BODY>
</HTML>