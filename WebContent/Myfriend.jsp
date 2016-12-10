<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Myfriends</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/signup.css">
<style>
body{padding-top: :60px;}

.navbar{
	background-color:rgba(255,255,255,0.6);
}
       
.tb {
display: table;
pointer-events: none;
width: 120%;
height: 100%;
}

.tb>.tc {
display: table-cell;
pointer-events: none;
vertical-align: middle;
}

.tb>.tc>div {
pointer-events: auto;
}

/* Custom Styles */
	.jumbotron{
		height:20px;
	}
	
    ul.nav-tabs{
        width: 140px;
        margin-top: 20px;
        border-radius: 4px;
        border: 1px solid #ddd;
        box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
    }
    ul.nav-tabs li{
        margin: 0;
        border-top: 1px solid #ddd;
    }
    ul.nav-tabs li:first-child{
        border-top: none;
    }
    ul.nav-tabs li a{
        margin: 0;
        padding: 8px 16px;
        border-radius: 0;
    }
    ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{
        color: #fff;
        background: #0088cc;
        border: 1px solid #0088cc;
    }
    ul.nav-tabs li:first-child a{
        border-radius: 4px 4px 0 0;
    }
    ul.nav-tabs li:last-child a{
        border-radius: 0 0 4px 4px;
    }
    ul.nav-tabs.affix{
        top: 30px; /* Set the top position of pinned element */
    }
    
.row {
    margin-right: 100px;
    margin-left: 100px;
}
    
</style>
</head>

<body>  
	<div id="header">
			<div style="font: 17px '微软雅黑';" class="navbar navbar-default navbar-fixed-top" role="navigation">
			    <div class="container">
				    <div class="navbar-header">
				    	 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example-navbar-collapse">
				            <span class="sr-only">切换导航</span>
				            <span class="icon-bar"></span>
				            <span class="icon-bar"></span>
				            <span class="icon-bar"></span>
				        </button>
				        <a class="navbar-brand" href="index.html"><img src="images/logo.png" style="margin-top:-20px;"></a>
				    </div>
			    <div>
			        <ul class="nav navbar-nav">
			            <li class="active"><a href="index.html">首页</a></li>
			            <li><a href="getNews.Servlet">新闻</a></li>
			            <li><a href="getTalks.Servlet">话题</a></li>
			            <li><a href="getMyfriend.Servlet">朋友圈</a></li>
			        </ul>
			        <ul class="nav navbar-nav pull-right">
			        	<li>  
				            <form method="post" action="SerachTalk_News.Servlet" class="navbar-form navbar-left">
						        <div class="form-group">
						         <input name="text" type="text" class="form-control" placeholder="新闻和话题">
						        </div>
						        <button type="submit" class="btn btn-default glyphicon glyphicon-search"></button>
						     </form>
						</li>
						<li><a href="#" data-toggle="modal" data-target="#opensignup">注册</a></li>
						<li><a href="#" data-toggle="modal" data-target="#openlogin">登录</a></li>
						<li class="dropdown">
			                <a href="#" class="dropdown-toggle" data-toggle="dropdown">个人中心<b class="caret"></b></a>
			                <ul class="dropdown-menu">
			                    <li><a href="getMyInformation.Servlet">个人信息</a></li>
			                    <li class="divider"></li>
			                    <li><a href="getMyNews.Servlet">收藏新闻</a></li>
			                    <li class="divider"></li>
			                    <li><a href="getMyTalk.Servlet">我的话题</a></li>
			                    <li class="divider"></li>
			                    <li><a href="getFavoriteTalks.Servlet">收藏话题</a></li>
			                </ul>
			            </li>
			        </ul>
			    </div>
			   </div>
		</div>
	</div>
	
	<div style="padding-top:100px;" data-spy="scroll" data-target="#myScrollspy">
		<div class="container">
		    <div class="row">
		        <div class="col-xs-4" id="myScrollspy">
		            <ul class="nav nav-tabs nav-stacked" data-spy="affix" data-offset-top="125">
		                <li><a href="#"  class="btn active" role="button" data-toggle="collapse" data-target="#section-1">已添加好友</a></li>
		                <li><a href="#"  class="btn"  style="background-color:rgba(128,128,128,0.8);color:white;" role="button" data-toggle="collapse" data-target="#section-2">未添加好友</a></li>
		            </ul>
		        </div>
		        <div class="col-xs-8">
		            <div id="section-1"  class="collapse in">
		            	<c:forEach items="${friends}" var="f">
		            		<div class="panel panel-warning">
								<div class="panel-heading">
									<a href="GetFriendinformation.Servlet?userID=${f}"><h4>${f}</h4></a>
									<a href="Chat.jsp?userID=${f}" class="btn btn-danger pull-right" style="margin-top:-35px;" role="button">发起会话</a>
								</div>
							</div>
						</c:forEach>
					</div>
		            <div id="section-2"  class="collapse">
		            	<c:forEach items="${Notfriends}" var="Nf">
		            		<div class="panel panel-warning">
								<div class="panel-heading">
									<h4>${Nf}</h4>
									<a href="AddFriend.Servlet?userID=${Nf}" class="btn btn-default pull-right" style="margin-top:-35px;" role="button">添加好友</a>
								</div>
							</div>
						</c:forEach>
		            </div>
		        </div>
		    </div>
		</div>
	</div>
	

	<div class="modal fade" id="opensignup" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"  aria-hidden="true">
			<div class='tb'><div class='tc'>
		    <div class="modal-dialog">
		        <div class="modal-content" style="width:300px;height:320px;">
		        	 <div class="modal-body">
		        	 	<div class="signup_kuang">
							<h1>欢迎注册</h1>
							<form action="signup">
								<input name="userID" type="text" class="signup_userID" placeholder="职工唯一号">
								<input name="password" type="password" class="signup_password" placeholder="密码">
								<input name="tellphone" type="text" class="signup_tellphone" placeholder="手机号">
								<input type="submit" class="signup_butt" value="注册">
							</form>
						</div>
		           </div>
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		    </div></div>
		</div>
		
		<div class="modal fade" id="openlogin" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"  aria-hidden="true">
			<div class='tb'><div class='tc'>
		    <div class="modal-dialog">
		        <div class="modal-content" style="width:300px;height:280px;">
		        	 <div class="modal-body">
		        	 	 <div class="login_kuang">
							<h1>登陆</h1>
							<form method="post" action="login.Servlet">
								<input name="userID" type="text" class="login_txt1" placeholder="职工唯一号">
								<input name="password" type="password" class="login_txt2" placeholder="密码">
								<input type="submit" class="login_butt" value="登陆">
							</form>
		        		</div>
		           </div>
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		    </div></div>
		</div>
	
	

    <script src="js/jquery-1.11.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script>
    $(function () { 
    		$('#section-1').on('show.bs.collapse', function () {
    			$('#section-2').collapse('hide');
    		});
    		$('#section-2').on('show.bs.collapse', function () {
    			$('#section-1').collapse('hide');
    		});
    	});
    </script>
</body>  
</html>