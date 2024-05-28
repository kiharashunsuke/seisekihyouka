<%@ page language="java" contentType="text/html; charset=windows-31J"
    pageEncoding="windows-31J"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<link href="<%=request.getContextPath() %>/database/mainstyle.css" rel="stylesheet" type="text/css">
<title>トップページ</title>
</head>
<body>
<h1 align=center>成績評価管理システム</h1>

<br><br>

<a href="<%=request.getContextPath()%>/log/log.jsp" class="button">ログアウト</a>
<%-- <form action="<%=request.getContextPath()%>/log" method="Post">
    <button type="submit" class="button">ログアウト</button>
</form> --%>
<!-- <a></a>か<form></form>のどっちかを使う -->
<br>
<hr size="6" color="#c8ad7f"noshade/>
<br>


<a href="<%=request.getContextPath()%>/introduction/hello.html" class="button1">新規追加へ</a>
<%-- <form action="<%=request.getContextPath()%>/" method="Post">
    <button type="submit" class="button1">新規追加</button>
</form> --%>
<!-- <a></a>か<form></form>のどっちかを使う -->
<br>
<br>
<br>
<br>


<div class="form">
<form action="<%=request.getContextPath()%>/select" method="Post">
    <button type="submit" class="button2">グラフ表示へ</button>
</form>
<br>

<form action="<%=request.getContextPath() %>/input" method ="Post">
<button type = "submit" class="button3">表の表示へ</button>
</form>
</div>

</body>
</html>