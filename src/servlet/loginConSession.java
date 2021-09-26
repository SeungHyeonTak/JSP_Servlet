package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginConSession")
public class loginConSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String mID = request.getParameter("mID");
        String mPW = request.getParameter("mPW");

        out.print("mID :" + mID);
        out.print("mPW :" + mPW);

        HttpSession session = request.getSession();
        session.setAttribute("JSESSIONID", mID);


        response.sendRedirect("loginSessionOk.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
