<%-- 
    Document   : final
    Created on : 13 Apr, 2021, 5:54:35 PM
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
        <table cellpadding="50px" width="100%">
            <tr>
                <td>
                    <font size="5">
                        <p>
                            <%
                                out.println("Dear "+name+",");
                            %>
                            <br><br>
                            Your order has been placed.<br>
                            You will receive your order within 5-7 working days.<br><br>
                            Thank You for ordering from Roaming Beats.<br><br>
                            Payment of Rs. <% out.println(session.getAttribute("amt")); %> for your order to be paid at delivery of the product.<br>
                            <a href="home.jsp">Click Here</a> to view other products.
                        </p>
                    </font>
                </td>
                <td align="center" width="500px">
                    <img src="pictures\final.jpg" height="250px" width="250px">
                </td>
            </tr>
        </table>
    </body>
</html>
