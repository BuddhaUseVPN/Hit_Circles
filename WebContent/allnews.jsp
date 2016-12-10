<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    %>
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
<title>allnews第${begin}页</title>
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/circle05.jpg");
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;}

</style>
<style type="text/css">  
a:link {color: #000000} /* 未访问的链接 */
a:visited {color: #00FF00} /* 已访问的链接 */
a:hover {color: #FF00FF} /* 鼠标移动到链接上 */
a:active {color: #0000FF} /* 选定的链接 */
.a {  
    font-family: "Times New Roman";  
    font-size: 30px;  
    font-style: normal;  
    line-height: 40px;  
    font-weight: bolder;  
    font-variant: normal;  
    color: #FF0000;  
    text-align: center;  
}  
.b {  
    font-size: 12px;  
    font-style: normal;  
    font-weight: normal;  
    font-variant: normal;  
    color: #000;  
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
    color: #000000;  
}  
  
.e {  
    text-align: center;  
    vertical-align: middle;  
}  
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
			<li class="active"><a href="getNews.Servlet?begin=0&end=9">热点新闻</a></li>
			<li><a href="getTalks.Servlet?begin=0&end=9">热点话题</a></li>
			<li><a href="Chat.jsp">好友聊天</a></li>
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
	
	 
	<p align="left"><span class="a">&nbsp;&nbsp;&nbsp;&nbsp;热点新闻</span></p> 
	<table align="center" border=0>
	<c:forEach items="${News}" var="n" begin="${begin}" end="${end}">
		<tr align="center"><td align="left" class="d"><a href="${n.url}">${n.title}</a></td>
		<td><button type="button" class="btn btn-primary btn-sm" onclick=alert("操作成功!")>收藏</button></td></tr>
	</c:forEach> <!-- 上一行的onclick事件将参数传至“我的收藏中”，你对照着后台传吧。。。 -->
	</table>
	<div align="center">
	<ul class="pagination">
    <li><a href="#">&laquo;</a></li>
    <li><a href="allnews.jsp?begin=0&?end=9">1</a></li>
    <li><a href="allnews.jsp?begin=10&?end=19">2</a></li>
    <li><a href="allnews.jsp?begin=20&?end=29">3</a></li>
    <li><a href="allnews.jsp?begin=30&?end=39">4</a></li>
    <li><a href="allnews.jsp?begin=40&?end=49">5</a></li>
    <li><a href="allnews.jsp?begin=50&?end=59">6</a></li>
    <li><a href="allnews.jsp?begin=60&?end=69">7</a></li>
    <li><a href="allnews.jsp?begin=70&?end=79">8</a></li>
    <li><a href="allnews.jsp?begin=80&?end=89">9</a></li>
    <li><a href="allnews.jsp?begin=90&?end=99">10</a></li>
    <li><a href="#">&raquo;</a></li>
</ul>
</div>
	<p align="center"><span class="c">@BuddaUseVPN</span></p>  
	<p align="center"><span class="b">HIT</span></p>
</body>  
</html>