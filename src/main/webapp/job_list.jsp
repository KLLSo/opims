<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <title>jobQuery.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="Css/style.css" />
    <script type="text/javascript" src="Js/bootstrap.js"></script>
    <script type="text/javascript" src="Js/ckform.js"></script>
    <script type="text/javascript" src="Js/common.js"></script>
    <style type="text/css">
        body {font-size: 20px;
		font-size: 20px;
            padding-bottom: 40px;
            background-color:#e9e7ef;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }
    </style>
  </head>
  
  <body>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>兼职名称</th>
        
        <th>分类</th>
        <th>详情</th>
        <th>兼职时长</th>
        <th>发布者</th>
        <th>发布日期</th>
        
        
    </tr>
    </thead>
	     
        <tr>
                <td>复仇者联盟</td>
                <td>电影</td>
				<td><a href="#" id="xiangqing"  rel="popover"  data-original-title="公告标题"data-content="后来回头的时候，才发现那时候可能是最好的时光，再也回不去的时光，再也做不了的事，再也鼓不起的勇气，再也浪不起来的我们">详情</a></td>               
                <td>3h</td>
                <td>小强</td>
                <td>2016.07.22</td>       
        </tr>
           
       
       </table>
  </body>
</html>
