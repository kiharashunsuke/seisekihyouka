<%@ page language="java" contentType="text/html; charset=Windows-31J"
	pageEncoding="Windows-31J"%>
<%@ page import="java.util.*"%>
<%@ page import="database.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
 <link href="<%=request.getContextPath() %>/database/resultstyle.css" rel="stylesheet" type="text/css">
<title>生徒の成績登録ページ</title>
</head>
<body>

	<h1 align=center>成績表示画面</h1>
	<hr size="6" color="#c8ad7f"noshade/>
<img src="sample_japanese.png">
<img src="sample_math.png">
<img src="sample_english.png">
<img src="sample_science.png">
<img src="sample_social.png">
<img src="sample_goukei.png">

<br>


- 		<%
			List<CustomerBean> CustomerList = (List<CustomerBean>) request.getAttribute("customerList");
/* List<StudentBean> studentList = (List<StudentBean>) request.getAttribute("studentList"); */

		%>

		int型でデータをとるために変換
		<%
			int studentNumber = ((Integer) (request.getAttribute("studentNumber")));
		%>
		<%
			CustomerBean cbean = CustomerList.get(studentNumber);
		/* StudentBean sbean = studentList.get(studentNumber); */

		%>

 <%
    // out.printを使用してクライアントにメッセージを出力
    out.print(studentNumber);
%>
<%
    // out.printを使用してクライアントにメッセージを出力
    out.print(cbean.getName());
%>

<%-- 戻る画面のリンク --%>
<%--生徒選択画面はSelectServletからデータを受け取っているのでリンクを張るのではなく
servletを呼び出す必要がある。 --%>

    <form action="<%=request.getContextPath()%>/database/main.jsp" method="Post">
        <button type="submit" class="button">トップページへ</button>
    </form>


</body>
</html>