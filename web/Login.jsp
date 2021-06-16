<%-- 
    Document   : Login
    Created on : 27/05/2021, 03:22:01 PM
    Author     : luism
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
         

         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    <center>
        <div class="w-50 p-3" class="ratio ratio-16x9" class="shadow p-3 mb-5 bg-body rounded">
        <form action="http://localhost:8080/SistemaPREP/Login" method="post">
            <hr><center><h1 class="display-1" class="text-success">Sistema PREP</h1><hr>
        <input class="form-control" id="formGroupExampleInput" type="text" name="Usu" required value placeholder="Usuario"><br><br>
        <input class="form-control" id="formGroupExampleInput" type="password" name="Pswd" required value placeholder="contraseña"><br><br>
        
        <button type="submit" class="btn btn-outline-success" name="btE">Iniciar Sesion</button>
        <hr>¿No estas registrado? <a href="http://localhost:8080/SistemaPREP/Registro.jsp" class="link-success">pulsa aqui</a></hr><br>
        <hr>¿perdiste tu contraseña? <a href="" class="link-success">pulsa aqui</a></hr>
        </center>
    
        </form>
        </div>
         </center>    
            
        
    </body>
</html>
