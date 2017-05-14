<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册新用户页面</title>
    
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
    <div id="bj" align="center">
    <h1 style="color:orange; font-size:25px">注册您的用户信息</h1>
    <form id="form2" method="post" action="sucess.jsp">
    	账号: <input type="text" name="zhanghao"><font color="red">(*)</font><hr/>
    	密码: <input type="text" name="password1"><font color="red">(*)</font><hr/>
    	确认密码: <input type="text" name="password2"><font color="red">(*)</font><hr/>
    	用户(企业)名: <input type="text" name="username"><font color="red">(*)</font><hr/>
    	真实姓名: <input type="text" name="name"><font color="red">(*)</font><hr/>
    	电子邮箱: <input type="text" name="mail"><hr/>
    	电话号码: <input type="text" name="telphonenumber"><font color="red">(*)</font><hr/>
    	<font color="red" size=2>(*)标记的为必填项</font><br/>
  		<input type="submit" value="提交" style="height:36px;width:77px">
  		<input type="reset" value="重置" style="height:36px;width:77px">
    </form>
    </div>
  </body>
</html>
