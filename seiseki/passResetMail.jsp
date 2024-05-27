<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
    <title>パスワード変更</title>
    <link href="<%=request.getContextPath() %>/seiseki/newLogin.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form action="<%=request.getContextPath() %>/passResetMail" method="Post">
    <div class="login">
  <form class="login-container">
            <p><input type="text" placeholder=id pattern="^[a-zA-Z0-9]+$" class="form-control" id="ID" name="id" required></p>
            <%-- <p><input type="text" placeholder="email"  class="form-control" id="ID" name="email"  required></p> --%>
            <p><input type="password" placeholder=password pattern="^[a-zA-Z0-9]+$" class="form-control" id="password" name="password" minlength="6" required></p>
            <p><input type="submit" value="パスワード変更" required></p>
            </form>
            </div>
    </form>


</body>
</html>