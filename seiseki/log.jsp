<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="seiseki.LoginBean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<link href="<%=request.getContextPath() %>/seiseki/log.css" rel="stylesheet" type="text/css">
<title>ログインページ</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/login" method="Post">
<div class="login">
  <form class="login-container">

            <p><input type="text" placeholder="id" align="center" pattern="^[a-zA-Z0-9]+$" class="form-control" id="ID" name="id" required></p>

            <p><input type="password" placeholder="password" align="center" pattern="^[a-zA-Z0-9]+$" class="form-control" id="pass" name="password" minlength="6" required></p>

            <p><input type="submit" value="ログイン" align="center" required></p>

            <div class="center"><a href="<%=request.getContextPath() %>/intro/passReset.jsp">パスワード忘れた方はこちら</a></div>

            </form>
            </div>
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
</body>
</html>