package servlet;

import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.annotation.PostConstruct;
import java.io.IOException;

@WebServlet("/sh")
public class MainServletClass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(" -- doGet() --");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @PostConstruct
    public void funPc() {
        System.out.println(" -- @PostConstruct() --");
    }

    @Override
    public void init() throws ServletException {
        System.out.println(" -- init() --");
    }

    @Override
    public void destroy() {
        System.out.println(" -- destroy() --");
    }

    @PreDestroy
    public void funPd() {
        System.out.println(" -- @PreDestroy() --");
    }
}
