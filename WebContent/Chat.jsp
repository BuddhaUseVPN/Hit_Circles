<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>My WebSocket</title>
    
  </head>
   
  <body>
  	<div class="container" style="margin-top:80px;height:100%;width:60%;">
		    <div class="row clearfix">
		        <div class="col-md-4 column">
		        	<img src="images/头像.png" style="height:30%;width:30%;">
		        	<h4><%=request.getParameter("userID") %></h4>
		        </div>
		        <div class="col-md-8 column">
		        	<div id="message"></div>
			            <div style="position:fixed;bottom:50px;">
				            <textarea id="text" style="height:80px;width:400px;border:1px solid #f0ad4e;">
				            </textarea>
				            <h4></h4>
				            <button type="button" class="btn btn-info" onclick="send()">发送</button>    
		                	<button type="button" class="btn btn-danger" onclick="closeWebSocket()">关闭</button>
	                	</div>
		    	</div>
		</div>
  	</div>
  </body>
   
   <script src="js/jquery-1.11.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
   <script src="js/bootstrap.min.js"></script>

   
   <script type="text/JavaScript">
      var websocket = null;
       
      //判断当前浏览器是否支持WebSocket
      if('WebSocket' in window){
          websocket = new WebSocket("ws://localhost:8080/Hit_Circles/com.websocket");
      }
      else{
          alert('Not support websocket')
      }
       
      //连接发生错误的回调方法
      websocket.onerror = function(){
          setMessageInnerHTML("error");
      };
       
      //连接成功建立的回调方法
      websocket.onopen = function(event)
      {
          //setMessageInnerHTML("open");
      }
       
      //接收到消息的回调方法
      websocket.onmessage = function(){
          setMessageInnerHTML(event.data);
      }
       
      //连接关闭的回调方法
      websocket.onclose = function(){
          setMessageInnerHTML("close");
      }
       
      //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
      window.onbeforeunload = function(){
          websocket.close();
      }
       
      //将消息显示在网页上
      function setMessageInnerHTML(innerHTML){
          document.getElementById('message').innerHTML += '<h3><span class="label label-info">' + innerHTML + '</span><h3/>';
      }
       
      //关闭连接
      function closeWebSocket(){
          websocket.close();
      }
       
      //发送消息
      function send(){
          var message = document.getElementById('text').value;
          websocket.send(message);
      }
  </script>
</html>
		           