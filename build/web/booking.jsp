<%-- 
    Document   : booking
    Created on : 9 Apr, 2021, 2:58:27 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p align="right">
            <% 
                String name=(String)session.getAttribute("N");
                out.println("Welcome "+name);
            %>
            <br>
            <a href="login.jsp">Logout</a>
        </p>
        <table width="100%">
            <tr>
                <td width="220px">
                    <a href="home.jsp" title="Roaming Beats">
                        <img src="pictures/logo.jpg" height="180px" width="220px" style="border-radius: 25px;">
                    </a>
                </td>
                <td>
                    <p align="center"><font size="10">Roaming Beats Merchandise Sale</font></p>
                </td>
            </tr>
        </table>
        <br><br>
        <font size="5">
            <%
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
            %>
        </font>
        <br>
        <form action="final.jsp">
            <center>
                <input type="submit" value="Confirm Order">
            </center>
        </form>
    </body>
</html>
