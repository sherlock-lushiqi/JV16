package main.java.pkg1;

import main.java.tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/pkg1/greeting")
public class Greeting extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");
        String user = request.getParameter("user");

        Page.header(out);
        out.println("<p>こんにちは、"+user+"さん！</p>");
        Page.footer(out);
    }
}
