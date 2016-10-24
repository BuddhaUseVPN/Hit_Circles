<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>alltalks</title>
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/talk.jpg");
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
	<form method="post" action="InsertTalk.Servlet">
		<table>
		<tr>
			<td>话题标题</td>
			<td><input name="Title" type="text"></td>
		</tr>
		<tr>
			<td>话题内容</td>
			<td>
				<textarea name="Text" rows="20" cols="65"></textarea>
			</td>
		</tr>
		<tr align="center">
		<td></td><td><input type="button" value="提交" class="a_demo_three"></td></tr>
		</table>
	</form>
</body>
</html>