<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<!--  / 차이가 무슨 얘기일까? -->
<!--  디스패쳐 서블릿이 무엇? -->
	<c:if test="${empty loginUser}">
		<a href="login">로그인</a>
	</c:if>
	
	<c:if test="${not empty loginUser}">
		<span>${loginUser}님 반갑습니다.</span>
		<a href="/logout">로그아웃</a>
	</c:if>
	
	<h2>Hello JSP</h2>
	<h3>${msg}</h3>
</body>
</html>