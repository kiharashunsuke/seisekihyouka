<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>���q�l�������ʃy�[�W</title>
</head>
<body>

<h3>�������ʂł�</h3>
<%-- SelectServlet�̌Ăяo�� --%>
<form action = "<%=request.getContextPath() %>/select" method = "Post">
<%-- �e�X�g�̎�ޑI��<select> --%>
<select name = "test">
	<option value = "tyukan_1_1">1�N�P�w�����ԃe�X�g</option>
	<option value = "kimatu_1_1">1�N�P�w�������e�X�g</option>
	<option value = "tyukan_1_2">1�N�Q�w�����ԃe�X�g</option>
	<option value = "kimatu_1_2">1�N�Q�w�������e�X�g</option>
	<option value = "gakuryokutest_1">1�N�w�̓e�X�g</option>
	<option value = "tyukan_2_1">�Q�N�P�w�����ԃe�X�g</option>
	<option value = "kimatu_2_1">�Q�N�P�w�������e�X�g</option>
	<option value = "tyukan_2_2">�Q�N�Q�w�����ԃe�X�g</option>
	<option value = "kimatu_2_2">�Q�N�Q�w�������e�X�g</option>
	<option value = "gakuryokutest_2">�Q�N�w�̓e�X�g</option>
	<option value = "tyukan_3_1">�R�N�P�w�����ԃe�X�g</option>
	<option value = "kimatu_3_1">�R�N�P�w�������e�X�g</option>
	<option value = "tyukan_3_2">�R�N�Q�w�����ԃe�X�g</option>
	<option value = "kimatu_3_2">�R�N�Q�w�������e�X�g</option>
	<option value = "gakuryokutest_3">�R�N�w�̓e�X�g</option>
</select>
<br>
<%-- <table>�쐬 --%>
<table border = 3 width = 80% align = center>
<%-- 1�i�� --%>
	<tr>
		<th>����</th>
		<th>����</th>
		<th>���w</th>
		<th>����</th>
		<th>�Љ�</th>
		<th>�p��</th>
		<th>���v</th>
	</tr>



<%--
 �J��Ԃ��ɂ�鏈����p���āA�P��݂̂̋L�q�ōς�
 studentList�̌Ăяo���Afor���ŌJ��Ԃ��B����studentList.size()��
 DB�̃f�[�^���ύX����Ă����̕���������B
 for���́o�p�ň͂܂ꂽ�͈͂��J��Ԃ���邽�߁A�L�q�ꏊ�ɒ��ӁB
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


<%-- ���M�{�^���̍쐬 --%>
<br><br>
<input type = "submit" value = "��L�̓��e�œo�^">
</form>
<%-- �߂��ʂ̃����N --%>
<a href="<%=request.getContextPath()%>/database/selecttop.jsp">���q�l�����g�b�v��ʂɖ߂�
</a>
</body>
</html>