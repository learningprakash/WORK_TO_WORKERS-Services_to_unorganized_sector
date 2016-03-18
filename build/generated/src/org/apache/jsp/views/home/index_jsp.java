package org.apache.jsp.views.home;

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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../includes/header.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             <fieldset style=\"width: 20%;margin-left: 80%\">\n");
      out.write("                <legend style=\"font-size: 30px\">SignIn</legend>\n");
      out.write("           <table >\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"../Generalpublicsignin/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                    General Public\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("              </td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("                   <td>\n");
      out.write("                      <a href=\"../Workersignin/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                   Worker\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("      </tr>\n");
      out.write("       <tr>\n");
      out.write("              <td>\n");
      out.write("                       <a href=\"../Organisationsignin/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                     Organisation\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("               </td>\n");
      out.write("        </tr>\n");
      out.write("            </table>\n");
      out.write("        </fieldset>\n");
      out.write("       <fieldset style=\"width: 20%;margin-left: 80%\">\n");
      out.write("                <legend style=\"font-size: 30px\">SignUp</legend>\n");
      out.write("        <table>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"../Generalpublicsignup/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                    General Public\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("              </td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("                   <td>\n");
      out.write("                      <a href=\"../Workersignup/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                   Worker\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("      </tr>\n");
      out.write("       <tr>\n");
      out.write("              <td>\n");
      out.write("                       <a href=\"../Organisationsignup/index.jsp\">\n");
      out.write("                    <ul>\n");
      out.write("                     Organisation\n");
      out.write("                    </ul>\n");
      out.write("                    </a>\n");
      out.write("               </td>\n");
      out.write("        </tr>\n");
      out.write("            </table>\n");
      out.write("       </fieldset>\n");
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
