<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>���k�̐��ѓo�^�y�[�W</title>
<link href="css/common.css" rel="stylesheet" type="text/css"
media="all">
</head>
<body>
<%--�I���������k�ƃe�X�g������f�[�^���Q�Ƃ��\������y�[�W --%>
<h1 align = center>���ѕ\�����</h1>

<br>

<table border = 3 width = 80% align = center>

	<tr>
		<th></th>
		<th>����</th>
		<th>���w</th>
		<th>����</th>
		<th>�Љ�</th>
		<th>�p��</th>
		<th>���v</th>
	</tr>


<%
List<StudentBean> scoreList =
(List<StudentBean>)request.getAttribute("scoreList");

%>

<%--int�^�Ńf�[�^���Ƃ邽�߂ɕϊ� --%>
<% int studentNumber = ((Integer)(request.getAttribute("studentNumber"))); %>
	<% StudentBean sbean = scoreList.get(studentNumber); %>
<%--���k�̖��O���擾���ĕ�����₷���悤�ɕ\������ --%>
	<h2><%=sbean.getName() %>�̐���</h2>
<%--�e�X�g�̎�ނ��\������ --%>
<h3 align = center><%=request.getAttribute("tableName") %></h3>
	<tr><td>�_��</td>
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
	<tr><td>���ϓ_</td>
		<td><%=request.getAttribute("avgJ") %></td>
		<td><%=request.getAttribute("avgM") %></td>
		<td><%=request.getAttribute("avgSC") %></td>
		<td><%=request.getAttribute("avgSo") %></td>
		<td><%=request.getAttribute("avgE") %></td>
		<td><%=request.getAttribute("avgG") %></td>
	</tr>

</table>


<br><br>

<%-- �߂��ʂ̃����N --%>
<br><br>
<%--���k�I����ʂ�SelectServlet����f�[�^���󂯎���Ă���̂Ń����N�𒣂�̂ł͂Ȃ�
servlet���Ăяo���K�v������B --%>
<form action = "<%=request.getContextPath() %>/select" method = "Post">
<input type = "submit" value = "���k�I����">
</form><br>
<%--���C����ʂ̓����N�ł悢���A�f�[�^�������Ă���ꍇ��Ɠ��l --%>
<a href="<%=request.getContextPath()%>/database/main.jsp">���C����ʂɖ߂�</a>
</body>
</html>