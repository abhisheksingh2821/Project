package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
 if(!(request.getSession().getAttribute("textname")==null)){
    
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <style>\n");
      out.write("            body \n");
      out.write("            {\n");
      out.write("                background-image: url(57.jpg);\n");
      out.write("                height:740px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("             .div1\n");
      out.write("{\n");
      out.write("    width: 1346;\n");
      out.write("    height: 120px;  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".div6\n");
      out.write("{\n");
      out.write("    background-color: #004d4d;\n");
      out.write("    width: 1346px;\n");
      out.write("    height: 350px;\n");
      out.write("}\n");
      out.write(".div2\n");
      out.write("{\n");
      out.write("    width: 1346px;\n");
      out.write("    height: 52px;  \n");
      out.write("}\n");
      out.write(".div2 a\n");
      out.write("{\n");
      out.write("    float: left;\n");
      out.write("    text-decoration: none;\n");
      out.write("    color:black;\n");
      out.write("    font-size: 20px;\n");
      out.write("    background-color:lightcyan;\n");
      out.write("    padding: 15px 45.5px;\n");
      out.write("}\n");
      out.write(".div2 a:hover{color:red;background-color:lightgoldenrodyellow ;}\n");
      out.write("td{padding:2px 75px;font-size:20px;font-family: cursive;}   \n");
      out.write("            </style>\n");
      out.write("        \n");
      out.write("<script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("               <div class=\"div1\">\n");
      out.write("                <img src=\"images.png\" style=\"height: 90;width: 90;float:left;margin-left: 20;margin-top: 5;\">\n");
      out.write("                <h1 style=\"font-family: cursive;text-shadow: 1px 1px 1px white;color: palegoldenrod;float:left;margin-left: 300;\">COLLEGE APPLICATION APPROVAL</h1>\n");
      out.write("<nav style=\"float:right;\">\n");
      out.write("    <a href=\"home.jsp\"> <input type=\"button\" value=\"Home\" style=\"background-color:whitesmoke; margin-top: 20px;color:red;text-decoration:none;font-size:20px;margin-left:40px;padding:16px 15px;border: 1px;border-radius:60px\">\n");
      out.write("       </a> </nav></div>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("     <div class=\"div2\">\n");
      out.write("               <nav>\n");
      out.write("                   <a href=\"StudentRegistration.html\">Application form</a>\n");
      out.write("                   <a href=\"apply.html\">Colleges for you</a>\n");
      out.write("                   <a href=\"counsel.html\">Counselling</a>\n");
      out.write("                   <a href=\"userp.html\">User profile</a>\n");
      out.write("                   <a href=\"contact.html\">Contact US</a>\n");
      out.write("                   <a href=\"about.html\">About US</a>\n");
      out.write("                       <a href=\"index.html\">Log Out</a>\n");
      out.write("                   \n");
      out.write("               </nav>\n");
      out.write("     </div>\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("      \n");
      out.write("           <div class=\"div3\">\n");
      out.write("           <p style=\"color: red;font-size: 35px;height: 50px;width:400px;background-color: whitesmoke;margin-top: 0;text-align: center;border-bottom-right-radius:  40px;\">User Profile</p>\n");
      out.write("              <p style=\"background-color:none; font-family: cursive;margin-top: 15px;color:black;text-decoration:none;font-size:30px;margin-left:40px;padding:16px 15px;border: 1px;border-radius:60px\">\n");
      out.write("                         ");
      out.print( request.getSession().getAttribute("uname").toString());
      out.write("  </p></b> \n");
      out.write("           ");
}
else
{
response.sendRedirect("home.jsp");
}
      out.write("          </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
