<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
</head>
<body>
<%@ include file="header.jsp" %>
<%@ include file="navbar.jsp" %>
<div class="container" style="margin-top: 30px; margin-bottom: 180px;">
    <div class="col-md-4">
        <div class="login-panel panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title" align="center">Sign In</h3>
            </div>
            <div class="panel-body">
                <form name="loginForm"
                      action="login" method="post">
                    <fieldset>
                        <div class="form-group">
                            <input class="form-control" placeholder="E-mail"
                                   name="username" type="email">
                        </div>
                        <div class="form-group">
                            <input class="form-control" placeholder="Password"
                                   name="password" type="password">
                        </div>
                        <!-- Change this to a button or input when using this as a form -->
                        <div id="button">
                            <button type="submit" class="btn btn-sm btn-success"
                                    style="margin-right: 79px; margin-left: 60px">Login
                            </button>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>