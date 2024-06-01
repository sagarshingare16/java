import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      /*  PrintWriter writer = resp.getWriter();
        writer.println("<h1>Response from second servlet</h1>");*/

        HttpSession session = req.getSession(false);
        String name = (String) session.getAttribute("name");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Response from second servlet</h1>" + "<h1>" + name + "</h1>"); 
    }

}
