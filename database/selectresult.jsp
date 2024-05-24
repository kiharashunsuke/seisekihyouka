<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>生徒の成績登録ページ</title>
</head>
<body>

<h1 align = center>成績表示画面</h1>

<br>

<table border = 3 width = 80% align = center>
<%-- 1段目 --%>
	<tr>
		<th>テスト名</th>
		<th>国語</th>
		<th>数学</th>
		<th>理科</th>
		<th>社会</th>
		<th>英語</th>
		<th>合計</th>
	</tr>


<%
List<StudentBean> studentList =
(List<StudentBean>)request.getAttribute("studentList");

%>

<%--int型でデータをとるために変換 --%>
<% int studentNumber = ((Integer)(request.getAttribute("studentNumber"))); %>
	<% StudentBean sbean = studentList.get(studentNumber); %>
<%--生徒の名前も取得して分かりやすいように表示する --%>
	<h2><%=sbean.getName() %>の成績</h2>


	<tr><td>学力テスト1年生</td>
		<td>
		<%=sbean.getGakuryokutest_1_japanese() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_math() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_science() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_social() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_english() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_goukei() %>
		</td>
	</tr>
	<tr><td>学力テスト２年生</td>
		<td>
		<%=sbean.getGakuryokutest_2_japanese() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_2_math() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_2_science() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_2_social() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_2_english() %>
		</td>
		<td>
		<%=sbean.getGakuryokutest_2_goukei() %>
		</td>

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