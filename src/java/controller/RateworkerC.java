package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Worker;

public class RateworkerC extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/Rateworker/index.jsp");
    }
    catch(Exception ex)
    {

    }
    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
     HttpSession session=request.getSession(true);
    try
    {
        Worker w=new Worker();
        w.setWorker_id(request.getParameter("worker_id"));
        w.setRating_id(request.getParameter("rating_id"));
        w.setRating(request.getParameter("Rating"));
        int x=Worker.InsertRating(w);
         response.sendRedirect("views/Rateworker/index.jsp");
    }
    catch(Exception ex)
    {

    }
    }

}
