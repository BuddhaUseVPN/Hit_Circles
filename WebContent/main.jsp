<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main</title>
<link type="text/css" rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link href="css/bootstrap.css"  rel="stylesheet">

</head>
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/circle05.jpg");
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;}

.a {  
    font-family:"Times New Roman"; 
    font-size: 52px;  
    font-style: normal;  
    line-height: 40px;  
    font-weight: bolder;  
    font-variant: normal;  
    color: #000;  
    text-align: center;  
}  
table 
  {   border-collapse:   separate;   border-spacing:   50px;   } 


.divrote{
position:absolute;
background:url("images/yellow.jpg");
border-radius:128px;
/*animation-play-state: paused;*/
animation-play-state: running;
width:200px;
height:238px;
left:47px;
top:46px;
-webkit-animation-name:ball_moveG;
-webkit-animation-duration:5s;
-webkit-animation-iteration-count:infinite;
-webkit-animation-timing-function:linear;
-moz-animation-name:ball_moveG;
-moz-animation-duration:5s;
-moz-animation-iteration-count:infinite;
-moz-animation-timing-function:linear;
-o-animation-name:ball_moveG;
-o-animation-duration:5s;
-o-animation-iteration-count:infinite;
-o-animation-timing-function:linear;
-ms-animation-name:ball_moveG;
-ms-animation-duration:5s;
-ms-animation-iteration-count:infinite;
-ms-animation-timing-function:linear;
}

@-webkit-keyframes ball_moveG{
0%{
-webkit-transform:rotate(0deg)}
100%{
-webkit-transform:rotate(360deg)}
}
@-moz-keyframes ball_moveG{
0%{
-moz-transform:rotate(0deg)}
100%{
-moz-transform:rotate(360deg)}
}
@-o-keyframes ball_moveG{
0%{
-o-transform:rotate(0deg)}
100%{
-o-transform:rotate(360deg)}
}
@-ms-keyframes ball_moveG{
0%{
-ms-transform:rotate(0deg)}
100%{
-ms-transform:rotate(360deg)}
}
</style> 
<body>
		<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="main.jsp">首页</a>
	</div>
	<div>
		<ul class="nav navbar-nav">
			<li ><a href="getNews.Servlet?begin=0&end=9">热点新闻</a></li>
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


		
</body>
</html>