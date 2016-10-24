<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyInformattion</title>
<style type="text/css">
body{margin:0;padding:0;background:url("images/login_bg.jpg");}

</style>
<script language="javascript">
function getInformation() 
{
	window.location.href = "/getMyInformation.Servlet";
}
</script>
</head>
<body>
		<h3>用户名：${user.userID}</h3>
		<h3>密码：${user.password}</h3>
		<h3>电话：${user.tellphone}</h3>
</body>
</html>
