package controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/division")
public class division extends  HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("number1"));
        int num2 = Integer.parseInt(req.getParameter("number2"));
        int divide = num1 / num2;
        req.setAttribute("div", divide);
        req.getRequestDispatcher("FunctionController").include(req, resp);

    }

}
