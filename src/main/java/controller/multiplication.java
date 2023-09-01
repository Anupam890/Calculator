package controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/multiplication")
public class multiplication extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("number1"));
        int num2 = Integer.parseInt(req.getParameter("number2"));
        int product = num1 * num2;
        req.setAttribute("product", product);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}
