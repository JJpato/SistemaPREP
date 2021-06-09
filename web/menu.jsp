<%-- 
    Document   : Menu
    Created on : 3/06/2021, 05:10:26 PM
    Author     : Raul
--%>

<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession sesion = request.getSession();
    Usuario usu = (Usuario)sesion.getAttribute("usuario");
    String user=usu.getUsu();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="left" style="color: green;" background-color="blue"><%out.print(user);%></div>
    </body>
</html>