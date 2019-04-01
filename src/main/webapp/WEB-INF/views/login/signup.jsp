<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
		<form action="/signupProc" method="post" enctype="multipart/form-data">
			<div>
				<label for="email">email</label> <input type="text" id="email"
					name="email" placeholder="email을 입력하세요.">
			</div>
			<div>
				<label for="name">이</label> <input type="text" id="email"
					name="name" placeholder="이름을 입력하세요.">
			</div>
			<div class="form-group">
				<label for="password">password</label> <input type="password"
					id="password" name="password" placeholder="비밀번호 입력하세요.">
			</div>
			<div class="form-group">
				<label for="password">password confirm</label> <input type="password"
					id="password" name="password" placeholder="비밀번호 확 입력하세요.">
			</div>
			<button type="submit">회원가입</button>
		</form>
	</div>
</body>
</html>