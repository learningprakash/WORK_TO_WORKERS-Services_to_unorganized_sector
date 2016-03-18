package org.apache.jsp.views.UpdateWorkerProfile;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>UpDate Profile Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <form action=\"../../UpdateWorkerProfileC\" method=\"post\" >\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <th colspan=\"2\">Login Information</th>\n");
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                    <td id=\"LabelWorker_Id\">Worker_Id</td>\n");
      out.write("                    <td><input type=\"text\" name=\"worker_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${worker_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelEmail_Id\">Email_Id</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelPassword\">Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                    <td id=\"LabelRating\">RatingId</td>\n");
      out.write("                    <td><input type=\"password\" name=\"rating_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rating_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                  </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("                <br/>\n");
      out.write("\n");
      out.write("            <table align=\"center\" >\n");
      out.write("                <th colspan=\"2\">Personal Information</th>\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"LabelName\">Name:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"LabelAge\">Age:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"age\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${age}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                   <tr>\n");
      out.write("                    <td  id=\"LabelGender\">Gender:</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"gender\" value=\"male\" checked=\"checked\" />Male;\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"female\" />Female</td>\n");
      out.write("                    </tr>\n");
      out.write("                   <tr>\n");
      out.write("           <td id=\"LabelJob\">Job:</td>\n");
      out.write("           <td><select name=\"Job\">\n");
      out.write("                   <option value=\"mason\">Mason</option>\n");
      out.write("                   <option value=\"gardener\">Gardner</option>\n");
      out.write("            <option>Painter</option>\n");
      out.write("            <option>Sweaper</option>\n");
      out.write("            <option>Labour</option>\n");
      out.write("            <option>Carpenter</option>\n");
      out.write("            <option>Any</option>\n");
      out.write("               </select></td>\n");
      out.write("       </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td id=\"LabelAddress\">Working Area:</td>\n");
      out.write("                        <td><textarea name=\"address\" rows=\"2\" cols=\"20\">\n");
      out.write("\n");
      out.write("            </textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("           <td id=\"LabelCity\">City</td>\n");
      out.write("           <td><select name=\"Job\">\n");
      out.write("            <option>Jabalpur</option>\n");
      out.write("            <option>Gwalior</option>\n");
      out.write("            <option>Indore</option>\n");
      out.write("            <option>Satna<option>\n");
      out.write("            <option>Bhopal</option>\n");
      out.write("            <option>Ratlam</option>\n");
      out.write("            <option>Any</option>\n");
      out.write("               </select></td>\n");
      out.write("       </tr>\n");
      out.write("                     <tr>\n");
      out.write("                    <td  id=\"LabelWagesMode\">Wages_Mode:</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"WagesMode\" value=\"Daily\" checked=\"checked\" />Daily;\n");
      out.write("                        <input type=\"radio\" name=\"WagesMode\" value=\"Contract\" />Contract</td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td id=\"LabelCharge\">Charges/Day:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"daily_charges\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Daily_charges}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td id=\"LabelWellSkilled\">Specialization:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"Specialization\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Specialization}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"LabelAddress\">Address:</td>\n");
      out.write("                        <td><textarea name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" rows=\"2\" cols=\"20\">\n");
      out.write("\n");
      out.write("            </textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td id=\"LabelState\">State:</td>\n");
      out.write("           <td><select name=\"State\">\n");
      out.write("            <option>Andhra Pradesh</option>\n");
      out.write("            <option>Arunachal Pradesh</option>\n");
      out.write("            <option>Asam</option>\n");
      out.write("            <option>Bihar</option>\n");
      out.write("            <option>Chandigarh</option>\n");
      out.write("            <option>Chhatisgarh</option>\n");
      out.write("            <option>Delhi</option>\n");
      out.write("            <option>Goa</option>\n");
      out.write("            <option>Gujrat</option>\n");
      out.write("            <option>Haryana</option>\n");
      out.write("            <option>Himachal Pradesh</option>\n");
      out.write("            <option>Jammu & Kashmir</option>\n");
      out.write("            <option>Jharkhand</option>>\n");
      out.write("            <option>Karnataka</option>\n");
      out.write("            <option>Kerala</option>\n");
      out.write("            <option>Madhya Pradesh</option>\n");
      out.write("            <option>Maharashtra</option>\n");
      out.write("            <option>Manipur</option>\n");
      out.write("            <option>Meghalaya</option>\n");
      out.write("            <option>Mizoram</option>\n");
      out.write("            <option>Nagaland</option>\n");
      out.write("            <option>Orisa</option>\n");
      out.write("            <option>Pondicheri</option>\n");
      out.write("            <option>Punjab</option>\n");
      out.write("            <option>Rajsthan</option>\n");
      out.write("            <option>Sikkim</option>\n");
      out.write("            <option>Tamilnadu</option>\n");
      out.write("            <option>Tripura</option>\n");
      out.write("            <option>Uttaranchal</option>\n");
      out.write("            <option>Uttar Pradesh</option>\n");
      out.write("            <option>West Bengal</option>\n");
      out.write("               </select></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td id=\"LabelMobileNumber\">Mobile Number</td>\n");
      out.write("           <td><input type=\"text\" name=\"mobile_no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mobile_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("       </tr>\n");
      out.write("\n");
      out.write("       <tr>\n");
      out.write("\n");
      out.write("           <td></td><td>\n");
      out.write("               <input type=\"Submit\"  name=\"Update\" value=\"Update\" />\n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
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
