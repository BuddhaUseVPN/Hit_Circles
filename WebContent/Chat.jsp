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
<title>Chat</title>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/dandan.js"></script>
<script type="text/javascript">
//登陆的人
$admin_name=prompt("请输入你的名字");//此处应当传入姓名参数
if($admin_name!=null){
  if(!$admin_name.replace(/^\s\s*/, '').replace(/\s\s*$/, '')){
    $admin_name="游客";
  }
}else{
    $admin_name="游客";
}

//成员数组
//此处应为加的好友，默认为三个
$arr_user=new Array(
Array('高文林','user_img/001.jpg'),
Array('张茗帅','user_img/002.jpg'),
Array('董浩洋','user_img/003.jpg'))
</script>
<link href="images/dandan.css" rel="stylesheet" media="screen" type="text/css" />
<style type="text/css">

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
			<li ><a href="getNews.Servlet">热点新闻</a></li>
			<li><a href="getTalks.Servlet">热点话题</a></li>
			<li class="active"><a href="Chat.jsp">好友聊天</a></li>
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
<div id="mid_top">
<!--  <div class="list">
    <table border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td class="td_user td_user_click">老猪</td>
        <td class="td_hide td_hide_click">X</td>
      </tr>
    </table>
  </div>-->
</div>
<div id="top" class="">头部</div>
<div id="body">
  <div id="left">
    <div class="box">
      <h3 class="h3 h3_1">最近聊天(<span class="n_geshu_1"></span>)</h3>
      <ul class="ul ul_1">
        <li>老猪</li>
      </ul>
      <h3 class="h3 h3_2">我的好友(<span class="n_geshu_2"></span>)</h3>
      <ul class="ul ul_2">
        <li>蛋蛋</li>
      </ul>
    </div>
    <div class="box_f"></div>
  </div>
  <div id="right">
    <div class="right_box">
      <div id="right_top">
        <!--<p><img src="images/head.jpg" alt="头象" /></p>
        老猪--></div>
      <div id="right_mid"></div>
      <div id="right_foot">蛋蛋</div>
      <div class="blank"></div>
    </div>
    <div class="right_box_foot"></div>
  </div>
  <div id="mid">
    <div id="mid_con">
      <div class="my_show">
        <div class="con_box"><div class="dandan_liaotian"></div></div>
      </div>
    </div>
    <div id="mid_mid"></div>
    <div id="mid_foot">
      <div id="mid_say">
        <textarea name="" cols="" rows="" id="texterea"></textarea>
      </div>
      <div id="mid_sand">发送</div>
      <div class="blank"></div>
    </div>
    <div class="mid_box"></div>
  </div>
</div>
</body>
</html>