<%@ page language="java" contentType="text/html; charset=windows-31J"
    pageEncoding="windows-31J"%>
<%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
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

<a href="<%=request.getContextPath()%>/seiseki/log.jsp" class="button">���O�A�E�g</a>

<br>
<hr size="6" color="#c8ad7f"noshade/>
<br>

<div class="name">���k���F</div>
  <!-- servlet�̌Ăяo�� -->

<form action = "<%=request.getContextPath() %>/top" method = "Post">
<!-- name��servlet�ƈ�v������K�v����B -->
<select name = "number">
 <%
				List<CustomerBean> customerList =
				(List<CustomerBean>)request.getAttribute("customerList");
			for(int i = 0; i < customerList.size(); i++){
				CustomerBean cbean = customerList.get(i);
%>
<!-- �I���������k�̖��O�ŁA���M�����f�[�^�͔ԍ��ɂȂ� -->
<option value ="<%=cbean.getStudent_no() %>"><%=cbean.getName() %></option>

<%
}
%>
</select>

<br><br>

<div class="area1">�e�X�g�͈͂�I�����Ă�������:</div>
<select name = "starttest">
<option value="0">1�N1�w�����ԃe�X�g
<option value="1">1�N1�w�������e�X�g
<option value="2">1�N2�w�����ԃe�X�g
<option value="3">1�N2�w�������e�X�g
<option value="4">2�N1�w�����ԃe�X�g
<option value="5">2�N1�w�������e�X�g
<option value="6">2�N2�w�����ԃe�X�g
<option value="7">2�N2�w�������e�X�g
<option value="8">3�N1�w�����ԃe�X�g
<option value="9">3�N1�w�������e�X�g
<option value="10">3�N2�w�����ԃe�X�g

</option>
</select>



<select name = "endtest">
<option value="1">1�N1�w�������e�X�g
<option value="2">1�N2�w�����ԃe�X�g
<option value="3">1�N2�w�������e�X�g
<option value="4">2�N1�w�����ԃe�X�g
<option value="5">2�N1�w�������e�X�g
<option value="6">2�N2�w�����ԃe�X�g
<option value="7">2�N2�w�������e�X�g
<option value="8">3�N1�w�����ԃe�X�g
<option value="9">3�N1�w�������e�X�g
<option value="10">3�N2�w�����ԃe�X�g
<option value="11">3�N2�w�������e�X�g
</option>
</select>
<br><br>

<a href="<%=request.getContextPath()%>/introduction/hello.html" class="button1">�V�K�ǉ���</a>
<%-- <form action="<%=request.getContextPath()%>/" method="Post">
    <button type="submit" class="button1">�V�K�ǉ�</button>
</form> --%>
<!-- <a></a>��<form></form>�̂ǂ��������g�� -->
<br>
<br>
<br>
<br>


<!-- <div class="form"> -->
<%-- <form action="<%=request.getContextPath()%>/select" method="Post"> --%>
    <button type="submit" class="button2">�O���t�\����</button>
</form>
<br>

<form action="<%=request.getContextPath() %>/input" method ="Post">
<button type = "submit" class="button3">�\�̕\����</button>
</form>
<!-- </div> -->

</body>
</html>