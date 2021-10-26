package main.java.pkg1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/pkg1/hello"})
public class Hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hello!");
        out.println("");
        out.println(new java.util.Date());
    }
}
