package main.java.pkg1;

import main.java.bean.Product;
import main.java.dao.ProductDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/pkg1/kadai03search")
public class Kadai03Search extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try{
            String keyword = request.getParameter("keyword");
            ProductDAO dao = new ProductDAO();
            List<Product> list = dao.search(keyword);
            request.setAttribute("list",list);
            request.getRequestDispatcher("../kadai03result.jsp").forward(request,response);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
