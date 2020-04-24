<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="writeForm" method="post" action="">
<table border="1" cellpadding="3" cellspacing="0">
<tr>
	<td width="90" align="center">이름</td>
	<td>
		<input type="text" name="name" id="name" placeholder="이름 입력">
		<div id="nameDiv"></div>
	</td>
</tr>
<tr>
	<td align="center">아이디</td>
	<td>
		<input type="text" name="id" id="id" size="25" placeholder="아이디 입력">
		<input type="button" id="checkId" value="중복체크">
		<div id="idDiv"></div>
	</td>
</tr>
<tr>
	<td align="center">비밀번호</td>
	<td>
		<input type="password" name="pwd" id="pwd" size="30">
		<div id="pwdDiv"></div>
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
	<input type="button" id="writeBtn" value="회원가입">                     
	<input type="reset" value="다시작성">
	<input type="button" value="목록" onclick="">
</tr>
</table>
</form>
</body>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/user.js"></script>
</html>












