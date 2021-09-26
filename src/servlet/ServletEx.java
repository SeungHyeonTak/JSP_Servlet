package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletEx extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminId = getServletConfig().getInitParameter("adminId");
        String adminPw = getServletConfig().getInitParameter("adminPw");

        PrintWriter out = response.getWriter();
        out.print("<p>adminId : " + adminId + "</p>");
        out.print("<p>adminPw : " + adminPw + "</p>");

        String imgDir = getServletContext().getInitParameter("imgDir2");
        String testServerIP = getServletContext().getInitParameter("testServerIP2");

        out.print("<p>imgDir2 : " + imgDir + "</p>");
        out.print("<p>testServerIP2 : " + testServerIP + "</p>");

        getServletContext().setAttribute("connectedIP2", "192.168.0.1");
        getServletContext().setAttribute("connectedUser2", "SeungHyeon");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
