package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>T-Shirt - Roaming beats</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"newcss.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;600;700&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("     \n");
      out.write("    <body>\n");
      out.write("           \n");
      out.write("        <div class=\"container\"><div class=\"navbar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"pictures/logo2.png\" width=\"125\">\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"allproduct.html\">Products</a></li>\n");
      out.write("                    <li><a href=\"\">About</a></li>\n");
      out.write("                    <li><a href=\"\">Contact</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Account</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("                <img src=\"pictures/cart.png\" width='30' height='30'> \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("       <!----account page----->\n");
      out.write("       <div class=\"account-page\">\n");
      out.write("           <div class=\"container\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                   <div class=\"col-2\">\n");
      out.write("                       <img src=\"pictures/model.png\" width=\"100%\">\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"col-2\">\n");
      out.write("                       <div class=\"form-container\">\n");
      out.write("                           <div class=\"form-btn\">\n");
      out.write("                               <span>Login</span>\n");
      out.write("                           </div>\n");
      out.write("                           <form method=\"post\" action=\"welcome\">\n");
      out.write("                               <input type=\"text\" placeholder=\"E-mail\" name=\"username\">\n");
      out.write("                               <input type=\"password\" placeholder=\"password\" name=\"password\">\n");
      out.write("                               <button type=\"submit\" class=\"btn\">Login</button>\n");
      out.write("                               <a href=\"forgetpassword.html\">Forget password</a><br><br>\n");
      out.write("                        <a href=\"signup.html\">Sign up</a>\n");
      out.write("                           </form>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("        <div class='footer'>\n");
      out.write("            <div class='container'>\n");
      out.write("                        <div class='row'><div class='footer-col-1'>\n");
      out.write("                                <h3>Download Our App</h3>\n");
      out.write("                                <p>Download App for Android and ios.</p>\n");
      out.write("                                <div class='app-logo'>\n");
      out.write("                                    <img src='pictures/playstore.png'>\n");
      out.write("                                    <img src='pictures/appstore.jpg'>\n");
      out.write("                                </div>\n");
      out.write("                    </div>\n");
      out.write("                            <div class='footer-col-2'>\n");
      out.write("                                <img src='pictures/logo2.png'>\n");
      out.write("                                <p>Our purpose is to sustainably make the pleasure and benefits of\n");
      out.write("                                    high quality clothes accessible to the many.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class='footer-col-3'>\n");
      out.write("                                <h3>Useful Links</h3>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Coupons</li>\n");
      out.write("                                    <li>Blog Post</li>\n");
      out.write("                                    <li>Return Policy</li>\n");
      out.write("                                    <li>Join Affiliate</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                             <div class='footer-col-4'>\n");
      out.write("                                 <h3>Follow us</h3>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Facebook</li>\n");
      out.write("                                    <li>Twitter</li>\n");
      out.write("                                    <li>Instagram</li>\n");
      out.write("                                    <li>Youtube</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("            </div>\n");
      out.write("                <hr>\n");
      out.write("                <p class='copyright'>Copyright 2023 - P se project</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </body>\n");
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
