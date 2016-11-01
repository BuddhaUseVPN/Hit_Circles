<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>alltalks</title>
</head>
<body>
	<form method="post" action="InsertTalk.Servlet">
		<tbody>
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
		<tr><td><input type="button" value="提交"></td></tr>
		</tbody>
	</form>
</body>
</html>