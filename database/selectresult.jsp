<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>生徒の成績登録ページ</title>
<link href="css/common.css" rel="stylesheet" type="text/css"
media="all">
</head>
<body>
<%--選択した生徒とテスト名からデータを参照し表示するページ --%>
<h1 align = center>成績表示画面</h1>

<br>

<table border = 3 width = 80% align = center>

	<tr>
		<th></th>
		<th>国語</th>
		<th>数学</th>
		<th>理科</th>
		<th>社会</th>
		<th>英語</th>
		<th>合計</th>
	</tr>


<%
List<StudentBean> scoreList =
(List<StudentBean>)request.getAttribute("scoreList");

%>

<%--int型でデータをとるために変換 --%>
<% int studentNumber = ((Integer)(request.getAttribute("studentNumber"))); %>
	<% StudentBean sbean = scoreList.get(studentNumber); %>
<%--生徒の名前も取得して分かりやすいように表示する --%>
	<h2><%=sbean.getName() %>の成績</h2>
<%--テストの種類も表示する --%>
<h3 align = center><%=request.getAttribute("tableName") %></h3>
	<tr><td>点数</td>
		<td>
		<%=sbean.getJapanese() %>
		</td>
		<td>
		<%=sbean.getMath() %>
		</td>
		<td>
		<%=sbean.getScience() %>
		</td>
		<td>
		<%=sbean.getSocial() %>
		</td>
		<td>
		<%=sbean.getEnglish() %>
		</td>
		<td>
		<%=sbean.getGoukei() %>
		</td>
	</tr>
	<tr><td>平均点</td>
		<td><%=request.getAttribute("avgJ") %></td>
		<td><%=request.getAttribute("avgM") %></td>
		<td><%=request.getAttribute("avgSC") %></td>
		<td><%=request.getAttribute("avgSo") %></td>
		<td><%=request.getAttribute("avgE") %></td>
		<td><%=request.getAttribute("avgG") %></td>
	</tr>

</table>


<br><br>

<%-- 戻る画面のリンク --%>
<br><br>
<%--生徒選択画面はSelectServletからデータを受け取っているのでリンクを張るのではなく
servletを呼び出す必要がある。 --%>
<form action = "<%=request.getContextPath() %>/select" method = "Post">
<input type = "submit" value = "生徒選択へ">
</form><br>
<%--メイン画面はリンクでよいが、データを扱っている場合上と同様 --%>
<a href="<%=request.getContextPath()%>/database/main.jsp">メイン画面に戻る</a>
</body>
</html>