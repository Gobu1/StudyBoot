<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../temp/boot.jsp"></c:import>
<script defer src="/js/memberADD.js"></script> 
<title>Insert title here</title>
</head>
<body>
	<!-- 현재 url이 액션으로 지정 -->
	<form:form method="post" modelAttribute="memberVO">
		<div>
			<form:input path="id" cssClass="form-control" id="id"/>
			<form:errors path="id"></form:errors>
		</div>
		<div>
			<form:password path="pw" id="pw"/>
			<form:errors path="pw"></form:errors>
		</div>
		<div>
			<form:input path="name" id="name"/>
			<form:errors path="name">필수</form:errors>
		</div>
		<div>
			<form:input path="email" id="email"/>
		</div>
		<button type="submit" id="btn1" class="btn btn-outline-dark">회원 가입</button>
	
	</form:form>

</body>
</html>