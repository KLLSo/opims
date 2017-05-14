<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	#bj{
	width:1002px;
	height:599px;
	margin-top:50px;
	margin-left:212px;
	background-image:url("images/login.jpg");
	}
	#centerbt{
	width:409px;
	height:276px;
	margin-top:254px;
	margin-left:384px;
	}
	t1{
		margin-top:100px;
	}
	</style>
  </head>
  
  <body>
  	<div id="bj">
  		<div id="leftbt"></div>
  		<div id="centerbt">
  		  	<form id="form1" method="post" action="Main.jsp">
  		  	用户名：<br/>
  		  	<input type="text" name="username" size=25/><br/>
  		  	<br/>
  		  	密码：<br/>
  		  	<input id="t1" type="text" name="password" size=25/><br/>
  		  	<br/>
  		  	<input type="button" value="注册账号" onclick="window.location.href='register.jsp'" style="height:36px;width:77px">
  		  	<input type="submit" value="登陆" style="height:36px;width:77px">
  		  	<input type="reset" value="重置" style="height:36px;width:77px">
  			</form>
  		</div>
  		<div id="rightbt"></div>
  </div>
  </body>
</html>
