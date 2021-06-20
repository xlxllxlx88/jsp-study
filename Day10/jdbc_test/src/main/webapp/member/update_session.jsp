<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>회원수정</title>
</head>
<body>
	<c:if test="${not empty msg}">
	<script>
		alert("${msg}");
		// 홈페이지로 이동
		location.href="home.jsp";
	</script>
	</c:if>
	
	<!-- 회원가입 폼 -->
	<form name="frm" 
		  method="post"
		  action="${rootPath}/update_session_proc.do">
		  
		  <table>
		  
		  	<!-- 아이디-->
		  	<tr>
		  		<td>
		  			<label for="id">아이디 : </label>
		  		</td>
		  		<td>
		  		    <c:out value="${member.id}" />
<%-- 		  			<input type="hidden" id="id" name="id" 
		  				   value="${member.id}" />
 --%>		  				   
		  		</td>
		  	</tr>
		  	<!-- // 아이디 -->
		  	
		  	<!-- 신규 패쓰워드 -->
		  	<tr>
		  		<td>
		  			<label id="pw">신규 패쓰워드 : </label>
		  		</td>
		  		<td>
		  			<!-- 기존 패쓰워드 -->
		  			<%-- <input type="hidden" id="pw" name="pw"
		  			       value="${member.pw}" /> --%>
		  			         
		  			<input type="password" id="pw2" name="pw2"
		  				   maxlength="20"
		  				   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\W).{8,20}" 
		  				   title="패쓰워드는 8~20자 입력하세요"
						   placeholder="패쓰워드 입력"	/>	
		  		</td>
		  	</tr>
		  	<!-- // 신규 패쓰워드 -->
		  	
		  	<!-- 이름 -->
		  	<tr>
		  		<td>
		  			<label for="name">이름 : </label>
		  		</td>
		  		<td>
		  			<%-- <input type="text" id="name" name="name"
		  				   value="${member.name}" readonly /> --%>
		  			<c:out value="${member.name}" />	   
		  			<%-- <input type="hidden" id="name" name="name"
		  				   value="${member.name}" /> --%>	   
		  		</td>
		  	</tr>
		  	<!-- // 이름 -->
		  	
		  	<!-- 주소 -->
		  	<tr>
		  		<td>
		  			<label for="address">주소 : </label>
		  		</td>
		  		<td>
		  			<input type="text" id="address" name="address"
		  				   maxlength="500" 
		  				   placeholder="주소 입력" />
		  		</td>
		  	</tr>
		  	<!-- // 주소 -->
		  	
		  	<!-- 전송/취소 -->
		  	<tr>
		  		<td colspan="2">
		  			<div align="center">
			  			<input type="submit" value="수정" />&nbsp;
			  			<input type="reset" value="취소" />
		  			</div>
		  		</td>		  		
		  	</tr>
		  	<!-- // 전송/취소 -->
		  
		  </table>
	
	</form>
	<!--// 회원가입 폼 -->
	
</body>
</html>