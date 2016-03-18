package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;

public class GeneralpublicsignupC extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/Generalpublicsignup/index.jsp");
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
      int x=0;
     try
    {
          User u=new User();
        u.setEmailId(request.getParameter("EmailId"));
        u.setUserId(request.getParameter("UserId"));
        u.setPassword(request.getParameter("Password"));
        u.setName(request.getParameter("Name"));
        u.setAddress(request.getParameter("Address"));
        u.setState(request.getParameter("State"));
        u.setMobileNumber(request.getParameter("MobileNumber"));
        x=User.InsertUser(u);

        if(x>0){
              response.sendRedirect("views/Organisationsignup/index.jsp");
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
