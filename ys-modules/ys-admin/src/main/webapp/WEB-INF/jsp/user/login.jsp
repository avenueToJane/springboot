<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><!--  解决jsp页面中午乱码的问题-->
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

<title>登录页面</title>
<link
	href="${pageContext.request.contextPath}/static/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/css/font-awesome.css?v=4.4.0"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/animate.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/style.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/login.css"
	rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script> 
</head>

<body class="signin">
	<div class="signinpanel">
		<div class="row">
			<div class="col-sm-7"></div>
			<div class="col-sm-5">
				<form>
					<h4 class="no-margins">登录：</h4>
					<input id="account" type="text" class="form-control uname" placeholder="用户名" />
					<input id="password" type="password" class="form-control pword m-b"
						placeholder="密码" /> <a href="">忘记密码了？</a>
					<button class="btn btn-success btn-block" onclick="login()">登录</button>
				</form>	
			</div>
			
			<div class="col-sm-8"></div>
			<div class="col-sm-4">
			<div class="signin-info">

				<strong>还没有账号？ <a href="register">立即注册&raquo;</a></strong>
			</div>
      </div>
		</div>
		<div class="signup-footer">
			<div class="pull-left">&copy; 2018 All Rights Reserved. ys</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/static/modular/user/user.js"></script>
