import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Life_Cycle extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Init Called - servlet init......");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        System.out.println("service() Method call - Handling Request");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Hello From Life Cycle </h2>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy() called -- Destroy Method called inside servlet......");
    }
}
