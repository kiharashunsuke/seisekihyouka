<%@ page language="java" contentType="text/html; charset=windows-31j"
	pageEncoding="windows-31j"%>
<%@ page import="login.LoginBean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<link href="<%=request.getContextPath() %>/css/loginstyle.css" rel="stylesheet" type="text/css">
<title>ログインページ</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/login" method="Post">
	<hr size="3" noshade/>
    <table id="login" border="2">
        <caption>
            <b>ログイン</b><br/>
        </caption>
        <tr>
            <th>ID</th>
            <td><input type="text" class="form-control" id="ID" name="id" required></td>
            <td rowspan="2">
            </td>
        </tr>
        <tr>
            <th>Password</th>
            <td><input type="password" class="form-control" id="pass" name="password" required></td>
        </tr>
        <td>
            <input type="submit" value="ログイン" required>
            </td>
            </table>
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