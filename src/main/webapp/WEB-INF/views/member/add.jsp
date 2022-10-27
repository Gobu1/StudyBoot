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
	<div>
		<button type="button" id="test2">테스트2</button>
		<button type="button" id="test3">테스트3</button>
	</div>
	<div>
		<div>
			ALL<input type="checkbox" id="all">
		</div>
		<div>
			동의1 <input type="checkbox" name="" id="ck1">
			<div>
				약관1
			</div>
		</div>

		<div>
			동의2 <input type="checkbox" name="" id="ck2">
			<div>
				약관2
			</div>
		</div>
		<div>
			
			동의3 <input type="checkbox" name="" id="ck3">
			<div>
				약관3
			</div>
		</div>

	</div>
	<div>
		<select id="s1">
			<option value="">1</option>
			<option value="">2</option>
		</select>
		<button id="sbtn1">옵션버튼</button>

	</div>
</body>
</html>