package jettytest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;


public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = -83928342348232082L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/plain");

        PrintWriter writer = response.getWriter();

        writer.print("Hello!");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();
        writer.print("Hello from vanilla Jetty");
        writer.flush();
    }

}
