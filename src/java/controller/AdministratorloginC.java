package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Admin;

public class AdministratorloginC extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/Administratorlogin/index.jsp");
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
        Admin a =new Admin();
        a.setAdmin_id(request.getParameter("Admin_id"));
        a.setPassword(request.getParameter("Password"));
        //if record found send it to profile
        response.sendRedirect("views/Administrator/index.jsp");
     }
     catch(Exception ex)
     {

     }
    }

}
