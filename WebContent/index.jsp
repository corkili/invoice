<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!--  Page title -->
		<title>登录界面</title>
		<!-- End of Page title -->
		<!-- Libraries -->
		<link type="text/css" href="css/login.css" rel="stylesheet" />
		<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
		<script type="text/javascript" src="js/easyTooltip.js"></script>
		<script type="text/javascript" src="js/jquery-ui-1.7.2.custom.min.js"></script>
		<!-- End of Libraries -->
</head>
<body>
	<!--SIGN UP-->
	<h1>Login</h1>
	<div class="login-form">
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
		<div class="clear"> </div>
		<div class="avtar">
		<img src="images/avtar.png" />
		</div>
		<form action="LoginServlet" method="post">
			<input type="text" class="text" value="" name="username" />
			<input type="password" value="" name="password" />
			<div class="login">
			<input type="submit" value="login" style="cursor:pointer" />
			</div>
		</form>
		</div>
	<div class="copy-rights">
					<p>Copyright &copy; 2017.Ran All rights reserved.<a target="_blank" ></a></p>
	</div>
</body>
</html>