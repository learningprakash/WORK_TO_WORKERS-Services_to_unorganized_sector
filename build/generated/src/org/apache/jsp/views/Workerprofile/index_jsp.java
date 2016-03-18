package org.apache.jsp.views.Workerprofile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../includes/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <th colspan=\"4\">Workers Profile</th>\n");
      out.write("                  <tr>\n");
      out.write("                    <td id=\"LabelWorker_Id\">Worker_Id</td>\n");
      out.write("                    <td><input type=\"text\" disabled=\"disabled\"  name=\"Worker_id\" value=\"\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                    <td id=\"LabelEmail_Id\">Email_Id</td>\n");
      out.write("                    <td><input type=\"text\" disabled=\"disabled\" name=\"Email_id\" value=\"\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelRating\">Rating</td>\n");
      out.write("                    <td><input type=\"text\" disabled=\"disabled\" name=\"Rating\" value=\"\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                        <td id=\"LabelName\">Name:</td>\n");
      out.write("                        <td><input type=\"text\" disabled=\"disabled\" name=\"name\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"LabelAge\">Age:</td>\n");
      out.write("                        <td><input type=\"text\" disabled=\"disabled\" name=\"age\" value=\"\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                    <td  id=\"LabelGender\">Gender:</td>\n");
      out.write("                    <td><input disabled=\"disabled\" type=\"radio\" name=\"gender\" value=\"male\" checked=\"checked\" />Male;\n");
      out.write("                        <input disabled=\"disabled\" type=\"radio\" name=\"gender\" value=\"female\" />Female</td>\n");
      out.write("                    </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td id=\"LabelJob\">Job:</td>\n");
      out.write("                        <td><input disabled=\"disabled\" type=\"text\" name=\"Job\" value=\"\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                        <td id=\"LabelAddress\">Working Area:</td>\n");
      out.write("                        <td><textarea disabled=\"disabled\" name=\"address\" value=\"\" rows=\"2\" cols=\"20\">\n");
      out.write("\n");
      out.write("            </textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                    <td  id=\"LabelWagesMode\">Wages_Mode:</td>\n");
      out.write("                    <td><input disabled=\"disabled\" type=\"radio\" name=\"WagesMode\" value=\"Daily\" checked=\"checked\" />Daily;\n");
      out.write("                        <input disabled=\"disabled\" type=\"radio\" name=\"WagesMode\" value=\"Contract\" />Contract</td>\n");
      out.write("\n");
      out.write("                        <td id=\"LabelCharge\">Charges/Day:</td>\n");
      out.write("                        <td><input disabled=\"disabled\" type=\"text\" name=\"Dailycharges\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td id=\"LabelWellSkilled\">WellSkilled:</td>\n");
      out.write("                        <td><input disabled=\"disabled\" type=\"text\" name=\"Specialization\" value=\"\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                        <td id=\"LabelAddress\">Address:</td>\n");
      out.write("                        <td><textarea disabled=\"disabled\" name=\"address\" rows=\"2\" cols=\"20\">\n");
      out.write("\n");
      out.write("            </textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td id=\"LabelState\">State:</td>\n");
      out.write("           <td><input disabled=\"disabled\" type=\"text\" name=\"State\" value=\"\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("           <td id=\"LabelMobileNumber\">Mobile Number</td>\n");
      out.write("           <td><input disabled=\"disabled\" type=\"text\" name=\"mobile_no\" value=\"\" size=\"20\" /></td>\n");
      out.write("       </tr>\n");
      out.write("            </table>\n");
      out.write("                <br/><hr/>\n");
      out.write("\n");
      out.write("            <table align=\"center\" >\n");
      out.write("                <th colspan=\"5\">Go to The Required Fields</th>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"../UpdateWorkerProfile/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                    Change Profile\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("               </td>\n");
      out.write("                <td>\n");
      out.write("                      <a href=\"../home/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                    Sign Out\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("              \n");
      out.write("               <td>\n");
      out.write("                      <a href=\"../Help/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                    Help?\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                      <a href=\"../Aboutus/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                    About US\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("               \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../includes/footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
