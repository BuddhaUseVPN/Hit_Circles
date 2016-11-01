<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hit_Circles</title>
</head>
<script language="javascript">
	var XMLHttpReq;
	function createXMLHttpRequest()
	{
		if(window.XMLHttpRequest)
			XMLHttpReq = new XMLHttpRequest();
		else if(window.ActiveXobject)
			{
				try
				{
					XMLHttpReq = new ActiveXobject("Msxml2.XMLHTTP");
				}
				catch(e)
				{
					try
					{
						XMLHttpReq = new ActiveXobject("Microsoft.XMLHTTP");
					}
					catch(e){}
				}
			}
	}
	
	function sendRequest()
	{
		createXMLHttpRequest();
		XMLHttpReq.open("GET","auto",true);
		XMLHttpReq.onreadystatechange = processResponse;
		XMLHttpReq.send(null);
	}
	
	function processResponse()
	{
		if(XMLHttpReq.readyState==4)
			{
				if(XMLHttpReq.status==200)
					{
						var cookie1 = document.cookie.split(';');
						for(var i=0;i<cookie1.length;i++)
						{
							var cookie2 = cookie1[i].split('=');
							if(cookie2[0]=="userID")
								return cookie2[1];
						}
						
					}
			}
		else
			{
				window.alert("页面异常");
			}
	}

</script>

<frameset rows="90,*" framespacing="0">
			<frame src="top.jsp" name="top">
			<frameset cols="120,*" frameborder="yes">
				<frame src="left.jsp" name="left">
				<frame src="main.jsp" name="main">
			</frameset>
</frameset>

<body>
</body>
</html>