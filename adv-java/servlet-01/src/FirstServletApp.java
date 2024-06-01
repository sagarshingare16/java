import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*String name = req.getParameter("uname");
        String city = req.getParameter("ucity");

        PrintWriter writer= resp.getWriter();

        *//*if(name.equals("Rohan") && city.equals("Pune")){
            writer.println("<h1>Success</h1>");
        }
        else {
            writer.println("<h1>Failure</h1>");
        }*//*

        resp.sendRedirect("/servlet-01/success.jsp");*/


    /*@Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        RequestDispatcher requestDispatcher  = req.getRequestDispatcher("/SecondServlet");
//        requestDispatcher.forward(req,resp);

        requestDispatcher.include(req,resp);

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Response from first servlet</h1>");
    }*/

        String name = req.getParameter("uname");
        String ucity = req.getParameter("ucity");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/SecondServlet");

        HttpSession session = req.getSession();
        session.setAttribute("name",name);
        session.setAttribute("ucity",ucity);


        requestDispatcher.forward(req,resp);
    }
}
