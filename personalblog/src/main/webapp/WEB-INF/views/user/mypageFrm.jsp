<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
	<fieldset>
	<form action="/user/join.do" method="post">
		<input type="hidden" name="userNo" value="${loginUser.userNo }">
		<input type="hidden" name="grade">
		아이디 : <input type="text"  value="${loginUser.userId }" name="userId"><br>
		비밀 : <input type="text"  value="${loginUser.userPw }" name="userPw"><br>
		닉네임 : <input type="text"  value="${loginUser.nickname }" name="nickname"><br>
		이메일 : <input type="email"  value="${loginUser.email }" name="email"><br>
		<select name="grade">
			<option value="사용자" ${loginUser.grade.equals('사용자') ? 'selected' : ''}>사용자</option>
			<option value="관리자" ${loginUser.grade.equals('관리자') ? 'selected' : ''}>관리자</option>
		</select>
		<button>회원가입</button>
	</form>
	</fieldset>
</body>
</html>