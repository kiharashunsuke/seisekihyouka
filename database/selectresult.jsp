<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>お客様検索結果ページ</title>
</head>
<body>

<h3>検索結果です</h3>
<%-- SelectServletの呼び出し --%>
<form action = "<%=request.getContextPath() %>/select" method = "Post">
<%-- テストの種類選択<select> --%>
<select name = "test">
	<option value = "tyukan_1_1">1年１学期中間テスト</option>
	<option value = "kimatu_1_1">1年１学期期末テスト</option>
	<option value = "tyukan_1_2">1年２学期中間テスト</option>
	<option value = "kimatu_1_2">1年２学期期末テスト</option>
	<option value = "gakuryokutest_1">1年学力テスト</option>
	<option value = "tyukan_2_1">２年１学期中間テスト</option>
	<option value = "kimatu_2_1">２年１学期期末テスト</option>
	<option value = "tyukan_2_2">２年２学期中間テスト</option>
	<option value = "kimatu_2_2">２年２学期期末テスト</option>
	<option value = "gakuryokutest_2">２年学力テスト</option>
	<option value = "tyukan_3_1">３年１学期中間テスト</option>
	<option value = "kimatu_3_1">３年１学期期末テスト</option>
	<option value = "tyukan_3_2">３年２学期中間テスト</option>
	<option value = "kimatu_3_2">３年２学期期末テスト</option>
	<option value = "gakuryokutest_3">３年学力テスト</option>
</select>
<br>
<%-- <table>作成 --%>
<table border = 3 width = 80% align = center>
<%-- 1段目 --%>
	<tr>
		<th>氏名</th>
		<th>国語</th>
		<th>数学</th>
		<th>理科</th>
		<th>社会</th>
		<th>英語</th>
		<th>合計</th>
	</tr>



<%--
 繰り返しによる処理を用いて、１列のみの記述で済む
 studentListの呼び出し、for文で繰り返し。数はstudentList.size()で
 DBのデータが変更されてもその分増減する。
 for文の｛｝で囲まれた範囲が繰り返されるため、記述場所に注意。
 --%>
<%
		List<StudentBean> studentList =
		(List<StudentBean>)request.getAttribute("studentList");
	for(int i = 0; i < studentList.size(); i++){
		StudentBean sbean = studentList.get(i);

%>
	<tr>
	   <td>
		<%=sbean.getName() %>
		</td>


		<td><input type = "text" name = "japanese"></td>
		<td><input type = "text" name = "math"></td>
		<td><input type = "text" name = "science"></td>
		<td><input type = "text" name = "social"></td>
		<td><input type = "text" name = "english"></td>
		<td><input type = "text" name = "goukei"></td>
	</tr>
<%
}
%>


</table>


<%-- 送信ボタンの作成 --%>
<br><br>
<input type = "submit" value = "上記の内容で登録">
</form>
<%-- 戻る画面のリンク --%>
<a href="<%=request.getContextPath()%>/database/selecttop.jsp">お客様検索トップ画面に戻る
</a>
</body>
</html>