<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
<%
    response.setStatus(200);
    String msg = exception.getMessage();
%>
<h1>error message : <%= msg %></h1>
</body>
</html>