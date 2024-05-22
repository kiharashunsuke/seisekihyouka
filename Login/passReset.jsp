<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>パスワード再設定ページ</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/passReset" method="Post">
<hr size="3" noshade/>
    <table id="pass" border="2">
        <caption>
            <b>IDを入力してください</b><br/>
        </caption>
        <tr>
            <th>ID</th>
            <td><input type="text" class="form-control" id="ID" name="id"  required></td>
            <td rowspan="2">
            </td>
        </tr>
        <tr>
            <th>Password</th>
            <td><input type="password" class="form-control" id="password" name="password"  required></td>
            <td rowspan="2">
            </td>
        </tr>
        <td>
         <input type="submit" value="パスワード変更" required>
            </td>
            </table>
            </form>
</body>
</html>