
package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;
import models.Worker;

public class WorkersigninC extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
{
      HttpSession session=request.getSession(true);
    try
    {
         session.setAttribute("worker_id","enter id here");
        response.sendRedirect("views/Workersignin/index.jsp");
    }
    catch(Exception ex)
    {

    }
}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
     HttpSession session = request.getSession(true);
     try
     {
        Worker w = new Worker();
        w.setWorker_id(request.getParameter("worker_id"));
        w.setPassword(request.getParameter("password"));
        w.setRating_id(request.getParameter("rating_id"));
        boolean c = Worker.signin(w);
        if (c)
        response.sendRedirect("views/Workerprofile/index.jsp");
        else
        {
        session.setAttribute("error","wrong username or password");
        response.sendRedirect("views/Workersignin/index.jsp");
        }
     }
     catch(Exception ex)
     {

     }
    }

}
