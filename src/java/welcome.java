import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.*;//for getting the generic servlet class 
import javax.servlet.http.*;//for getting the http servlet class
import java.sql.*;

public class welcome extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String n=req.getParameter("username");
        String p=req.getParameter("password");
       /* pw1.println("<html><body bgcolor=skyblue>Name : "+nm+"<br>Email: "+em+"<br>Password: "+pass+"<br>Question: "+ques+"<br>Answer: "+ans+"<br>Address: "
                +add+"<br>Contact No.: "+no+"</body></html>");*/
       try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //registering type4 driver of oracle
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
            Statement stmt=con.createStatement();
           String q1="select * from t80 where eemail='"+n+"'and epass='"+p+"'";
             ResultSet rs=stmt.executeQuery(q1);
            if(rs.next())
            {
                pw1.println("<!DOCTYPE html>\n" +
"<!--\n" +
"To change this license header, choose License Headers in Project Properties.\n" +
"To change this template file, choose Tools | Templates\n" +
"and open the template in the editor.\n" +
"-->\n" +
"<html>\n" +
"    <head>\n" +
"        <title>Roaming Beats| E-commerce website</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"        <link rel=\"stylesheet\" href=\"newcss.css\">\n" +
"        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;600;700&display=swap\"\n" +
"              rel=\"stylesheet\">\n" +
"        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
"        \n" +
"    </head>\n" +
"    \n" +
"    <body>\n" +
"            <div class='header'>\n" +
"        <div class=\"container\"><div class=\"navbar\">\n" +
"            <div class=\"logo\">\n" +
"                <a href=\"index.html\"><img src=\"pictures/logo2.png\" width=\"125\"></a>\n" +
"            </div>\n" +
"            <nav>\n" +
"                <ul>\n" +
"                    <li><a href=\"index.html\">Home</a></li>\n" +
"                    <li><a href=\"allproduct.html\">Products</a></li>\n" +
"                    <li><a href=\"\">About</a></li>\n" +
"                    <li><a href=\"\">Contact</a></li>\n" +
"                    <li><a href=\"login.jsp\">Account</a></li>\n" +
"                </ul>\n" +
"            </nav>\n" +
"                <a href=\"Cart\"><img src=\"pictures/cart.png\" width='30' height='30'> </a>\n" +
"            </div>\n" +
"            <div class=\"row\">\n" +
"            <div class=\"col-2\">\n" +
"                <h1>Welcome "+rs.getString(1)+" <br>Start Shopping !</h1>\n" +
"                <br><br>\n" +
"                <a href=\"index.html\" class=\"btn\">Home Page &#8594;</a>\n" +
"            </div>\n" +
"            <div class=\"col-2\">\n" +
"                <img src=\"pictures/model.png\">\n" +
"            </div>\n" +
"        </div>\n" +
"            </div>\n" +
"            </div>\n" +
"        <!-------------- brands ------------>\n" +
"        <div class='brands'>\n" +
"            <div class='small-container'>\n" +
"                <div class='row'>\n" +
"                    <div class='col-5'>\n" +
"                        <img src='pictures/pumalogo.png'>\n" +
"                    </div>\n" +
"                    <div class='col-5'>\n" +
"                        <img src='pictures/adidaslogo.png'>\n" +
"                    </div>\n" +
"                    <div class='col-5'>\n" +
"                        <img src='pictures/nikelogo.png'>\n" +
"                    </div>\n" +
"                    <div class='col-5'>\n" +
"                        <img src='pictures/reeboklogo.png'>\n" +
"                    </div>\n" +
"                    <div class='col-5'>\n" +
"                        <img src='pictures/guccilogo.png'>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class='footer'>\n" +
"            <div class='container'>\n" +
"                        <div class='row'><div class='footer-col-1'>\n" +
"                                <h3>Download Our App</h3>\n" +
"                                <p>Download App for Android and ios.</p>\n" +
"                                <div class='app-logo'>\n" +
"                                    <img src='pictures/playstore.png'>\n" +
"                                    <img src='pictures/appstore.jpg'>\n" +
"                                </div>\n" +
"                    </div>\n" +
"                            <div class='footer-col-2'>\n" +
"                                <img src='pictures/logo2.png'>\n" +
"                                <p>Our purpose is to sustainably make the pleasure and benefits of\n" +
"                                    high quality clothes accessible to the many.</p>\n" +
"                            </div>\n" +
"                            <div class='footer-col-3'>\n" +
"                                <h3>Useful Links</h3>\n" +
"                                <ul>\n" +
"                                    <li>Coupons</li>\n" +
"                                    <li>Blog Post</li>\n" +
"                                    <li>Return Policy</li>\n" +
"                                    <li>Join Affiliate</li>\n" +
"                                </ul>\n" +
"                            </div>\n" +
"                             <div class='footer-col-4'>\n" +
"                                 <h3>Follow us</h3>\n" +
"                                <ul>\n" +
"                                    <li>Facebook</li>\n" +
"                                    <li>Twitter</li>\n" +
"                                    <li>Instagram</li>\n" +
"                                    <li>Youtube</li>\n" +
"                                </ul>\n" +
"                            </div>\n" +
"            </div>\n" +
"                <hr>\n" +
"                <p class='copyright'>Copyright 2023 - P se project</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        </body>\n" +
"</html>\n" +
"");
            }
            else
            {
                pw1.println("<!DOCTYPE html>\n" +
"<!--\n" +
"To change this license header, choose License Headers in Project Properties.\n" +
"To change this template file, choose Tools | Templates\n" +
"and open the template in the editor.\n" +
"-->\n" +
"<html>\n" +
"    <head>\n" +
"        <title>T-Shirt - Roaming beats</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"        <link rel=\"stylesheet\" href=\"newcss.css\">\n" +
"        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;600;700&display=swap\"\n" +
"              rel=\"stylesheet\">\n" +
"        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
"        \n" +
"    </head>\n" +
"     \n" +
"    <body>\n" +
"           \n" +
"        <div class=\"container\"><div class=\"navbar\">\n" +
"            <div class=\"logo\">\n" +
"                <img src=\"pictures/logo2.png\" width=\"125\">\n" +
"            </div>\n" +
"            <nav>\n" +
"                <ul>\n" +
"                    <li><a href=\"index.html\">Home</a></li>\n" +
"                    <li><a href=\"allproduct.html\">Products</a></li>\n" +
"                    <li><a href=\"\">About</a></li>\n" +
"                    <li><a href=\"\">Contact</a></li>\n" +
"                    <li><a href=\"login.jsp\">Account</a></li>\n" +
"                </ul>\n" +
"            </nav>\n" +
"                <img src=\"pictures/cart.png\" width='30' height='30'> \n" +
"            </div>\n" +
"           \n" +
"        </div>\n" +
"       <!----account page----->\n" +
"       <div class=\"account-page\">\n" +
"           <div class=\"container\">\n" +
"               <div class=\"row\">\n" +
"                   <div class=\"col-2\">\n" +
"                       <img src=\"pictures/model.png\" width=\"100%\">\n" +
"                   </div>\n" +
"                   <div class=\"col-2\">\n" +
"                       <div class=\"form-container\">\n" +
"                           <div class=\"form-btn\">\n" +
"                               <span>Login</span>\n" +
"                           </div>\n" +
"                           <p>Invalid Credentials, please try again.</p>\n" +
"                           <form method=\"post\" action=\"welcome\">\n" +
"                               <input type=\"text\" placeholder=\"E-mail\" name=\"username\">\n" +
"                               <input type=\"password\" placeholder=\"password\" name=\"password\">\n" +
"                               <button type=\"submit\" class=\"btn\">Login</button>\n" +
"                               <a href=\"forgetpassword.html\">Forget password</a><br><br>\n" +
"                        <a href=\"signup.html\">Sign up</a>\n" +
"                           </form>\n" +
"                       </div>\n" +
"                   </div>\n" +
"               </div>\n" +
"           </div>\n" +
"       </div>\n" +
"        <div class='footer'>\n" +
"            <div class='container'>\n" +
"                        <div class='row'><div class='footer-col-1'>\n" +
"                                <h3>Download Our App</h3>\n" +
"                                <p>Download App for Android and ios.</p>\n" +
"                                <div class='app-logo'>\n" +
"                                    <img src='pictures/playstore.png'>\n" +
"                                    <img src='pictures/appstore.jpg'>\n" +
"                                </div>\n" +
"                    </div>\n" +
"                            <div class='footer-col-2'>\n" +
"                                <img src='pictures/logo2.png'>\n" +
"                                <p>Our purpose is to sustainably make the pleasure and benefits of\n" +
"                                    high quality clothes accessible to the many.</p>\n" +
"                            </div>\n" +
"                            <div class='footer-col-3'>\n" +
"                                <h3>Useful Links</h3>\n" +
"                                <ul>\n" +
"                                    <li>Coupons</li>\n" +
"                                    <li>Blog Post</li>\n" +
"                                    <li>Return Policy</li>\n" +
"                                    <li>Join Affiliate</li>\n" +
"                                </ul>\n" +
"                            </div>\n" +
"                             <div class='footer-col-4'>\n" +
"                                 <h3>Follow us</h3>\n" +
"                                <ul>\n" +
"                                    <li>Facebook</li>\n" +
"                                    <li>Twitter</li>\n" +
"                                    <li>Instagram</li>\n" +
"                                    <li>Youtube</li>\n" +
"                                </ul>\n" +
"                            </div>\n" +
"            </div>\n" +
"                <hr>\n" +
"                <p class='copyright'>Copyright 2023 - P se project</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        </body>\n" +
"</html>\n" +
"\n" +
"");
            }
            con.close();
        }
        catch (Exception e)
        {
            pw1.println(e);
        }
     
    }
}