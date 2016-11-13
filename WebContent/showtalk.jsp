<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Showtalks</title> 
<link type="text/css" rel="stylesheet" href="css/main.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.css"  rel="stylesheet"> 
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/circle05.jpg");
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;}

</style>
<style type="text/css">
.footer{position:absolute; bottom:-450px; width:100%;}
.footer h1{font:15px/30px "微软雅黑", "黑体"; color:#ffffff; width:110px; text-align:center;margin: 0 auto;}  
.a {  
    font-family: "Times New Roman";  
    font-size: 24px;  
    font-style: normal;  
    line-height: 40px;  
    font-weight: bolder;  
    font-variant: normal;  
    color: #000;  
    text-align: center;  
}  
.b {  
    font-size: 12px;  
    font-style: normal;  
    font-weight: normal;  
    font-variant: normal;  
    color: #CCC;  
}  
.c {  
    font-family: "Times New Roman";  
    font-size: 12px;  
    font-style: normal;  
    line-height: normal;  
    font-weight: bolder;  
    font-variant: normal;  
    color: #000;  
}  
.d {  
    font-size: 18px;  
    font-style: normal;  
    line-height: normal;  
    font-weight: normal;  
    font-variant: normal;  
    color: #000;  
}  
  
.e {  
    text-align: center;  
    vertical-align: middle;  
}  
p{  
    text-indent: 2em;}  
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
	<p align="center"><span class="a">${title}</span></p>  
<p align="right"><span class="b">&nbsp;&nbsp;&nbsp;&nbsp;发起者：${userID}</span></p>  

<hr/>  
  
<p><span class="d">${text}</span></p>    

<hr/>  


	<table align="center">
		<p><span class="a">讨论区</span></p>  
<c:forEach items="${comment}" var="t">
		 <p><span class="d">${t.userID}</span></p>
		<p><span class="d">${t.comment}</span></p>
	</c:forEach>

<hr/>  
<form method="post" action="setTalksComment.Servlet?id=${id}">
		<table>
		<tr>
		<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发表讨论</h3>
		</tr>
		<tr>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td>
				<textarea class="form-control" name="comment" rows="6" cols="75"></textarea>
			</td>
		</tr>
		<tr>
			<td>
			<h3> </h3>	
			</td>
		</tr>
		<tr align="center">
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td><input type="submit" class="btn btn-default btn-primary" value="提交"></td>
		</tr>
		</table>
	</form>
	</table>
</div> 

<div class="footer"><h1>@BuddaUseVPN</h1></div>

</body>
</html>