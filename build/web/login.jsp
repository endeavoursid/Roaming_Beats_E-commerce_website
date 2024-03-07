<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>T-Shirt - Roaming beats</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="newcss.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;600;700&display=swap"
              rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
    </head>
     
    <body>
           
        <div class="container"><div class="navbar">
            <div class="logo">
                <img src="pictures/logo2.png" width="125">
            </div>
            <nav>
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="allproduct.html">Products</a></li>
                    <li><a href="">About</a></li>
                    <li><a href="">Contact</a></li>
                    <li><a href="login.jsp">Account</a></li>
                </ul>
            </nav>
                <img src="pictures/cart.png" width='30' height='30'> 
            </div>
           
        </div>
       <!----account page----->
       <div class="account-page">
           <div class="container">
               <div class="row">
                   <div class="col-2">
                       <img src="pictures/model.png" width="100%">
                   </div>
                   <div class="col-2">
                       <div class="form-container">
                           <div class="form-btn">
                               <span>Login</span>
                           </div>
                           <form method="post" action="welcome">
                               <input type="text" placeholder="E-mail" name="username">
                               <input type="password" placeholder="password" name="password">
                               <button type="submit" class="btn">Login</button>
                               <a href="forgetpassword.html">Forget password</a><br><br>
                        <a href="signup.html">Sign up</a>
                           </form>
                       </div>
                   </div>
               </div>
           </div>
       </div>
        <div class='footer'>
            <div class='container'>
                        <div class='row'><div class='footer-col-1'>
                                <h3>Download Our App</h3>
                                <p>Download App for Android and ios.</p>
                                <div class='app-logo'>
                                    <img src='pictures/playstore.png'>
                                    <img src='pictures/appstore.jpg'>
                                </div>
                    </div>
                            <div class='footer-col-2'>
                                <img src='pictures/logo2.png'>
                                <p>Our purpose is to sustainably make the pleasure and benefits of
                                    high quality clothes accessible to the many.</p>
                            </div>
                            <div class='footer-col-3'>
                                <h3>Useful Links</h3>
                                <ul>
                                    <li>Coupons</li>
                                    <li>Blog Post</li>
                                    <li>Return Policy</li>
                                    <li>Join Affiliate</li>
                                </ul>
                            </div>
                             <div class='footer-col-4'>
                                 <h3>Follow us</h3>
                                <ul>
                                    <li>Facebook</li>
                                    <li>Twitter</li>
                                    <li>Instagram</li>
                                    <li>Youtube</li>
                                </ul>
                            </div>
            </div>
                <hr>
                <p class='copyright'>Copyright 2023 - P se project</p>
            </div>
        </div>
        </body>
</html>
