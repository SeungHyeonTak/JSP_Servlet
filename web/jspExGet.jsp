<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    String connectedIP;
    String connectedUser;
%>

<!-- application 객체 -->
<%
    connectedIP = (String) application.getAttribute("connectedIP");
    connectedUser = (String) application.getAttribute("connectedUser");
%>

<p>connectedIP : <%= connectedIP %></p>
<p>connectedUser : <%= connectedUser %></p>
</body>
</html>
