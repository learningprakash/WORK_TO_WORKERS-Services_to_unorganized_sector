package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class HelpC extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
 HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/Help/index.jsp");
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
