package servlet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet("/mSignUp")
public class MemSignUp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(" -- doGet() --");

        // request 객체에서 값 하나만 뽑아낼때 getParameter를 쓴다.
        // form 태그에서 name부분에 알맞는 값(속성 값)을 통해 데이터를 뽑아 낼 수 있다.
        String m_name = request.getParameter("m_name");
        String m_pass = request.getParameter("m_pass");
        String m_gender = request.getParameter("m_gender");
        // checkbox는 다중 선택이 가능하기에 배열로 선언 해준다.
        // 이럴땐 getParameterValues를 사용해야한다.
        String[] m_hobby = request.getParameterValues("m_hobby");
        String m_residence = request.getParameter("m_residence");

        System.out.println("m_name : " + m_name);
        System.out.println("m_pass : " + m_pass);
        System.out.println("m_gender : " + m_gender);
        System.out.println("m_hobby : " + Arrays.toString(m_hobby));
        System.out.println("m_residence : " + m_residence);

        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            System.out.println("name : " + name);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(" -- doPost() -- ");

        doGet(request, response);
    }
}
