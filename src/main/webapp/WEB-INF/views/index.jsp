<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="./temp/boot.jsp"></c:import>
<link href="/css/test.css" rel="stylesheet">
<script defer src="/js/test.js"></script>
</head>
<body>
	<h1>Index page</h1>
	<h1><spring:message code="hi" var="h"></spring:message></h1>
	<h1><spring:message code="hi2" text="code가 없을때 출력"></spring:message></h1>
	<img src="./images/1234.jpg" id="id1">
	<a href="./qna/list">QNA</a>
	<a href="./member/add">join</a>
	<div>
	<c:choose>
		<c:when test="${not empty member}">
			<%-- <h3><spring:message code="welcome" arguments="${member.name}"></spring:message></h3> --%>
			<h3><spring:message code="welcome2" arguments="${member.id},${member.name}" argumentSeparator=","></spring:message></h3>
			<input type="text" name="name" id="userName" value="${member.name}" readonly >
			<a href="./member/logout">logout</a>
		</c:when>
		<c:otherwise>
			<input type="text" value="${member.id } 로그인 정보 없음" readonly="readonly">
			<a href="./member/login">login</a>
		</c:otherwise>
	</c:choose>
	</div>
	<button id="btn">click</button><br>
	<button type="button" class="buttons">btn1</button>
	<button type="button" class="buttons">btn2</button>
	<button type="button" class="buttons">btn3</button>

	<h1>${h}</h1>
</body>
</html>