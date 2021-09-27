package servlet;

import javax.servlet.*;
import java.io.IOException;

public class TempFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("-- filter doFilter() --");

        // request filter
        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response);

        // response filter
    }
}
