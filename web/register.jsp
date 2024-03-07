<%-- 
    Document   : register
    Created on : 8 Apr, 2021, 12:22:32 PM
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
            <a href="login.jsp">Login/Signup</a>
        </p>
        <table width="100%">
            <tr>
                <td width="220px">
                    <a href="home.html" title="Roaming Beats">
                        <img src="pictures/logo.jpg" height="180px" width="220px" style="border-radius: 25px;">
                    </a>
                </td>
                <td>
                    <p align="center"><font size="10">Roaming Beats Merchandise Sale</font></p>
                </td>
            </tr>
        </table>
        <br>
        <form action="insertdata.jsp" method="post">
            <center>
                <fieldset>
                <legend><font size="5">Create Account</font></legend><br>
                <table>
                    <tr>
                        <td>
                            Name: 
                        </td>
                        <td>
                            <input type="text" name="txtName" placeholder="Enter Name" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Address: 
                        </td>
                        <td>
                            <textarea name="txtAdd" placeholder="Enter your Full Address" cols="25" rows="3" required></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Mobile No.: 
                        </td>
                        <td>
                            <input type="text" name="txtMobile" pattern="^[789]\d{9}$"  placeholder="Enter Mobile No." title="Mobile number should start from 7/8/9" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Email Id: 
                        </td>
                        <td>
                            <input type="email" name="txtEmail" placeholder="Enter Email ID" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Enter UserName: 
                        </td>
                        <td>
                            <input type="text" name="txtUser" placeholder="Enter UserName" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Enter Password: 
                        </td>
                        <td>
                            <input type="password" name="txtPass" placeholder="Enter Password" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Register">
                        </td>
                        <td>
                            <input type="reset">
                        </td>
                    </tr>
                </table><br>
                <p>Already have an Account? <a href="login.jsp">Login Here</a></p>
            </fieldset>
            </center>
        </form>
    </body>
</html>
