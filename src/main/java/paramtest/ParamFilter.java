package main.java.paramtest;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ParamFilter implements Filter {

    private String message;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        message = filterConfig.getInitParameter("message");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        System.out.println("****");
        out.println("Filter-->");
        out.println(message);
        out.println("<br>");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
