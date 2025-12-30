package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Metamorphosis Design Free Css Templates</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link href=\"textboxstyle.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"mainbg\">\n");
      out.write("<!-- header begins -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"buttons\">\n");
      out.write("\t\t<div class=\"menu_width\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"index.jsp\" title=\"\" class=\"active\">Home</a></li>\n");
      out.write("\t\t\t\n");
      out.write("<!--\t\t\t<li><a href=\"#\" title=\"\">About</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\" title=\"\">Contact</a></li>-->\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"logo\">\n");
      out.write("\t\t<h1><img style=\"margin-right: 1px\"src=\"images/hedd.png\"></img></h1>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("<!-- header ends -->\n");
      out.write("<!-- content begins -->\n");
      out.write("<div id=\"main\" style=\"margin-top: 55px\" >\n");
      out.write("<div id=\"main_top\"></div>\n");
      out.write("<div id=\"content_bg\">\n");
      out.write("  <div id=\"content\">\n");
      out.write("\t<div id=\"right\">\n");
      out.write("\t\t<h2>LIST</h2>\n");
      out.write("\t\t<div class=\"categories\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("\t\t\t<li><a href=\"attack.jsp.jsp\">BACK</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"company\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("          \t<div id=\"left\">\n");
      out.write("\t\t<div class=\"left_top\"></div>\n");
      out.write("                <center><h1 style=\"color: red;font-family:Castellar;font-size: 25px\">USER LOGIN</h1></center>\n");
      out.write("\t\t<div id=\"text\">\n");
      out.write("\t\t\n");
      out.write("                   \n");
      out.write("                    <form  action=\"vulnarab.jsp\" method=\"post\">\n");
      out.write("                        <center><table><br></br>\n");
      out.write("                                <tr><td style=\"color: brown;font-size: 20px\">USERNAME</td><td><input style=\"width: 250px\" type=\"text\" name=\"username\" value=\"\" requireds=\"\" style=\"color: red\"  class=\"inputs\" /> </td> </td></tr>\n");
      out.write("                                <tr><td style=\"color: brown;font-size: 20px\">PASSWORD</td><td><input style=\"width: 250px\" type=\"text\" name=\"password\" value=\"\" requireds=\"\" style=\"color: red\"  class=\"inputs\" /> </td> </td>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                                  <tr><td><input type=\"submit\" value =\"LOGIN \" style=\"color: red\"  class=\"inputs\" /> </td></tr>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                 </table></center>\n");
      out.write("                    </form>\n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- content ends -->\n");
      out.write("<!-- footer begins -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
