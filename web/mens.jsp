<%-- 
    Document   : mens
    Created on : 8 Apr, 2021, 7:02:26 PM
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
            <font size="10">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Men's Wear</font>
        </p>
        <br>
        <table width="100%">
            <tr>
                <td align="center" width="500px">
                    <img src="pictures/mens.jpg" height="400px" width="350px">
                </td>
                <td>
                    <p>
                        <font size="6">Heroes Challenger</font><br>
                        <font size="5">Rs. 799</font><br><br>
                        <font size="4">Tax included.</font><br><br><br>
                        <font size="4">
                            Material: 100% Premium Combed Cotton, Single jersey, Pre-washed to impart a softer texture. Airy and perspire-friendly fabric that's best suited for Indian weather. “Proudly Made in India”<br>
                            T-Shirt Colour : BLACK / WHITE <br>
                            Sleeve Type: Half <br>
                            Occasion: Classy Casual and Daily Wear. Good to go for any casual scene, express your style with these printed unisex t-shirts.<br>
                            Wash Care instructions: Do not bleach. Dry in shade. Wash with similar colours. Machine wash cold.<br>
                            All designs are printed with skin-friendly chemicals and are tested for up to 10 washes, no bleeding.
                        </font>
                    </p>
                </td>
                <td width="250px">
                    <p>
                        <font  size="5">
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
                                nam.setAttribute("P","101");
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
                    <img src="pictures/mens2.jpg" height="400px" width="350px">
                </td>
                <td>
                    <p>
                        <font size="6">Premium Yellow</font><br>
                        <font size="5">Rs. 599</font><br><br>
                        <font size="4">Tax included.</font><br><br><br>
                        <font size="4">
                            Material: 100% Premium Combed Cotton, Single jersey, Pre-washed to impart a softer texture. Airy and perspire-friendly fabric that's best suited for Indian weather. “Proudly Made in India”<br>
                            T-Shirt Colour : YELLOW<br>
                            Sleeve Type: Half <br>
                            Occasion: Classy Casual and Daily Wear. Good to go for any casual scene, express your style with these printed unisex t-shirts.<br>
                            Wash Care instructions: Do not bleach. Dry in shade. Wash with similar colours. Machine wash cold.<br>
                            All designs are printed with skin-friendly chemicals and are tested for up to 10 washes, no bleeding.
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
                                nam.setAttribute("P","102");
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
                    <img src="pictures/mens3.jpg" height="400px" width="350px">
                </td>
                <td>
                    <p>
                        <font size="6">Rafale</font><br>
                        <font size="5">Rs. 1099</font><br><br>
                        <font size="4">Tax included.</font><br><br><br>
                        <font size="4">
                            Material: 100% Premium Combed Cotton, Pre-washed to impart a softer texture. Airy and perspire-friendly fabric that's best suited for Indian weather. “Proudly Made in India”<br>
                            T-Shirt Colour : Grey/Black <br>
                            Sleeve Type: Full <br>
                            Occasion: Classy Casual and Daily Wear. Good to go for any casual scene, express your style with these printed unisex t-shirts.<br>
                            Wash Care instructions: Do not bleach. Dry in shade. Wash with similar colours. Machine wash cold.<br>
                            All designs are printed with skin-friendly chemicals and are tested for up to 10 washes, no bleeding.
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
                                nam.setAttribute("P","103");
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

