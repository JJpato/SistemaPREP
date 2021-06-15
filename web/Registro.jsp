<%-- 
    Document   : Registro
    Created on : 9/06/2021, 10:20:37 PM
    Author     : Raul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de usuarios</title>
    </head>
    <body>
     <center>
        <h1>nuevo usuario</h1>
    
        <div>
        <form action="http://localhost:8080/SistemaPREP/RegistrarUsarios" method="post">
            <input type="text" placeholder="Nombre"><br><br>
            <input type="text" placeholder="Apellidos"><br><br>
            <input type="text" placeholder="Correo Electronico"><br><br>
            <input type="text" placeholder="Contraseña"><br><br>
            <input type="text" placeholder="Domicilio"><br><br>
            <input type="text" placeholder="Edad"><br><br>
            <input type="submit" value="registrar">
        </form>
        </div>
    </center>
    </body>
</html>
