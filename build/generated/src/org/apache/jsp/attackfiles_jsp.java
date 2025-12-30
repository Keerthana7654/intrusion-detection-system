package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import action.Dbcon;
import java.sql.Connection;

public final class attackfiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("?<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Metamorphosis Design Free Css Templates</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link href=\"textboxstyle.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
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
      out.write("          \t<div id=\"left\" style=\"overflow: auto\">\n");
      out.write("\t\t<div class=\"left_top\"></div>\n");
      out.write("                <center><h1 style=\"color: red;font-family:Castellar;font-size: 25px\">USER REGISTRATION</h1></center>\n");
      out.write("\t\t<div id=\"text\">\n");
      out.write("\t\t\n");
      out.write("                   \n");
      out.write("                    <div >\n");
      out.write("                        <table class=\"table-fill\" >\n");
      out.write("                            <thead>\n");
      out.write("        <tr><th class=\"text-left\" >USERID</th><th class=\"text-left\" >USERNAME</th><th class=\"text-left\" >GENDER</th><th class=\"text-left\" >LOCATION</th><th class=\"text-left\" >MAILID</th><th class=\"text-left\" >PHONE</th><th class=\"text-left\" >AGE</th></tr>\n");
      out.write("                            </thead>\n");
      out.write("                           \n");
      out.write("        \n");
      out.write("        ");

        Connection con = Dbcon.getCon();
    Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from attackfile  ");
                       while (rs.next()) {
                           String userid=rs.getString("userid");
                           String attackname =rs.getString("attackname");
                            String attackfile=rs.getString("attackfile");
                           
                            
                           
        
      out.write("\n");
      out.write("        \n");
      out.write("        <tbody class=\"table-hover\">  \n");
      out.write("                  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <tr><td class=\"text-left\" style=\"color:red\" >");
      out.print(userid);
      out.write("</td>\n");
      out.write("            <td class=\"text-left\" style=\"color:red\" >");
      out.print(attackname);
      out.write("</td>\n");
      out.write("            <td class=\"text-left\" style=\"color:red\" ><textarea style=\"width:300px;height:50px;overflow: auto\">");
      out.print(attackfile);
      out.write("</textarea></td>\n");
      out.write("           <\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");

                            
                        }
                        
                    
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("        </table>    \n");
      out.write("                    </div>\t\n");
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
