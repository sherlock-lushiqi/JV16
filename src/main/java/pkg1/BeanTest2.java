package main.java.pkg1;

import main.java.bean.Customer;
import main.java.tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/pkg1/beantest2")
public class BeanTest2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        Customer c = new Customer();

        c.setId(1);
        c.setLogin("ayukawa");
        c.setPassword("SweetfishRiver1");

        out.println(c.getId());
        out.println(":");
        out.println(c.getLogin());
        out.println(":");
        out.println(c.getPassword());

        Page.footer(out);
    }
}
