<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
    <%@ page import = "java.util.*" %>
<%@ page import = "database.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>���k�I�����</title>
</head>
<body>
<%--servlet�̌Ăяo�� --%>
<form action = "<%=request.getContextPath() %>/top" method = "Post">
<%-- name��servlet�ƈ�v������K�v����B --%>
<select name = "number">
<%--���X�g���擾�B�J��Ԃ����Ől�����\�� --%>
<%
		List<StudentBean> studentList =
		(List<StudentBean>)request.getAttribute("studentList");
	for(int i = 0; i < studentList.size(); i++){
		StudentBean sbean = studentList.get(i);

%>
<%--�I���������k�̖��O�ŁA���M�����f�[�^�͔ԍ��ɂȂ� --%>
	 <option value ="<%=sbean.getStudent_no() %>"><%=sbean.getName() %></option>
<%
}
%>
</select>
<%--form�ɂ��A�f�[�^�̑��M�Ɖ�ʑJ�ڂ��s����B --%>
<input type="submit" value="���ѕ\��">
</form>
</body>
</html>