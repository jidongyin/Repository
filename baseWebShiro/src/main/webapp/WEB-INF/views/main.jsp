<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>叩丁狼PSS（演示版）</title>
	<link href="/static/style/main_css.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="/static/js/jquery.js"></script>
	<script type="text/javascript" src="/static/js/main.js"></script>
</head>
<body>
    <div class="top">
    	<div class="logo">
    		<h3>广州叩丁狼教育科技有限公司</h3>
    	</div>
    	<div class="userinfo">
			当前登陆用户：<shiro:principal></shiro:principal>
			<a href="/loginOut">退出</a>
    	</div>
    </div>
    <div class="center">
    	<div class="center_left">
    		<ul>
    			<li>
    				<a href="javascript:;" class="changePage" data-url="/employee">员工管理</a>
    			</li>
    			<li>
    				<a href="javascript:;" class="changePage"  data-url="/department">部门管理</a>
    			</li>
    		</ul>
    	</div>
    	<div class="center_content">
    		<iframe name="right" id="rightMain" src="/welcome.jsp" frameborder="no" scrolling="auto" width="100%" height="100%" allowtransparency="true">
    		</iframe>
    	</div>
    </div>
</body>
</html>