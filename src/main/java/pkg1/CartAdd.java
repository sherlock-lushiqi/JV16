package main.java.pkg1;

import main.java.bean.Product;
import main.java.tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/pkg1/cart-add")
public class CartAdd extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));

        HttpSession session = request.getSession();
        List<Product> cart = (List<Product>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<Product>();
        }

        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        cart.add(p);

        session.setAttribute("cart",cart);

        out.println("商品が追加しました。");
        Page.footer(out);
    }
}
