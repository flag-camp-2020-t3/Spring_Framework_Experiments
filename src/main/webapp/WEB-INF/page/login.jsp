<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <script src="<c:url value="/resource/js/jquery.js"/>"></script>
    <script src="<c:url value="/resource/js/angular.min.js"/>"></script>
    <script src="<c:url value="/resource/js/homePageController.js"/>"></script>
</head>
<body>
<%@ include file="header.jsp" %>
<%@ include file="navbar.jsp" %>
<div ng-app="myapp" ng-controller="homePageController" class="container" style="margin-top: 30px; margin-bottom: 180px;">
   <h1>Login</h1>
   <table>
         <tr>
            <td>Username:</td>
            <td><input type='text' name='username' value=''></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
         </tr>
         <tr>
            <td><a href="#" ng-click="getInfo(1)">Submit</a></td>
         </tr>
      </table>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>