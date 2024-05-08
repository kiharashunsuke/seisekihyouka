<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="login.LoginBean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>ログインページ</title>
</head>
<body>

	<div class="mx-auto" style="width: 300px;">
		<h1 class="mb-3" style="text-align: center">ログイン画面</h1>
		<form action="<%=request.getContextPath()%>/login" method="Post">
			<div class="mb-3">
				<label for="ID" class="form-label">id</label> <input type="text"
					class="form-control" id="ID" name="id" required>
			</div>
			<div class="mb-3">
				<label for="pass" class="form-label">password</label> <input
					type="password" class="form-control" id="pass" name="password"
					required>
			</div>
			<button type="submit" class="btn btn-primary" required>login</button>
			<%
				LoginBean userinfo = (LoginBean) request.getAttribute("result");
				if (userinfo != null) {
					if (userinfo.getLogin_user_flg() == 1) {
			%>
			IDまたはパスワードに不備があります
			<%
				}
				}
			%>
		</form>
	</div>
</body>
</html>