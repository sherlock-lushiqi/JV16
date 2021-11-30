package main.java.pkg1;

import main.java.bean.Product;
import main.java.tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/pkg1/beantest")
public class BeanTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        Product p = new Product();

        p.setId(1);
        p.setName("まぐろ");
        p.setPrice(100);

        out.println(p.getId());
        out.println(":");
        out.println(p.getName());
        out.println(":");
        out.println(p.getPrice());

        Page.footer(out);
    }
}
