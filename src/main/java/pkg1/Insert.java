package main.java.pkg1;

import main.java.bean.Product;
import main.java.dao.ProductDAO;
import main.java.tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/pkg1/insert")
public class Insert extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        try {
            String name = request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));

            Product p = new Product();
            p.setName(name);
            p.setPrice(price);

            ProductDAO dao = new ProductDAO();
            int line = dao.Insert(p);
            if (line > 0){
                out.println("追加に成功しました");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Page.footer(out);
    }
}
