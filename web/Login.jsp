<%-- 
    Document   : Login
    Created on : 27/05/2021, 03:22:01 PM
    Author     : luism
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div>
        <form action="http://localhost:8080/SistemaPREP/Login" method="post">
    <hr><center>Inicio de sesión<hr>
        usuario:    <input type="text" name="Usu" required value><br><br>
        contraseña: <input type="password" name="Pswd" required value><br><br>
        <input type="submit" value="Iniciar sesión" name="btE">
        <hr>¿No estas registrado? <a href="">pulsa aqui</a></hr><br>
        <hr>¿perdiste tu contraseña? <a href="">pulsa aqui</a></hr>
        </center>
        </form>
            
            
        
    </body>
</html>
