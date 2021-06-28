<%-- 
    Document   : RecuperarPassword
    Created on : Jun 25, 2021, 12:45:19 PM
    Author     : Poust
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/38fbf1aa31.js" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    <center>
        <div class="w-50 p-3" class="ratio ratio-16x9" class="shadow p-3 mb-5 bg-body rounded">
            <form action="${pageContext.request.contextPath}/RecuperarContrasena"  method="POST">
                <hr><center><h1 class="display-1" class="text-success">Recuperar contraseña</h1><hr>
                    <input class="form-control" id="formGroupExampleInput" type="text" name="Mail" required value placeholder="Ingrese su E-mail"><br><br>

                    <button type="submit" class="btn btn-outline-success" name="btE">Recuperar contraseña</button>

                </center>

            </form>
        </div>
    </center>    


</body>
</html>
