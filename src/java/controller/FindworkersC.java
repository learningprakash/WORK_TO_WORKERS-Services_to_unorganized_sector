package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Requirement;


public class FindworkersC extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/Findworkers/index.jsp");
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
        Requirement r = new Requirement();
        r.setWorkName(request.getParameter("WorkName"));
        r.setStatDate(request.getParameter("StatDate"));


        //if record found send it to list
        response.sendRedirect("views/Workerlist/index.jsp");
     }
     catch(Exception ex)
     {

     }

    }

}
