<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>テストの結果入力ページ</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/dataInput" method="Post">
<h1 align = center>テスト結果入力</h1>

<table border = 3 width = 80% align = center>
<tr>
		<%-- <th>名前</th>
		<td><input type="text" class="form-control" id="name" name="name"></td> --%>
		<th>生徒番号</th>
		<td><input type="text" class="forn-control" pattern="^[a-zA-Z0-9]+$" id="no" name="stu_no"></td>
		<th>国語</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="japanese"></td>
		<th>数学</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="math"></td>
		<th>理科</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="science"></td>
		<th>社会</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="social"></td>
		<th>英語</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="english"></td>
		<th>合計</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="goukei"></td>
		<td>
            <input type="submit" value="追加" required>
        </td>
	</tr>
	</table>
	</form>
    <button onclick="location.href='/seiseki/Main/Main.jsp'">トップページへ</button>
</body>
</html>