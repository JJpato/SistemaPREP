<%-- 
    Document   : Registro
    Created on : 9/06/2021, 10:20:37 PM
    Author     : Raul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
         <script src="https://kit.fontawesome.com/38fbf1aa31.js" crossorigin="anonymous"></script>
        
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de usuarios</title>
    </head>
    <body>
     <center>
        <h1 class="display-1" class="text-success">nuevo usuario</h1>
    
        <div class="w-50 p-3" class="ratio ratio-16x9" class="shadow p-3 mb-5 bg-body rounded">
        <form action="http://localhost:8080/SistemaPREP/RegistrarUsarios" method="post">
            <input type="text" placeholder="Nombre" name="nombre" class="form-control" id="formGroupExampleInput"><br><br>
            <input type="text" placeholder="Apellidos" name="apellidos" class="form-control" id="formGroupExampleInput"><br><br>
            <input type="text" placeholder="Correo Electronico" name="email"  class="form-control" id="formGroupExampleInput"><br><br>
            <input type="text" placeholder="Contraseña" name="psw"  class="form-control" id="formGroupExampleInput"><br><br>
            <input type="text" placeholder="Edad" name="edad"  class="form-control" id="formGroupExampleInput"><br><br>
            <div align="left">
            Tipo Usuario<br><br>
            administrador           <input type="radio" name="TipoUs" value="1" class="form-check-input"><br><br>
            Capturista         <input type="radio" name="TipoUs" value="2" class="form-check-input"><br>
            </div>
            
                
            <br><br>
            <input type="submit" value="registrar" class="btn btn-outline-success">
        </form>
        </div>
    </center>
    </body>
</html>
