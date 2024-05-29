<%@ page language="java" contentType="text/html; charset=windows-31J"
    pageEncoding="windows-31J"%>
<%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
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

<a href="<%=request.getContextPath()%>/seiseki/log.jsp" class="button">ログアウト</a>

<br>
<hr size="6" color="#c8ad7f"noshade/>
<br>

<div class="name">生徒名：</div>
  <!-- servletの呼び出し -->

<form action = "<%=request.getContextPath() %>/top" method = "Post">
<!-- nameはservletと一致させる必要あり。 -->
<select name = "number">
 <%
				List<CustomerBean> customerList =
				(List<CustomerBean>)request.getAttribute("customerList");
			for(int i = 0; i < customerList.size(); i++){
				CustomerBean cbean = customerList.get(i);
%>
<!-- 選択肢が生徒の名前で、送信されるデータは番号になる -->
<option value ="<%=cbean.getStudent_no() %>"><%=cbean.getName() %></option>

<%
}
%>
</select>

<br><br>

<div class="area1">テスト範囲を選択してください:</div>
<select name = "starttest">
<option value="0">1年1学期中間テスト
<option value="1">1年1学期期末テスト
<option value="2">1年2学期中間テスト
<option value="3">1年2学期期末テスト
<option value="4">2年1学期中間テスト
<option value="5">2年1学期期末テスト
<option value="6">2年2学期中間テスト
<option value="7">2年2学期期末テスト
<option value="8">3年1学期中間テスト
<option value="9">3年1学期期末テスト
<option value="10">3年2学期中間テスト

</option>
</select>



<select name = "endtest">
<option value="1">1年1学期期末テスト
<option value="2">1年2学期中間テスト
<option value="3">1年2学期期末テスト
<option value="4">2年1学期中間テスト
<option value="5">2年1学期期末テスト
<option value="6">2年2学期中間テスト
<option value="7">2年2学期期末テスト
<option value="8">3年1学期中間テスト
<option value="9">3年1学期期末テスト
<option value="10">3年2学期中間テスト
<option value="11">3年2学期期末テスト
</option>
</select>
<br><br>

<a href="<%=request.getContextPath()%>/introduction/hello.html" class="button1">新規追加へ</a>
<%-- <form action="<%=request.getContextPath()%>/" method="Post">
    <button type="submit" class="button1">新規追加</button>
</form> --%>
<!-- <a></a>か<form></form>のどっちかを使う -->
<br>
<br>
<br>
<br>


<!-- <div class="form"> -->
<%-- <form action="<%=request.getContextPath()%>/select" method="Post"> --%>
    <button type="submit" class="button2">グラフ表示へ</button>
</form>
<br>

<form action="<%=request.getContextPath() %>/input" method ="Post">
<button type = "submit" class="button3">表の表示へ</button>
</form>
<!-- </div> -->

</body>
</html>