<%-- 
    Document   : Login
    Created on : Apr 11, 2023, 8:48:30 PM
    Author     : seoao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>FPT University Academic Portal</title>
        <!-- CSS Bootstrap 5 -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.2.3/css/bootstrap.min.css"/>
        

    </head>

    <body>
        <div class="col-md-12 d-flex justify-content-center">
            <div class="col-md-6 mt-5">
                <form action="login" method="post">
                    <h2>FPT University Academic Portal</h2>
                    <div class="mt-3">${message}</div>
                    <div class="form-group mt-5">
                        <label>Email:</label>
                        <input type="email" name="email" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Password:</label>
                        <input type="password" name="password" class="form-control">
                    </div>
                    <input type="submit" value="LOGIN" class="form-control mt-5 btn btn-primary">
                </form>
            </div>
        </div>
    </body>
</html>
