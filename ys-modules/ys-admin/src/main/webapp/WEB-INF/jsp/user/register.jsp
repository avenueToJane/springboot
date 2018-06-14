<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><!--  解决jsp页面中乱码的问题-->
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>注册页面</title>
<link rel="shortcut icon" href="favicon.ico">
<link
	href="${pageContext.request.contextPath}/static/css/bootstrap.min.css?v=3.3.6"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/css/font-awesome.css?v=4.4.0"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/css/plugins/iCheck/custom.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/animate.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/css/style.css?v=4.1.0"
	rel="stylesheet">

</head>

<body class="gray-bg">

	<div class="middle-box text-center loginscreen   animated fadeInDown">
		<div>
			<div>

				<h1 class="logo-name">Y</h1>

			</div>
			<h3>欢迎注册</h3>
			<p>创建一个新账户</p>
			<form class="m-t" role="form" action="login.html">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="请输入用户名"
						required="">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="请输入密码"
						required="">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="请再次输入密码"
						required="">
				</div>
				<div class="form-group text-left">
					<div class="checkbox i-checks">
						<label class="no-padding"> <input type="checkbox">
							我同意注册协议
						</label>
					</div>
				</div>
				<button type="submit" class="btn btn-primary block full-width m-b">注
					册</button>

				<p class="text-muted text-center">
					<small>已经有账户了？</small><a href="/">点此登录</a>
				</p>

			</form>
		</div>
	</div>
</body>
