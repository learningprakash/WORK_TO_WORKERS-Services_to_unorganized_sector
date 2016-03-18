/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomeC extends HttpServlet {
   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session=request.getSession(true);
        try
        {
            response.sendRedirect("views/home/index.jsp");
        }
        catch(Exception ex)
        {

        }
    } 

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        try
        {
            
            
            

        }
        catch(Exception ex)
        {

        }
    }
}
