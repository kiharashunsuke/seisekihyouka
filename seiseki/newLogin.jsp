<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
    <title>新規アカウント登録</title>
    <link href="<%=request.getContextPath() %>/seiseki/newLogin.css" rel="stylesheet" type="text/css">
    <script>
function validateEmail() {
    var email = document.getElementById("email").value;
    var atPosition = email.indexOf("@");
    if (atPosition === -1) {
        alert("@を含めて入力してください。");
        return false;
    }
    return true;
}
</head>
<body>
    <form action="<%=request.getContextPath() %>/newLogin" method="Post">
    <div class="login">
    <p><h2 class="login-header">新規登録</h2></p>
  <form class="login-container">
            <p><input type="text" placeholder=id pattern="^[a-zA-Z0-9]+$" class="form-control" id="ID" name="id" required></p>
            <p><input type="password" placeholder=password pattern="^[a-zA-Z0-9]+$" class="form-control" id="pass" name="password" minlength="6" required></p>
            <p><input type="text" placeholder="email"  class="form-control" id="ID" name="email"  required></p>
            <p><input type="submit" value="登録" required></p>
            </form>
            </div>
    </form>
    </body>
    </html>