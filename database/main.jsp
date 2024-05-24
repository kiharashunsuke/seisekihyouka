<%@ page language="java" contentType="text/html; charset=windows-31J"
    pageEncoding="windows-31J"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>さまざまなリンクのページ</title>
</head>
<body>


<p><a href="/mywebsite/introduction/hello.html"><input type="submit" value="3年1組個人ページ"></a></p>
<br>
<a href="<%=request.getContextPath() %>/introduction/hello.html">
<input type="submit" value="〇〇(JSP特有パス指定)"></a>


<br><br>





<p><a href="/mywebsite/hello.html"><input type="submit" value="3年2組個人ページ(通常パス指定)"></a></p>
<br>
<a href="<%=request.getContextPath() %>/firstpage"><input type="submit" value="〇〇(JSP特有パス指定)"></a>
<br>
<p><a href="../hello.html"><input type="submit" value="新規追加(相対パス指定)"></a></p>
<br><br>


<form action="<%=request.getContextPath() %>/select" method="Post">
<input type = "submit" value = "生徒選択へ">
</form>

</body>
</html>