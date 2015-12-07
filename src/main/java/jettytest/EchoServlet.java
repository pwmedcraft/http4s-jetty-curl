package jettytest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EchoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/plain");

        PrintWriter writer = response.getWriter();

        writer.print(request.getQueryString());
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/plain");

        StringBuilder sb = new StringBuilder();
        String line = null;
        try (BufferedReader reader = request.getReader()) {
            while ((line = reader.readLine()) != null)
                sb.append(line);
        } catch (Exception e) { e.printStackTrace();}

        PrintWriter writer = response.getWriter();
        writer.print(sb);
        writer.print("\n\nPlain Jetty");
        writer.flush();
    }
}
