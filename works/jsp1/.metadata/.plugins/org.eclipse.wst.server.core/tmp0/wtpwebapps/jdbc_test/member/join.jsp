<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<%-- 메시지 : ${msg}<br> --%>
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
		  action="${rootPath}/join_proc.do">
		  
		  <table>
		  
		  	<!-- 아이디-->
		  	<tr>
		  		<td>
		  			<label for="id">아이디 : </label>
		  		</td>
		  		<td>
		  			<input type="text" id="id" name="id" 
		  				   maxlength="20" 
		  				   required 
		  				   pattern="[a-zA-Z]{1}\w{7,19}" 
		  				   title="아이디는 8~20자로 입력해주세요"
		  				   placeholder="아이디 입력" />
		  		</td>
		  	</tr>
		  	<!-- // 아이디 -->
		  	
		  	<!-- 패쓰워드 -->
		  	<tr>
		  		<td>
		  			<label id="pw">패쓰워드 : </label>
		  		</td>
		  		<td>
		  			<input type="password" id="pw" name="pw"
		  				   maxlength="20"
		  				   required
		  				   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\W).{8,20}" 
		  				   title="패쓰워드는 8~20자 입력하세요"
						   placeholder="패쓰워드 입력"	/>	
		  		</td>
		  	</tr>
		  	<!-- // 패쓰워드 -->
		  	
		  	<!-- 이름 -->
		  	<tr>
		  		<td>
		  			<label for="name">이름 : </label>
		  		</td>
		  		<td>
		  			<input type="text" id="name" name="name"
		  				   required
		  				   maxlength="50"
		  				   pattern="[가-힣]{2,50}" 
		  				   title="한글 이름을 입력해주세요"
		  				   placeholder="이름 입력" />
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
		  	
		  	<!-- 가입일 자동 처리 -->
		  	
		  	<!-- 전송/취소 -->
		  	<tr>
		  		<td colspan="2">
		  			<div align="center">
			  			<input type="submit" value="가입" />&nbsp;
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