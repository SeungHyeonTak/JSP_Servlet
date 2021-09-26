<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="errorPage.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    String adminId;
    String adminPw;

    String imgDir;
    String testServerIP;
    String realServerIP;

    String str;
%>

<%
    adminId = config.getInitParameter("adminId");
    adminPw = config.getInitParameter("adminPw");
%>

<p>adminId : <%= adminId %></p>
<p>adminPw : <%= adminPw %></p>

<%
    imgDir = application.getInitParameter("imgDir");
    testServerIP = application.getInitParameter("testServerIP");
    realServerIP = application.getInitParameter("realServerIP");
%>

<p>imgDir : <%=imgDir%></p>
<p>testServerIP : <%=testServerIP%></p>
<p>realServerIP : <%=realServerIP%></p>

<%
    application.setAttribute("connectedIP", "165.62.58.23");
    application.setAttribute("connectedUser", "hong");
%>

<!-- out 객체 -->
<%
    out.print("<h1>Hello Java World!!</h1>");
    out.print("<h2>Hello JSP World!!</h2>");
    out.print("<h3>Hello Servlet World!!</h3>");
%>

<!-- exception 객체 -->
<%
    // 선언만 하고 초기화 하지 않았음
    out.print(str.toString());
%>
</body>
</html>
