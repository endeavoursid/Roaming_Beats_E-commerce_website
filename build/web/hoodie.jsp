<%-- 
    Document   : hoodie
    Created on : 9 Apr, 2021, 7:40:10 AM
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
                        <img src="pictures/logo.jpg" height="180px" width="220px" style="border-radius: 25px;"
                    </a>
                </td>
                <td>
                    <p align="center"><font size="10">Roaming Beats Merchandise Sale</font></p>
                </td>
            </tr>
        </table>
        <br><br>
        <p>
            <font size="10">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hoodies</font>
        </p>
        <br>
        <table width="100%">
            <tr>
                <td align="center" width="500px">
                    <img src="pictures/hoodie.jpg" height="400px" width="350px">
                </td>
                <td>
                    <p>
                        <font size="6">Bravo</font><br>
                        <font size="5">Rs. 1099</font><br><br>
                        <font size="4">Tax included.</font><br><br><br>
                        <font size="4">
                            Make a style statement by adding this extremely cool jackbom to your wardrobe add teaming it with a pair of jeans and sneakers will give you an uber look . 
                            <ul type="disc">
                                <li>Material: Cotton</li>
                                <li>Color: Red</li> 
                                <li>Sleeve Type: Long Sleeve</li>
                                <li>Occasion: Casual</li>
                                <li>Fit Type: Unisex Regular Fit</li>
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
                                <option value="XS">XS</option>
                                <option value="S">S</option>
                                <option value="M">M</option>
                                <option value="L">L</option>
                                <option value="XL">XL</option>
                                <option value="XXL">XXL</option>
                                <option value="XXXL">XXXL</option>
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
                                nam.setAttribute("P","301");
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
                    <img src="pictures/hoodie2.jpg" height="400px" width="350px">
                </td>
                <td>
                    <p>
                        <font size="6">Vanquish</font><br>
                        <font size="5">Rs. 1299</font><br><br>
                        <font size="4">Tax included.</font><br><br><br>
                        <font size="4">
                            Make a style statement by adding this extremely cool jackbom to your wardrobe add teaming it with a pair of jeans and sneakers will give you an uber look . 
                            <ul type="disc">
                                <li>Material: Cotton</li>
                                <li>Color: Black</li> 
                                <li>Sleeve Type: Long Sleeve</li>
                                <li>Occasion: Casual Zipper</li>
                                <li>Fit Type: Unisex Regular Fit</li>
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
                                <option value="XS">XS</option>
                                <option value="S">S</option>
                                <option value="M">M</option>
                                <option value="L">L</option>
                                <option value="XL">XL</option>
                                <option value="XXL">XXL</option>
                                <option value="XXXL">XXXL</option>
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
                                nam.setAttribute("P","302");
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
