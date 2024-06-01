import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int firstNumber = Integer.parseInt(req.getParameter("n1"));
        int secondNumber = Integer.parseInt(req.getParameter("n2"));

        int result = firstNumber + secondNumber;

        /*PrintWriter writer = resp.getWriter();
        writer.println("<h1>Result is :</h1>" + "<h1>" + result+ "</h1>");*/

        /*req.setAttribute("result",resp);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("sq");
        requestDispatcher.forward(req,resp);*/

//        resp.sendRedirect("sq?result="+result); //url rewriting

       /* HttpSession session = req.getSession();
        session.setAttribute("result",result);*/

        Cookie cookie = new Cookie("result",result + "");
        resp.addCookie(cookie);

        resp.sendRedirect("sq");

    }
}
