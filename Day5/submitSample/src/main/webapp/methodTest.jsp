<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>methodTest</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>

/* $(document).ready -> 문서가준비 되었을 때, 창이 열렸을 때 */
 $(document).ready(function() {
	 
	/*  $('#get').click(function() { -> get버튼 클릭 */
	
	 $('#get').click(function() {
		 $.ajax({
			 url : 'http://localhost:8181/submitSample/RestServlet',
			 type : 'get',
			 dataType:'text',
			 data : {
				 id : $('#id').val(),
				 account : $('#account').val(),
				 price : $('#price').val(),
				 bigo : $('#bigo').val()
			 }, // data {키 : 값}
			 success : function(data) {
				console.log("data : ", data) //
				var json = JSON.parse(data);
				console.log("result : ",json.result);
				console.log("msg : ",json.msg);
				
				// 필드 출력
				 $("#output").val(json.result);
				 $("#output2").val(json.msg);
		 	 }, // success
		 	 error : function(xhr, status, error) {
		 			console.log("status : ", status);
		 	 }
		 	
		 }) // ajax
	 }) // get
	 
	 $('#post').click(function() {
		 $.ajax({
			 url : 'http://localhost:8181/submitSample/RestServlet',
			 type : 'post', 
			 dataType:'text',
			 data : {
				 id : $('#id').val(),
				 account : $('#account').val(),
				 price : $('#price').val(),
				 bigo : $('#bigo').val()
			 }, // data 
			 success : function(data) {
				 //
		 	} // success
		 }) // ajax
	 }) // post
	 
	 $('#put').click(function() {
		 $.ajax({
			 url : 'http://localhost:8181/submitSample/RestServlet',
			 type : 'put',
			 dataType:'text',
			 data : {
				 id : $('#id').val(),
				 account : $('#account').val(),
				 price : $('#price').val(),
				 bigo : $('#bigo').val()
			 }, // data 
			 success : function(data) {
				 //
		 	} // success
		 }) // ajax
	 }) // put
	 
	 $('#delete').click(function() {
		 $.ajax({
			 url : 'http://localhost:8181/submitSample/RestServlet',
			 type : 'delete',
			 dataType:'text',
			 data : {
				 id : $('#id').val(),
				 account : $('#account').val() //,
			//	 price : $('#price').val(),
			//	 bigo : $('#bigo').val()
			 }, // data 
			 success : function(data) {
				 //
		 	} // success
		 }) // ajax
	 }) // delete
	 
	 
	 $('#head').click(function() {
		 $.ajax({
			 url : 'http://localhost:8181/submitSample/RestServlet',
			 type : 'head',
			 dataType:'text',
			 data : {
				 id : $('#id').val(),
				 account : $('#account').val(),
				 price : $('#price').val(),
				 bigo : $('#bigo').val()
			 }, // data 
			 success : function(data) {
				 //
		 	} // success
		 }) // ajax
	 }) // head
	 
	 $('#options').click(function() {
		 $.ajax({
			 url : 'http://localhost:8181/submitSample/RestServlet',
			 type : 'options',
			 dataType:'text',
			 data : {
				 id : $('#id').val(),
				 account : $('#account').val(),
				 price : $('#price').val(),
				 bigo : $('#bigo').val()
			 }, // data 
			 success : function(data) {
				 //
		 	} // success
		 }) // ajax
	 }) // options
	 
 }) //
</script>
</head>
<body>
출력 : <input type="text" id="output" /><br>
출력2 : <input type="text" id="output2" /><br>
<hr>

id : <input type="text" id="id"><br>
account : <input type="text" id="account"><br>
price : <input type="text" id="price"><br>
bigo : <input type="text" id="bigo"><br><br>

<button id="get">GET</button>&nbsp;
<button id="put">PUT</button>&nbsp;
<button id="post">POST</button>&nbsp;
<button id="delete">DELETE</button>&nbsp;
<button id="head">HEAD</button>&nbsp;
<button id="options">Options</button>&nbsp;
<!-- <button id="trace">Trace</button>
 -->
 </body>
</html>