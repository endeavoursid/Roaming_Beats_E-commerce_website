package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p align=\"right\">\n");
      out.write("            ");
 
                String name=(String)session.getAttribute("N");
                out.println("Welcome "+name);
            
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <a href=\"login.jsp\">Logout</a>\n");
      out.write("        </p>\n");
      out.write("        <table width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"220px\">\n");
      out.write("                    <a href=\"home.jsp\" title=\"Roaming Beats\">\n");
      out.write("                        <img src=\"pictures/logo.jpg\" height=\"180px\" width=\"220px\" style=\"border-radius: 25px;\">\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <p align=\"center\"><font size=\"10\">Roaming Beats Merchandise Sale</font></p>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br><br>\n");
      out.write("        <font size=\"5\">\n");
      out.write("            ");

                out.println("<table cellspacing=0 cellpadding=0 align=center>");
                out.println("<tr><th colspan=2>Order Details</th></tr></table><br>");
                out.println("<table cellspacing=0 cellpadding=0 align=center>");
                out.println("<tr><td width=155>Name: </td><td width=350>"+(session.getAttribute("N")+"</td></tr>"));
                out.println("<tr><td>Address: </td><td>"+(session.getAttribute("loc")+"</td></tr>"));
                out.println("<tr><td>Mobile No.: </td><td>"+(session.getAttribute("mob")+"</td></tr>"));
                out.println("<tr><td>Email Id: </td><td>"+(session.getAttribute("em")+"</td></tr>"));
                out.println("<tr><td>Product: </td><td>"+(session.getAttribute("name")+"</td></tr>"));
                out.println("<tr><td>Size: </td><td>"+(session.getAttribute("sz")+"</td></tr>"));
                out.println("<tr><td>Price: </td><td>Rs. "+(session.getAttribute("pr")+"</td></tr>"));
                out.println("<tr><td>Quantity: </td><td>"+(session.getAttribute("qn")+"</td></tr>"));
                out.println("<tr><td>Total Amount: </td><td>Rs. "+(session.getAttribute("amt")+"</td></tr>"));
                out.println("</table>");
            
      out.write("\n");
      out.write("        </font>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"final.jsp\">\n");
      out.write("            <center>\n");
      out.write("                <input type=\"submit\" value=\"Confirm Order\">\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
