package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Worker;

public class WorkerprofileC extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/Workerprofile/index.jsp");
    }
    catch(Exception ex)
    {

    }
    
    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
    
    }

}
