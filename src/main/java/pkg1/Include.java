package main.java.pkg1;

import main.java.tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/pkg1/include")
public class Include extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Page.header(out);
        request.getRequestDispatcher("/include1.jsp").include(request,response);
        request.getRequestDispatcher("/include2.jsp").include(request,response);
        Page.footer(out);
    }
}
