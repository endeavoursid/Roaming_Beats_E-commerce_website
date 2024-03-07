<%-- 
    Document   : home
    Created on : 8 Apr, 2021, 6:15:00 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <p align="right">
            <% 
                String name=(String)session.getAttribute("N");
                out.println("welcome"+name);
            %>
            <br>
            <a href="login.jsp">Logout</a>
        </p>
        <table width="100%">
            <tr>
                <td width="220px">
                    <img src="pictures/logo.jpg" height="180px" width="220px" style="border-radius: 25px;">
                </td>
                <td>
                    <p align="center"><font size="10">Roaming Beats Merchandise Sale</font></p>
                </td>
            </tr>
        </table>
        <br><br><br><br>
        <table width="100%">
            <tr>
                <td align="center">
                    <a href="mens.jsp" title="Men's Wear">
                        <img src="pictures/mens.jpg" height="200" width="200">
                    </a>
                </td>
                <td align="center" title="Women's Wear">
                    <a href="womens.jsp">
                        <img src="pictures/womens.jpg" height="200" width="200">
                    </a>
                </td>
                <td align="center" title="Hoodies">
                    <a href="hoodie.jsp">
                        <img src="pictures/hoodie.jpg" height="200" width="200">
                    </a>
                </td>
                <td align="center" title="Caps">
                    <a href="caps.jsp">
                        <img src="pictures/caps.jpg" height="200" width="200">
                    </a>
                </td>
            </tr>
            <tr>
                <td align="center">
                    Men's Wear
                </td>
                <td align="center">
                    Women's Wear
                </td>
                <td align="center">
                    Hoodies
                </td>
                <td align="center">
                    Caps
                </td>
            </tr>
        </table>
    </body>
</html>
