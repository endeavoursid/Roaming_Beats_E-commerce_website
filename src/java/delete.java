import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.*;//for getting the generic servlet class 
import javax.servlet.http.*;//for getting the http servlet class
import java.sql.*;

public class delete extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        

       
       try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //registering type4 driver of oracle
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
            Statement stmt=con.createStatement();
            String q1="truncate table t81";
            int x=stmt.executeUpdate(q1);
            if(x>0)
            {
                pw1.println("Clear");
                pw1.println("<html>\n" +
"    <head>\n" +
"        \n" +
"    </head>\n" +
"    <body>\n" +
"        <a href=\"index.html\">Home</a>\n" +
"    </body>\n" +
"</html>");
            }
            else
            {
                pw1.println("Cannot Clear");
            
            }
            con.close();
        }
        catch (Exception e)
        {
            pw1.println(e);
        }
     
    }
}