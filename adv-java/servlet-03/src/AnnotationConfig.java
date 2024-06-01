import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class AnnotationConfig extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int firstNumber = Integer.parseInt(req.getParameter("n1"));
        int secondNumber = Integer.parseInt(req.getParameter("n2"));

        int result = firstNumber + secondNumber;

        PrintWriter writer = resp.getWriter();
        writer.println("<h1> is " + result + "</h1>");

    }
}
