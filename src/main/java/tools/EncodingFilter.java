package main.java.tools;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/*"})
public class EncodingFilter implements Filter {

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html; charset=UTF-8");

        System.out.println("フィルタの前処理");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("フィルタの後処理");
    }

    public void init(FilterConfig filterConfig) {}
    @Override
    public void destroy() {

    }
}
