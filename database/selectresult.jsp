<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>���k�̐��ѓo�^�y�[�W</title>
</head>
<body>

<h1 align = center>���ѕ\�����</h1>

<br>

<table border = 3 width = 80% align = center>
<%-- 1�i�� --%>
	<tr>
		<th>�e�X�g��</th>
		<th>����</th>
		<th>���w</th>
		<th>����</th>
		<th>�Љ�</th>
		<th>�p��</th>
		<th>���v</th>
	</tr>


<%
List<StudentBean> studentList =
(List<StudentBean>)request.getAttribute("studentList");

%>

<%--int�^�Ńf�[�^���Ƃ邽�߂ɕϊ� --%>
<% int studentNumber = ((Integer)(request.getAttribute("studentNumber"))); %>
	<% StudentBean sbean = studentList.get(studentNumber); %>
<%--���k�̖��O���擾���ĕ�����₷���悤�ɕ\������ --%>
	<h2><%=sbean.getName() %>�̐���</h2>


	<tr><td>�w�̓e�X�g1�N��</td>
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
	<tr><td>�w�̓e�X�g�Q�N��</td>
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