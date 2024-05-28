<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="login.LoginBean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<link href="<%=request.getContextPath() %>/intro/log.css" rel="stylesheet" type="text/css">
<title>ログインページ</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/login" method="Post">
<div class="login">
  <form class="login-container">

            <p><input type="text" placeholder="id" align="center" pattern="^[a-zA-Z0-9]+$" class="form-control" id="ID" name="id" required></p>

            <p><input type="password" placeholder="password" align="center" pattern="^[a-zA-Z0-9]+$" class="form-control" id="pass" name="password" minlength="6" required></p>

            <p><input type="submit" value="ログイン" align="center" required></p>

            <div class="center"><a href="<%=request.getContextPath() %>/intro/passReset.jsp">パスワードを忘れた方はこちら</a></div>

            </form>
			<%
				LoginBean userinfo = (LoginBean) request.getAttribute("result");
				if (userinfo != null) {
					if (userinfo.getLogin_user_flg() == 1) {
			%>
			 <p align="center" ><font color="red" size="5" face="ＭＳ Ｐ明朝,ＭＳ 明朝">IDまたはパスワードに不備があります</font></p>
			<%
				}
				}
			%>

		</form>
		<div id="ww_89a33d676fa9f" v='1.3' loc='id' a='{"t":"horizontal","lang":"ja","sl_lpl":1,"ids":[],"font":"Arial","sl_ics":"one_a","sl_sot":"celsius","cl_bkg":"image","cl_font":"#FFFFFF","cl_cloud":"#FFFFFF","cl_persp":"#81D4FA","cl_sun":"#FFC107","cl_moon":"#FFC107","cl_thund":"#FF5722"}'>More forecasts:
            <a href="https://oneweather.org/ja/tokyo/10_days/" id="ww_89a33d676fa9f_u" target="_blank">天気 10日間 東京</a></div>
            <script async src="https://app2.weatherwidget.org/js/?id=ww_89a33d676fa9f"></script>
            </div>

</body>
</html>