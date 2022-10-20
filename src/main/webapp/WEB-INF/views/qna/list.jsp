<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container2">
		<c:forEach items="${list}" var="dto">
			<div>${dto.num}</div>
			<div>${dto.writer}</div>
			<div>${dto.title}</div>
			<div>${dto.contents}</div>
		</c:forEach>
	</div>
	x`x`
	<c:forEach begin="1" end="10" var="i">
		<li class="page-item"><a class="page-link" href="./list?page=${i}">${i}</a></li>
	</c:forEach>
</body>
</html>