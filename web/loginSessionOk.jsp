<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session = request.getSession();
    out.print("memberID : " + session.getAttribute("JSESSIONID") + "<br>");
%>

<form action="logoutConSession" method="post">
    <input type="submit" value="logout">
</form>
</body>
</html>
