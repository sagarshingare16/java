import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        int result = (int) req.getAttribute("result");

        /*HttpSession session = req.getSession();
        int result = (int) session.getAttribute("result");*/

        int result = 0;
        Cookie[] cookies = req.getCookies();
        for(Cookie c : cookies){
            if(c.getName().equals("result")){
                result = Integer.parseInt(c.getValue());
            }
        }

        result = result * result;

        PrintWriter writer = resp.getWriter();
        writer.println("Result is: " +result);

//        System.out.println("Sq called..");
    }
}
