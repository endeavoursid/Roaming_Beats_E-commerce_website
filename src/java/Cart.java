import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;  
    
public class Cart extends HttpServlet  
{    
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
      {  
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
         try 
         {  
             Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
             // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.  
             Statement stmt = con.createStatement();
             int total=0;
             ResultSet rs = stmt.executeQuery("select * from t81");  
             out.println("<html>\n" +
"    <head>\n" +
"        <title>Cart - Roaming beats</title>\n" +
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
"        <!--cart item details ------->\n" +
"        \n" +
"        <div class=\"small-container cart-page\">\n" +
"            <table>\n" +
"                <tr>\n" +
"                    <th>Product</th>\n" +
"                    <th>Quantity</th>\n" +
"                    <th>Subtotal</th>\n" +
"                </tr>");  
             while (rs.next()) 
             {  
                 String n = rs.getString("PName");  
                 int nm = rs.getInt("Quan");  
                 int s = rs.getInt("Price");   
                 int cost = nm*s;
                total=total+cost;
                 out.println("<tr>\n" +
"                            <td><div class=\"cart-info\">\n" +
"                                    <div>\n" +
"                                        <p>"+n+"</p>\n" +
"                                    </div>\n" +
"                        </div></td>\n" +
"                        <td><div class=\"cart-info\">\n" +
"                                    <div>\n" +
"                                        <p>Quantity :"+nm+"</p>\n" +
"                                        \n" +
"                                    </div>\n" +
"                        </div></td>\n" +
"                        <td><div class=\"cart-info\">\n" +
"                                    <div>\n" +
"                                        \n" +
"                                        <small>Total: "+cost+" </small>\n" +
"                                    </div>\n" +
"                        </div></td>\n" +
"                   \n" +
"                </tr>");   
             }
             
             out.println(" </table>\n" +
"            <div class=\"total-price\">\n" +
"                <table><tr>\n" +
"                        <td>Total</td>\n" +
"                        <td>Rs."+total+"</td>\n" +
"                    </tr>\n" +
"                </table>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <a href=\"thankyou.html\" class=\"btn\">Proceed to CheckOut &#8594;</a>\n" +
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
             con.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  
     }  
 }