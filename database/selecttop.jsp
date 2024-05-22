<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
    <%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>生徒選択画面</title>
</head>
<body>
<%--servletの呼び出しs --%>
<form action = "<%=request.getContextPath() %>/top" method = "Post">
<%-- nameはservletと一致させる必要あり。 --%>
<select name = "number">
<%--リストを取得。繰り返し分で人数分表示 --%>
<%
		List<StudentBean> studentList =
		(List<StudentBean>)request.getAttribute("studentList");
	for(int i = 0; i < studentList.size(); i++){
		StudentBean sbean = studentList.get(i);

%>
<%--選択肢が生徒の名前で、送信されるデータは番号になる --%>
	<option value ="<%=sbean.getStudent_no() %>"><%=sbean.getName() %></option>
<%
}
%>
</select>
<br>
<%--二つ目のセレクトボックス --%>
<select name = "tableName">
<%--リストを取得。繰り返し分で人数分表示 --%>
<%

		List<TableBean> tableList =
		(List<TableBean>)request.getAttribute("tableList");
	for(int j = 0; j < tableList.size(); j++){
		TableBean tbean = tableList.get(j);

%>
<%--選択肢、送信されるデータはDBに存在するテーブル名になる --%>
	 <option value ="<%=tbean.getTableName() %>"><%=tbean.getTableName() %></option>
<%
}
%>
</select>
<%--formにより、データの送信と画面遷移が行われる。 --%>
<input type="submit" value="成績表示">
</form>
</body>
</html>
