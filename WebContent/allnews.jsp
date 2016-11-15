<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>allnews</title>
</head>
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
<title>无标题文档</title>  
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/rabbit.jpg");
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
    color: #FFFF00;  
}  
  
.e {  
    text-align: center;  
    vertical-align: middle;  
}  
</style>  
</head>  
<body> 
	<p align="center"><span class="a">热点新闻</span></p> 
	<c:forEach items="${News}" var="n" begin="0" end="30">
		<p align="center"><span class="d"><a href="${n.url}">${n.title}</a></span></p>
	</c:forEach>
	<p align="center"><span class="c">@BuddaUseVPN</span></p>  
	<p align="center"><span class="b">HIT</span></p>
</body>  
</html>