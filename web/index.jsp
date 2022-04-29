<%-- 
    Document   : index
    Created on : 10 Apr, 2022, 12:27:32 PM
    Author     : mv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
  
    </head>
    <body>  
        <h1>Hello <% request.getSession().getAttribute("username"); %></h1>
        <form action="LoginCheck" method="POST">
            <input type="text" placeholder="Email or UserID" name="username"/>
            <input type="password" placeholder="Password" name="password"/>
            
            <input type="submit" value="Login"/>
            
        </form>
        
        <form action="Logout">
            <input value="Logout" type="submit"/>
            
        </form>
    </body>
</html>-->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        * {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}

html {
  font-size: 62.5%;
  /* overflow-x: hidden; */
}

body {
  background-color: rgba(255, 255, 255, 0.523);
  height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
}

.login-page {
  width: 40rem;
  padding: 2rem;
  margin: auto;
}

.login-container {
  position: relative;
  font-size: 1.8rem;
  padding: 4rem;
  max-width: 36rem;
  display: flex;
  justify-content: center;
  margin-top: 4rem;
  margin-bottom: 4rem;
  border: solid 1px #333;
  background-color: #fff;
}

.username-info input,
.password-info input {
  display: block;
  font-size: 1.6rem;
  padding: 1rem 2rem 1rem 0.5rem;
  margin: 0 5rem 1.5rem 0;
  width: 100%;
  color: #444;
  background-color: #eee;
  border: solid 1px #aaa;
  border-radius: 5px; 
}

.login-btn {
  text-align: center;
  border: solid 1px #aaa;
  border-radius: 5px;
  padding: 1rem;
  margin-bottom: 1.5rem;
  background-color: #228be6;
  color: #fff;
  cursor: pointer;
}

.login-btn:hover {
  background-color: #4ea2eb;
}

.forgot-text {
  display: block;
  font-size: 1.4rem;
  text-align: center;
  color: #0e385c;
  text-decoration: none;
}

.forgot-text:hover {
  text-decoration: underline;
}

.sign-up-container {
  background-color: #fff;
  font-size: 1.8rem;
  display: flex;
  justify-content: center;
  border: solid 1px #333;
  padding: 2rem;
}

.sign-up-text {
  text-decoration: none;
  color: #228be6;
  font-weight: bold;
}

.sign-up-text:hover {
  text-decoration: underline;
}

    </style>
</head>
<body>
    <div class="login-page">
        <div class="login-container">
            <form class="login-form" action="LoginCheck" method="post">
            <div class="username-info">
              <label for="username">
                <input
                  id="username"
                  type="text"
                  placeholder="Username"
                  name="username"
                  required
                />
              </label>
            </div>
            <div class="password-info">
              <label for="password">
                <input
                  id="password"
                  type="password"
                  placeholder="Password"
                  name="password"
                  required
                />
              </label>
            </div>
            <!--<div class="login-btn">Login</div>-->
            <center>
            <input type="submit" value="Login" class="login-btn">
            </center>
            <!--<a class="forgot-text" href="#">Forgot password?</a>-->
          </form>
        </div>
  
        <!-- <div class="sign-up-container" hidden>
          <div class="new-user">
            First time here? <a class="sign-up-text" href="#">Sign up</a>
          </div>
        </div> -->
      </div>
</body>
</html>
