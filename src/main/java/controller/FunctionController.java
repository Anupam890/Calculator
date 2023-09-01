package controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import controller.*;

@WebServlet("/calculate")
public class FunctionController extends HttpServlet{

    protected  void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {

        String operation = req.getParameter("operation");
        if(operation.equals("add")) {
            req.getRequestDispatcher("Addition").include(req, res);
        } else if (operation.equals("sub")) {
            req.getRequestDispatcher("subtraction").include(req, res);
        }
        else if (operation.equals("mul")) {
            req.getRequestDispatcher("multiplication").include(req, res);
        }
        else if (operation.equals("div")) {
            req.getRequestDispatcher("division").include(req, res);
        }
        else {
            res.getWriter().println("Invalid operation");
        }
    }
}
