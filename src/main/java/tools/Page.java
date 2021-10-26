package main.java.tools;

import java.io.PrintWriter;

public class Page {

    //header
    public static void header(PrintWriter out) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Servlet/JSP Sample Programs</title>");
        out.println("</head>");
        out.println("<body>");
    }

    //footer
    public static void footer(PrintWriter out) {
        out.println("</body>");
        out.println("</html>");
    }
}
