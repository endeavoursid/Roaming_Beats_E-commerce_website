<%-- 
    Document   : caps
    Created on : 9 Apr, 2021, 7:39:47 AM
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
        <p>
            <font size="10">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Caps</font>
        </p>
        <br>
        <table width="100%">
            <tr>
                <td align="center" width="500px">
                    <img src="pictures/caps.jpg" height="400px" width="350px">
                </td>
                <td>
                    <p>
                        <font size="6">Champ</font><br>
                        <font size="5">Rs. 349</font><br><br>
                        <font size="4">Tax included.</font><br><br><br>
                        <font size="4">
                            <ul type="disc">
                                <li>Color - BLUE</li>
                                <li>Adjustable strap on the back to adjust cap according to your size</li>
                                <li>Ideal for dance performances, baseball matches and casual wear</li>
                                <li>Durable, easy to care 100 percent cotton</li>
                                <li>Material Design: Cotton + Mesh</li>
                                <li>In-pack Contents: 1-Piece Cap</li>
                            </ul>
                        </font>
                    </p>
                </td>
                <td width="250px">
                    <p>
                        <font size="5">
                        <form action="OrderDetails" method="post">
                            &nbsp;&nbsp;&nbsp;&nbsp;Order Here:
                            <br><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;Size: 
                            <select name="size">
                                <option selected>Select your size</option>
                                <option value="Small">Small</option>
                                <option value="Medium">Medium</option>
                            </select>
                            <br><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;Quantity: 
                            <select name="quantity">
                                <option selected>No. of items</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="5">5</option>
                                <option value="10">10</option>
                            </select><br><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <%
                                HttpSession nam=request.getSession(false);
                                nam.setAttribute("P","401");
                            %>
                            <input type="submit" value="Place Order">
                        </form>
                        </font>
                    </p>
                </td>
            </tr>
        </table>
        <br><br>
        <table width="100%">
            <tr>
                <td align="center" width="500px">
                    <img src="pictures/caps2.jpg" height="400px" width="350px">
                </td>
                <td>
                    <p>
                        <font size="6">Winters</font><br>
                        <font size="5">Rs. 999</font><br><br>
                        <font size="4">Tax included.</font><br><br><br>
                        <font size="4">
                            <ul type="disc">
                                <li>Color - GREY</li>
                                <li>Adjustable strap on the back to adjust cap according to your size</li>
                                <li>Ideal for dance performances, baseball matches and casual wear</li>
                                <li>Durable, easy to care 100 percent cotton</li>
                                <li>Material Design: Woolen</li>
                                <li>In-pack Contents: 1-Piece Cap</li>
                            </ul>
                        </font>
                    </p>
                </td>
                <td width="250px">
                    <p>
                        <font size="5">
                        <form action="OrderDetails" method="post">
                            &nbsp;&nbsp;&nbsp;&nbsp;Order Here:
                            <br><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;Size: 
                            <select name="size">
                                <option selected>Select your size</option>
                                <option value="Small">Small</option>
                                <option value="Medium">Medium</option>
                            </select>
                            <br><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;Quantity: 
                            <select name="quantity">
                                <option selected>No. of items</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="5">5</option>
                                <option value="10">10</option>
                            </select><br><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <%
                                nam.setAttribute("P","402");
                            %>
                            <input type="submit" value="Place Order">
                        </form>
                        </font>
                    </p>
                </td>
            </tr>
        </table>
    </body>
</html>
