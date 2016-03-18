package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;

public class UpdateOrgProfileC extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
 HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/UpdateOrgProfile/index.jsp");
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
        User u=new User();
        u.setEmailId(request.getParameter("EmailId"));
        u.setUserId(request.getParameter("UserId"));
        u.setPassword(request.getParameter("password"));
        u.setName(request.getParameter("Name"));
        u.setAddress(request.getParameter("Address"));
        u.setState(request.getParameter("State"));
        u.setMobileNumber(request.getParameter("MobileNumber"));
        int x=User.UpdateUser(u);
         if(x>0)
        {
        response.sendRedirect("views/Orgprofile/index.jsp");
        }
        else
        {
              response.sendRedirect("fail");

        }


    }
    catch(Exception ex)
    {

    }
    }


}
