package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Intrusion Detection and Prevention</title>\n");
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
      out.write("\t\t\t<li><a href=\"user.jsp\" title=\"\">USER</a></li>\n");
      out.write("                       <li><a href=\"admin.jsp\" title=\"\">ADMIN</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"logo\">\n");
      out.write("\t\t<h1><img src=\"images/hedd1.png\"></img></h1>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("<!-- header ends -->\n");
      out.write("<!-- content begins -->\n");
      out.write("<div id=\"main\" style=\"margin-top: 150px\" >\n");
      out.write("<div id=\"main_top\"></div>\n");
      out.write("<div id=\"content_bg\">\n");
      out.write("    <div id=\"content\">\n");
      out.write("\t<div id=\"right\">\n");
      out.write("\t\t<h2>LIST</h2>\n");
      out.write("\t\t<div class=\"categories\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("\t\t\t<li><a href=\"user.jsp\">USER</a></li>\n");
      out.write("                        <li><a href=\"admin.jsp\">ADMIN</a></li>\n");
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
      out.write("                <center><h1 style=\" color: red;font-family:Castellar;font-size: 25px\">welcome</h1></center>\n");
      out.write("\t\t<div id=\"text\">\n");
      out.write("\t\t\n");
      out.write("                    <h1 style=\"text-align: justify; width: 97%;\"> Cloud security is one of most important issues that have attracted a lot of research and development effort in past few years. Particularly, attackers can explore vulnerabilities of a cloud system and compromise virtual machines to deploy further large-scale Distributed Denial-of-Service (DDoS). DDoS attacks usually involve early stage actions such as multi-step exploitation, low frequency vulnerability scanning, and compromising identified vulnerable virtual machines as zombies, and finally DDoS attacks through the compromised zombies. Within the cloud system, especially the Infrastructure-as-a-Service (IaaS) clouds, the detection of zombie exploration attacks is extremely difficult. This is because cloud users may install vulnerable applications on their virtual machines. To prevent vulnerable virtual machines from being compromised in the cloud, we propose a multi-phase distributed vulnerability detection, measurement, and countermeasure selection mechanism called NICE, which is built on attack graph based analytical models and reconfigurable virtual network-based countermeasures. The proposed framework leverages OpenFlow network programming APIs to build a monitor and control plane over distributed programmable virtual switches in order to significantly improve attack detection and mitigate attack consequences. The system and security evaluations demonstrate the efficiency and effectiveness of the proposed solution.<h2>\n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("    </div><div id=\"main_bot\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- content ends -->\n");
      out.write("<!-- footer begins -->\n");
      out.write("<div id=\"footer\">\n");
      out.write(" \n");
      out.write("\t\t\n");
      out.write("<!-- footer ends -->\n");
      out.write("\n");
      out.write("</div>\n");
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
