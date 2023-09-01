package controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public class subtraction extends HttpServlet{

        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
            int num1 = Integer.parseInt(req.getParameter("number1"));
            int num2 = Integer.parseInt(req.getParameter("number2"));

            int sub = num1 - num2;
            req.setAttribute("sub", sub);
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        }

}
