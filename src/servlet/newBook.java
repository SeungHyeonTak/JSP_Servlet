package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet("/newBook")
public class newBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String bookName = request.getParameter("book_name");
        String bookLoc = request.getParameter("book_loc");

        // DB 사용하기 위한 코드
        String driver = "oracle.jdbc.driver.OracleDriver";  // 드라이버 이름
        String url = "jdbc:oracle:thin:@localhost:1521:XE";  // url 경로 (JDBC의 위치)
        String id = "tsh_test";
        String pw = "1234qwer";

        Connection con = null;
        Statement stmt = null;

//        try {
//            Class.forName(driver);
//
//            con = DriverManager.getConnection(url, id, pw);
//            stmt = con.createStatement();
//            String sql = "INSERT INTO book(book_id, book_name, book_loc)";
//            sql += "VALUES (BOOK_SEQ.NEXTVAL, '" + bookName + "', '" + bookLoc + "')";
//            int result = stmt.executeUpdate(sql);
//
//            if (result == 1) {
//                out.print("INSERT success!!");
//            } else {
//                out.print("INSERT faill!!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // finally에서 자원을 close() 해줘야한다.
//            try {
//                if (stmt != null) stmt.close();
//                if (con != null) con.close();
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
