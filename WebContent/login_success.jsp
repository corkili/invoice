<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!-- Page title -->
	<title>login_success页面</title>
	<!-- End of Page title -->
	<!-- Libraries -->
		<link type="text/css" href="css/login.css" rel="stylesheet" />
		<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
		<script type="text/javascript" src="js/easyTooltip.js"></script>
		<script type="text/javascript" src="js/jquery-ui-1.7.2.custom.min.js"></script>
	<!-- End of Libraries -->
</head>
<body>
	<jsp:useBean id="loginUser" class="org.invoice.entity.User" scope="session"></jsp:useBean>
	<div id="container">
		<div id="box">
			欢迎您<font color="red">
			<jsp:getProperty property="username" name="loginUser"/>
			</font>
			,登录成功！
		</div>
	</div>
</body>
</html>