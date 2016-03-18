
package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Worker;

public class WorkersignupC extends HttpServlet
{
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
    HttpSession session=request.getSession(true);
    try
    {
        session.setAttribute("worker_id","enter id here");
        response.sendRedirect("views/Workersignup/index.jsp");
        
    }
    catch(Exception ex)
    {
response.getWriter().write(ex.toString());
    }
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
    HttpSession session=request.getSession(true);
    int y=0;
    try
    {
        Worker w=new Worker();
        w.setWorker_id(request.getParameter("Worker_id"));
        w.setEmail_id(request.getParameter("email_id"));
        w.setPassword(request.getParameter("password"));
        w.setRating_id(request.getParameter("rating_id"));
        w.setName(request.getParameter("name"));
        w.setAge(request.getParameter("age"));
        w.setGender(request.getParameter("gender"));
        w.setJob(request.getParameter("Job"));
        w.setWorking_area(request.getParameter("Working_area"));
        w.setCity(request.getParameter("City"));
        w.setPayment_mode(request.getParameter("payment_mode"));
        w.setDaily_charges(request.getParameter("Daily_charges"));
        w.setSpecialization(request.getParameter("Specialization"));
        w.setAddress(request.getParameter("address"));
        w.setMobile_no(request.getParameter("Mobile_no"));
        y=Worker.InsertWorker(w);
        if(y>0){
              response.sendRedirect("views/Workersignup/index.jsp");
        }
        else
        {
              response.sendRedirect("fail");

        }
    }
    catch(Exception ex)
    {
response.getWriter().write(ex.toString());

    }
    }
}
