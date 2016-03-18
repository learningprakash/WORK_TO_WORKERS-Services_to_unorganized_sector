
package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Worker;

public class UpdateWorkerProfileC extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
 {
    HttpSession session=request.getSession(true);
    try
    {
    response.sendRedirect("views/UpdateWorkerProfile/index.jsp");
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
        w.setEmail_id(request.getParameter("email_id"));
        w.setPassword(request.getParameter("password"));
        w.setRating_id(request.getParameter("rating_id"));
        w.setName(request.getParameter("name"));
        w.setAge(request.getParameter("age"));
        w.setGender(request.getParameter("gender"));
        w.setJob(request.getParameter("job"));
        w.setWorking_area(request.getParameter("Working_area"));
        w.setCity(request.getParameter("city"));
        w.setPayment_mode(request.getParameter("payment_mode"));
        w.setDaily_charges(request.getParameter("Daily_charges"));
        w.setSpecialization(request.getParameter("Specialization"));
        w.setAddress(request.getParameter("address"));
        w.setMobile_no(request.getParameter("Mobile_no"));
        int x=Worker.UpdateWorker(w);
    }
    catch(Exception ex)
    {

    }
    }

}
