package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;



public class OrganisationsigninC extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/Organisationsignin/index.jsp");
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
        User u =new User();
        u.setUserId(request.getParameter("UserId"));
        u.setPassword(request.getParameter("Password"));
        u.setEmployeeName(request.getParameter("EmployeeName"));
        u.setEmployeeId(request.getParameter("EmployeeId"));
        boolean check=User.signin(u);
        if (check)
        response.sendRedirect("views/Orgprofile/index.jsp");
        else
        {
        session.setAttribute("error","Wrong username or password");
        response.sendRedirect("views/Organisationsignin/index.jsp");
        }
      
     }
   catch(Exception ex)
     {

     }
    }

}

    


