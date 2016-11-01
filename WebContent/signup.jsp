<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign up</title>
<link type="text/css" rel="stylesheet" href="css/signup.css">
</head>
<body class="signup_bg">
			<div class="kuang">
				<h1>欢迎注册</h1>
				<form action="signup">
					<input name="userID" type="text" class="userID" placeholder="职工唯一号">
					<input name="password" type="password" class="password" placeholder="密码">
					<input name="tellphone" type="text" class="tellphone" placeholder="手机号">
					<p>已有账号？<a href="login.jsp">立即登录</a></p>
					<input type="submit" class="butt" value="注册">
				</form>
			</div>
			<div class="footer"><h1>@BuddaUseVPN</h1></div>
</body>
</html>