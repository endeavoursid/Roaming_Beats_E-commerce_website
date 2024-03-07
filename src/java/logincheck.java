import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class logincheck extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        ArrayList<String> username=new ArrayList<String>();
        ArrayList<String> password=new ArrayList<String>();
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //registering type4 driver of oracle
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
            Statement smt=con.createStatement();
            String lname=req.getParameter("txtUser");
            String lpass=req.getParameter("txtPass");
            String select="select * from t80 where name='"+lname+"' and epass='"+lpass+"';";
            ResultSet rs=smt.executeQuery(select);
            int checker=0;
            String n=null,mobile=null,email=null,location=null;
            while(rs.next())
            {
                checker=checker+1;
                n=rs.getString(1);
                location=rs.getString(2);
                mobile=rs.getString(3);
                email=rs.getString(4);
            }
            if(checker>0) 
            {
                HttpSession nam=req.getSession();
                nam.setAttribute("N",n);
                nam.setAttribute("mob",mobile);
                nam.setAttribute("em",email);
                nam.setAttribute("loc",location);
                RequestDispatcher rd=req.getRequestDispatcher("index.html");
                rd.forward(req, res);
            }
            else
            {
                RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
                pw.println("Invalid username or password");
                rd.include(req, res);
             }
            con.close();
        }
        catch(Exception e)
        {
            pw.println(e);
        }
    }
}
