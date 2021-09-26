<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    System.out.println("cookies : " + cookies);

    if (cookies != null) {
        for (Cookie c : cookies) {
            if (c.getName().equals("JSESSIONID")) {
                response.sendRedirect("loginOk.jsp");
            }
        }
    }
%>
<form action="loginCon" method="post">
    ID : <input type="text" name="mID"> <br>
    PW : <input type="password" name="mPW"> <br>
    <input type="submit" value="login">
</form>
</body>
</html>
