<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>전체회원조회</h1>
	<hr>
	<table border=1>
		<tr>
			<th>회원번호</th><th>아이디</th><th>이름</th><th>이메일</th><th>등급</th>
		</tr>
		<c:forEach items="list" var="m">
			<tr>
				<td>${m.userNo }</td>
				<td>${m.userId }</td>
				<td>${m.nickname}</td>
				<td>${m.email }</td>
				<td>${m.grade }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>