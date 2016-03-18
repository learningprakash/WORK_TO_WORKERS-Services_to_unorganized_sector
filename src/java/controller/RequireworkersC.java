
package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.Requirement;

public class RequireworkersC extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     HttpSession session=request.getSession(true);
    try
    {
        response.sendRedirect("views/Requireworkers/index.jsp");
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
        Requirement r = new Requirement();
        int a=r.getNumberOfWorkers();
        int b=r.getWageRange();
        r.setRequestNumber(request.getParameter("RequestNumber"));
        r.setNumberOfWorkers(a);
        r.setGender(request.getParameter("Gender"));
        r.setWorkName(request.getParameter("WorkName"));
        r.setWages_Mode(request.getParameter("Wages_Mode"));
        r.setStatDate(request.getParameter("StatDate"));
        r.setEndDate(request.getParameter("EndDate"));
        r.setReqAddress(request.getParameter("ReqAddress"));
        r.setCity(request.getParameter("City"));
        r.setWageRange(b);
        int x=Requirement.InsertRequirement(r);
        response.sendRedirect("views/Requireworkers/index.jsp");
    }
    catch(Exception ex)
    {

    }
    } 
}
