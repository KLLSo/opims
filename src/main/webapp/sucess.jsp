<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册成功</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
	#bj{
	width:1002px;
	height:599px;
	margin-top:50px;
	margin-left:212px;
	background-image:url("images/zhuce.jpg");
	}
	h1{
	margin-top:150px;
	}
	</style>
  </head>
  
  <body>
  <%String zhanghao;%>
  <%zhanghao = request.getParameter("zhanghao"); %>
    <div id="bj" align="center">
    	<h1 style="color:orange; font-size:25px">恭喜您注册成功！</h1>
    	<form method="post" action="login.jsp">
    		您的账号为:<%=zhanghao%>
    		<br/><br/>
    		<input type="submit" value="返回登陆页面">
    	</form> 	
    </div>
  </body>
</html>
