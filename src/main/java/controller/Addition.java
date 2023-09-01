package controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public class Addition extends  HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("number1"));
        int num2 = Integer.parseInt(req.getParameter("number2"));
        int sum = num1 + num2;
        req.setAttribute("sum", sum);
        req.getRequestDispatcher("Result.jsp").forward(req, resp);

    }
}
