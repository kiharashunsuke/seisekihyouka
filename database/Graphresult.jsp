<%@ page language="java" contentType="text/html; charset=Windows-31J"
	pageEncoding="Windows-31J"%>
<%@ page import="java.util.*"%>
<%@ page import="database.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Tranitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
 <link href="<%=request.getContextPath() %>/database/resultstyle.css" rel="stylesheet" type="text/css">
<title>���k�̐��ѓo�^�y�[�W</title>
</head>
<body>

	<h1 align=center>���ѕ\�����</h1>
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

		int�^�Ńf�[�^���Ƃ邽�߂ɕϊ�
		<%
			int studentNumber = ((Integer) (request.getAttribute("studentNumber")));
		%>
		<%
			CustomerBean cbean = CustomerList.get(studentNumber);
		/* StudentBean sbean = studentList.get(studentNumber); */

		%>

 <%
    // out.print���g�p���ăN���C�A���g�Ƀ��b�Z�[�W���o��
    out.print(studentNumber);
%>
<%
    // out.print���g�p���ăN���C�A���g�Ƀ��b�Z�[�W���o��
    out.print(cbean.getName());
%>

<%-- �߂��ʂ̃����N --%>
<%--���k�I����ʂ�SelectServlet����f�[�^���󂯎���Ă���̂Ń����N�𒣂�̂ł͂Ȃ�
servlet���Ăяo���K�v������B --%>

    <form action="<%=request.getContextPath()%>/database/main.jsp" method="Post">
        <button type="submit" class="button">�g�b�v�y�[�W��</button>
    </form>


</body>
</html>