<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>allnews</title>
<link type="text/css" rel="stylesheet" href="css/alltalk.css">
</head>
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
<title>无标题文档</title>  
<style type="text/css">
body{margin:0;padding:0;
background-image:url("images/cat.jpg");
background-attachment: fixed;
background-repeat: no-repeat;
background-size: cover;}

</style>
<style type="text/css">  
.a {  
    font-family: "Times New Roman";  
    font-size: 30px;  
    font-style: normal;  
    line-height: 40px;  
    font-weight: bolder;  
    font-variant: normal;  
    color: #FF6600;  
    text-align: center;  
}  
.b {  
    font-size: 12px;  
    font-style: normal;  
    font-weight: normal;  
    font-variant: normal;  
    color: #FF0000;  
}  
.c {  
    font-family: "Times New Roman";  
    font-size: 12px;  
    font-style: normal;  
    line-height: normal;  
    font-weight: bolder;  
    font-variant: normal;  
    color: #FF0000;  
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
	<p align="left"><span class="a">热点话题</span></p>
	<p align="center"><a href="GiveTalk.jsp" class="a_demo_two">发表话题</a></p>  
	<c:forEach items="${Talks}" var="t">
		<p align="left"><span class="d"><a href="getTalksComment.Servlet?title=${t.title}&text=${t.text}&userID=${t.userID}">${t.title}</a></span></p> 
		 <!--<p>${t.userID}</p>
		<p>${t.title}</p>
		<p>${t.text}</p>-->
	</c:forEach>
	<p align="left"><span class="c">@BuddaUseVPN</span></p>  
	<p align="left"><span class="b">HIT</span></p>  
</body>  
</html>