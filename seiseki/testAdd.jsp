<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>�e�X�g�̌��ʓ��̓y�[�W</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/dataInput" method="Post">
<h1 align = center>�e�X�g���ʓ���</h1>

<table border = 3 width = 80% align = center>
<tr>
		<%-- <th>���O</th>
		<td><input type="text" class="form-control" id="name" name="name"></td> --%>
		<th>���k�ԍ�</th>
		<td><input type="text" class="forn-control" pattern="^[a-zA-Z0-9]+$" id="no" name="stu_no"></td>
		<th>����</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="japanese"></td>
		<th>���w</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="math"></td>
		<th>����</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="science"></td>
		<th>�Љ�</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="social"></td>
		<th>�p��</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="english"></td>
		<th>���v</th>
		<td><input type="text" class="form-control" pattern="^[a-zA-Z0-9]+$" id="ID" name="goukei"></td>
		<td>
            <input type="submit" value="�ǉ�" required>
        </td>
	</tr>
	</table>
	</form>
    <button onclick="location.href='/seiseki/Main/Main.jsp'">�g�b�v�y�[�W��</button>
</body>
</html>