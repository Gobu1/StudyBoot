<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../temp/boot.jsp"></c:import>
<c:import url="../temp/summer.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
    <input type="text" value="${qna.title}" name="title">
    <input type="text" value="${qna.writer}" name="writer">
    <input type="text" value="${qna.contents}" name="contents">

    <a href="./update?num=${qna.num}">업데이트</a>
</body>
</html>