<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
    <title>�V�K�A�J�E���g�o�^</title>
    <link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form action="<%=request.getContextPath() %>/newLogin" method="Post">
    <hr size="3" noshade/>
    <table id="login" border="2">
        <caption>
            <b>�V�K�o�^</b><br/>
        </caption>
        <tr>
            <th>ID</th>
            <td><input type="text" class="form-control" id="ID" name="id"></td>
            <td rowspan="2">
            </td>
        </tr>
        <tr>
            <th>Password</th>
            <td><input type="password" class="form-control" id="pass" name="password"></td>
        </tr>
        <td>
            <input type="submit" value="���O�C��" required>
        </td>
    </table>
    </form>