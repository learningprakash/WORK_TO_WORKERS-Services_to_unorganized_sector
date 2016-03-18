package org.apache.jsp.views.Requireworkers;

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
      out.write("        <form action=\"../../RequireworkersC\" method=\"post\" >\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <th colspan=\"4\">Workers Required</th>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelName\">Name of requestee:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                    <td id=\"LabelRequestId\">Request Id:</td>\n");
      out.write("                    <td><input type=\"text\" disabled name=\"RequestNumber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RequestNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelName\">Number of Workers required</td>\n");
      out.write("                    <td><input type=\"text\" name=\"NumberOfWorkers\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${NumberOfWorkers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  id=\"LabelGender\">Gender:</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"gender\" value=\"male\" checked=\"checked\" />Male;\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"female\" />Female</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelJob\">Job:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"WorkName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WorkName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  id=\"LabelWagesMode\">Wages_Mode:</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"Wages_Mode\" value=\"Daily\" checked=\"checked\" />Daily;\n");
      out.write("                        <input type=\"radio\" name=\"Wages_Mode\" value=\"Contract\" />Contract</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelStartingdate\">Starting date:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"StatDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${StatDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                    <td id=\"LabelEndingDate\">Ending Date:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"EndDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${EndDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelAddress\">Address:</td>\n");
      out.write("                    <td><textarea name=\"ReqAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ReqAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" rows=\"2\" cols=\"20\">\n");
      out.write("\n");
      out.write("                        </textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelState\">State:</td>\n");
      out.write("                    <td><select name=\"State\">\n");
      out.write("                            <option>Andhra Pradesh</option>\n");
      out.write("                            <option>Arunachal Pradesh</option>\n");
      out.write("                            <option>Asam</option>\n");
      out.write("                            <option>Bihar</option>\n");
      out.write("                            <option>Chandigarh</option>\n");
      out.write("                            <option>Chhatisgarh</option>\n");
      out.write("                            <option>Delhi</option>\n");
      out.write("                            <option>Goa</option>\n");
      out.write("                            <option>Gujrat</option>\n");
      out.write("                            <option>Haryana</option>\n");
      out.write("                            <option>Himachal Pradesh</option>\n");
      out.write("                            <option>Jammu & Kashmir</option>\n");
      out.write("                            <option>Jharkhand</option>>\n");
      out.write("                            <option>Karnataka</option>\n");
      out.write("                            <option>Kerala</option>\n");
      out.write("                            <option>Madhya Pradesh</option>\n");
      out.write("                            <option>Maharashtra</option>\n");
      out.write("                            <option>Manipur</option>\n");
      out.write("                            <option>Meghalaya</option>\n");
      out.write("                            <option>Mizoram</option>\n");
      out.write("                            <option>Nagaland</option>\n");
      out.write("                            <option>Orisa</option>\n");
      out.write("                            <option>Pondicheri</option>\n");
      out.write("                            <option>Punjab</option>\n");
      out.write("                            <option>Rajsthan</option>\n");
      out.write("                            <option>Sikkim</option>\n");
      out.write("                            <option>Tamilnadu</option>\n");
      out.write("                            <option>Tripura</option>\n");
      out.write("                            <option>Uttaranchal</option>\n");
      out.write("                            <option>Uttar Pradesh</option>\n");
      out.write("                            <option>West Bengal</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelCity\">City:</td>\n");
      out.write("                    <td><select name=\"City\">\n");
      out.write("                            <option>Satna</option>\n");
      out.write("                            <option>Ratlam</option>\n");
      out.write("                            <option>Rewa</option>\n");
      out.write("                            <option>Ujjain</option>\n");
      out.write("                            <option>Indore</option>\n");
      out.write("                            <option>Gwalior</option>\n");
      out.write("                            <option>Jabalpur</option>\n");
      out.write("                            <option>Bhopal</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"LabelWageSpecification\">Wage Specification<br/>(less than in Rs):</td>\n");
      out.write("                    <td><input type=\"text\" name=\"WageRange\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WageRange}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td></td><td>\n");
      out.write("                        <input type=\"submit\"  name=\"submit\" value=\"submit\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("           \n");
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
