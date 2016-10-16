<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link type="text/css" rel="stylesheet" href="css/login.css">
</head>
<body class="login_bg">
			<div class="kuang">
				<h1>登陆</h1>
				<form method="post" action="login.Servlet">
					<input name="userID" type="text" class="txt1" placeholder="职工唯一号">
					<input name="password" type="password" class="txt2" placeholder="密码">
					<input type="submit" class="butt" value="登陆">
				</form>
			</div>
			<div class="footer"><h1>@BuddaUseVPN</h1></div>
</body>

</html>

