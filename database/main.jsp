<%@ page language="java" contentType="text/html; charset=windows-31J"
    pageEncoding="windows-31J"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<link href="<%=request.getContextPath() %>/database/mainstyle.css" rel="stylesheet" type="text/css">
<title>�g�b�v�y�[�W</title>
</head>
<body>
<h1 align=center>���ѕ]���Ǘ��V�X�e��</h1>

<br><br>

<a href="<%=request.getContextPath()%>/log/log.jsp" class="button">���O�A�E�g</a>
<%-- <form action="<%=request.getContextPath()%>/log" method="Post">
    <button type="submit" class="button">���O�A�E�g</button>
</form> --%>
<!-- <a></a>��<form></form>�̂ǂ��������g�� -->
<br>
<hr size="6" color="#c8ad7f"noshade/>
<br>


<a href="<%=request.getContextPath()%>/introduction/hello.html" class="button1">�V�K�ǉ���</a>
<%-- <form action="<%=request.getContextPath()%>/" method="Post">
    <button type="submit" class="button1">�V�K�ǉ�</button>
</form> --%>
<!-- <a></a>��<form></form>�̂ǂ��������g�� -->
<br>
<br>
<br>
<br>


<div class="form">
<form action="<%=request.getContextPath()%>/select" method="Post">
    <button type="submit" class="button2">�O���t�\����</button>
</form>
<br>

<form action="<%=request.getContextPath() %>/input" method ="Post">
<button type = "submit" class="button3">�\�̕\����</button>
</form>
</div>

</body>
</html>