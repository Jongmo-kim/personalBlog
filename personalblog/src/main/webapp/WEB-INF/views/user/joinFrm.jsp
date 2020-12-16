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
		아이디 : <input type="text" name="userId"><br>
		비밀 : <input type="text" name="userPw"><br>
		닉네임 : <input type="text" name="nickname"><br>
		이메일 : <input type="email" name="email"><br>
		<select name="grade">
			<option value="사용자">사용자</option>
			<option value="관리자">관리자</option>
		</select>
		<button>회원가입</button>
	</form>
	</fieldset>
</body>
</html>