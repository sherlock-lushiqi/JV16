package main.java.pkg1;

import main.java.tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/pkg1/keisan")
public class Keisan extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            request.setCharacterEncoding("UTF-8");
            int price = Integer.parseInt(request.getParameter("price"));
            int count = Integer.parseInt(request.getParameter("count"));
            String product = request.getParameter("product");
            Page.header(out);
            out.println("品名："+product+"<br>");
            out.println(price+"円×");
            out.println(count+"個＝");
            out.println(price*count+"円");
            Page.footer(out);
        }catch (NumberFormatException e){
            out.println("数値を入力ください！");
        }
    }
}
