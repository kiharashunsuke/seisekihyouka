<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<link href="<%=request.getContextPath() %>/seisekikanri/passReset.css" rel="stylesheet" type="text/css">
<title>�p�X���[�h�Đݒ�y�[�W</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/passReset" method="Post">
<div class="login">
  <form class="login-container">
            <%-- <p><input type="text" placeholder="id" pattern="^[a-zA-Z0-9]+$" class="form-control" id="ID" name="id"  required></p>--%>
            <%-- <p><input type="password" placeholder="password" pattern="^[a-zA-Z0-9]+$" class="form-control" id="password" name="password" minlength="6"  required></p>--%>
            <p><input type="text" placeholder="email"  class="form-control" id="ID" name="email"  required></p>
            <p><input type="submit" value="�p�X���[�h�ύX" required></p>
            </form>
            </div>
            </form>
            </form>
</body>
</html>