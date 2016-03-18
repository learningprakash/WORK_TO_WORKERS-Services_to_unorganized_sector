package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;

public class GPprofileC extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/GPprofile/index.jsp");
    }
    catch(Exception ex)
    {

    }
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
    }

}
