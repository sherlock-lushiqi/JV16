package main.java.sample1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/sample1/hello1")
public class Hello3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Servlet/JSP Sample Programs</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Hello1!</p>");
        out.println("<p>こんにちは！</p>");
        out.println("<p>"+new java.util.Date()+"</p>");
        out.println("</body>");
        out.println("</html>");

    }
}
