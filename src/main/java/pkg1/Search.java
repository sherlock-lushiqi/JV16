package main.java.pkg1;

import main.java.bean.Product;
import main.java.dao.ProductDAO;
import main.java.tools.Page;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/pkg1/search")
public class Search extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        try {
            String keyword = request.getParameter("keyword");
            ProductDAO dao = new ProductDAO();
            List<Product> list = dao.search(keyword);
            for (Product p:list){
                out.println(p.getId());
                out.println(":");
                out.println(p.getName());
                out.println(":");
                out.println(p.getPrice());
                out.println("<br>");
            }
        } catch (NamingException | SQLException e) {
            e.printStackTrace(out);
        }
        Page.footer(out);
    }
}
