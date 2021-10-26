package main.java.sample1;

import main.java.tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/sample1/hello2")
public class Hello4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        Page.header(out);

        out.println("<p>Hello2!</p>");
        out.println("<p>こんにちは！</p>");
        out.println("<p>"+new java.util.Date()+"</p>");

        Page.footer(out);
    }
}
