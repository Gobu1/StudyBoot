<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../temp/boot.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
		<br>
		<h1 style="text-align: center;">로그인</h1>
		<section class="col-lg-6 container-fluid mt-4">
			<div class="row">
				<div class="mb-3">
					<label>아이디</label>
					<input type="text" id="userID" class="form-control" name="id" placeholder="ID Input" onfocus="this.placeholder=''"
						onblur="this.placeholder='ID Input'" autocomplete="off"
					>
				</div>
				<div class="mb-3">
					<label>비밀번호</label>
					<input type="password" id="pwd" class="form-control" name="pw" placeholder="Password Input" onfocus="this.placeholder=''"
						onblur="this.placeholder='Password Input'" autocomplete="off"
					>
					<div></div>
				</div>
				<div class="mb-3">
					<button type="submit" class="btn btn-outline-dark log">로그인</button>
				</div>
			</div>
		</section>
	</form>

</body>
</html>