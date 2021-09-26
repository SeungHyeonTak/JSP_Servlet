<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (session.getAttribute("JSESSIONID") != null) {
        response.sendRedirect("loginSessionOk.jsp");
    }
%>
<form action="loginConSession" method="post">
    ID : <input type="text" name="mID"> <br>
    PW : <input type="password" name="mPW"> <br>
    <input type="submit" value="login">
</form>
</body>
</html>
