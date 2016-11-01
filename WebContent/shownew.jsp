<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
<title>无标题文档</title>  
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/pandanew.jpg");
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;}

</style>
<style type="text/css">  
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

<p align="center"><span class="a">标题</span></p>  
<table align="center">  
<tr>  
<td height="17"><span class="b">xxxx年xx月xx日xx:xx</span></td>  
<td><span class="b">供稿中心: XXXXX部门</span></td>  
</tr>  
</table>  
<hr/>  
  
<p><span class="d">第一段</span></p>    
<p><span class="d">第二段</span></p>  
<p><span class="d">第三段</span></p>  
<p><span class="d">第n段</span></p>  
<hr/>  

<p><span class="a">评论区</span></p>  
<table>
<tr><td align="left">用户1</td></tr>
<tr><td><p><span class="d">评论内容XXXXX</span></p> </td></tr>
<tr><td align="left">用户2</td></tr>
<tr><td><p><span class="d">评论内容XXXXX</span></p> </td></tr>
<tr><td align="left">用户3</td></tr>
<tr><td><p><span class="d">评论内容XXXXX</span></p> </td></tr>
<tr><td align="left">用户n</td></tr>
<tr><td><p><span class="d">评论内容XXXXX</span></p> </td></tr>
</table>
<hr/>  
<form method="post" action="setNewsComment.Servlet">
		<table>
		<tr>
		<td>发表评论</td>
		</tr>
		<tr>
			<td>
				<textarea name="comment" rows="6" cols="75"></textarea>
			</td>
		</tr>
		<tr><td><input type="button" value="提交"></td></tr>
		</table>
	</form>
</body>
</html>