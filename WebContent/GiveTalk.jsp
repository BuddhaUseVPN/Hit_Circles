<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<title>alltalks</title>
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/circle05.jpg");
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;}
.a_demo_three {
	background-color:#80ff00;
	font-family: 'Open Sans', sans-serif;
	font-size:18px;
	text-decoration:none;
	color:#fff;
	position:relative;
	padding:10px 20px;
	border-left:solid 1px #2ab7ec;
	margin-left:35px;
	background-image: linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	border-top-right-radius: 5px;
	border-bottom-right-radius: 5px;
	box-shadow: inset 0px 1px 0px #2ab7ec, 0px 5px 0px 0px #156785, 0px 10px 5px #999;
}

.a_demo_three:active {
	top:3px;
	background-image: linear-gradient(bottom, rgb(62,184,229) 0%, rgb(44,160,202) 100%);
	box-shadow: inset 0px 1px 0px #2ab7ec, 0px 2px 0px 0px #156785, 0px 5px 3px #999;
}

</style>
</head>
<body>
<div>
		<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="main.jsp">首页</a>
	</div>
	<div>
		<ul class="nav navbar-nav">
			<li><a href="getNews.Servlet?begin=0&end=9">热点新闻</a></li>
			<li><a href="getTalks.Servlet?begin=0&end=9">热点话题</a></li>
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
					<li><a href="signup.jsp">登录|注册</a></li>
				</ul>
			</li>
		</ul>
	</div>
	</div>
</nav>
	</div>
	<form method="post" action="InsertTalk.Servlet">
		<table align="center">
		<tr>
			<td>话题标题</td>
		</tr>
		<tr>
			<td><input class="form-control" name="Title" type="text"></td>
		</tr>
		<tr>
			<td>话题内容</td>
		</tr>
		<tr>
		<td>
				<textarea class="form-control" name="Text" rows="20" cols="65"></textarea>
		</td>
		</tr>
		<tr>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
		</tr>
		<tr align="center">
		<td><input type="button" value="提交" class="btn btn-primary"></td></tr>
		</table>
	</form>
</body>
</html>