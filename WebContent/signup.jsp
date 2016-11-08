<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.css"  rel="stylesheet">
<title>Sign up</title>
<link type="text/css" rel="stylesheet" href="css/signup.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.css"  rel="stylesheet">
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/circle05.jpg");
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;}

</style>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="main.jsp">首页</a>
	</div>
	<div>
		<ul class="nav navbar-nav">
			<li><a href="getNews.Servlet">热点新闻</a></li>
			<li><a href="getTalks.Servlet">热点话题</a></li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					我的
					<b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><a href="MyNews.jsp">我的新闻</a></li>
					<li><a href="MyTalk.jsp">我的话题</a></li>
					<li class="divider"></li>
					<li><a href="MyInformation.jsp">我的信息</a></li>
					<li class="divider"></li>
					<li class="active"><a href="signup.jsp">登录|注册</a></li>
				</ul>
			</li>
		</ul>
	</div>
	</div>
</nav>  
	
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