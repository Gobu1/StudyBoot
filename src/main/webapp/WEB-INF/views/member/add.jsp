<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../temp/boot.jsp"></c:import>
<script defer src="/js/memberADD.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
		<div><input type="text" name="id" id="id"></div>
		<div><input type="text" name="pw" id="pw"></div>
		<div><input type="text" name="name" id="name"></div>
		<div><input type="text" name="email" id="email"></div>
		<button type="submit" id="btn1" class="btn btn-outline-dark">회원 가입</button>
	</form>
	<div id="addFiles">
		<button type="button" class="btn btn-danger" id="fileAdd">파일 추가</button>
	</div>
</body>
</html>