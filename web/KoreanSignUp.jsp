<% request.setCharacterEncoding("UTF-8"); %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    String mName;
    String mNickName;
%>

<%
    mName = request.getParameter("m_name");
    mNickName = request.getParameter("m_nickname");
%>

이름 : <%=mName%>
<br>
별명 : <%=mNickName%>
</body>
</html>
