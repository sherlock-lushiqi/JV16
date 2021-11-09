package main.java.pkg1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/pkg1/omikuji")
public class Omikuji extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        String[] omikuji_results = {"大吉", "吉", "中吉", "小吉", "末吉", "凶"};
        String omikuji_result = omikuji_results[(int) (Math.random() * omikuji_results.length)];

        //Check input
        List<String> errors = new ArrayList<String>();

        if (username == null || username.equals("")) {
            errors.add("名前を入力してください。");
        }

        if (errors.size() > 0) {
            request.setAttribute("errors", errors);
        } else {
            request.setAttribute("username", username);
            request.setAttribute("omikuji_result", omikuji_result);
        }

        //Specify and display JSP as the view
        RequestDispatcher rd = request.getRequestDispatcher("/omikuji_result.jsp");
        rd.forward(request, response);
    }
}
