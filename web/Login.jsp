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
        <script src="https://kit.fontawesome.com/38fbf1aa31.js" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>

    <center>
        <div class="w-50 p-3" class="ratio ratio-16x9" class="shadow p-3 mb-5 bg-body rounded">
            <form action="${pageContext.request.contextPath}/Login"  method="post" class="was-validated">
                <center><h1 class="display-1" class="text-success">Sistema PREP</h1>
                    <br><br>
                    <input class="form-control form-control-lg" id="formGroupExampleInput" type="email" pattern="^[a-zA-Z0-9@.!#$%&’*+/=?^_`~-]{8,100}" name="Usu" placeholder="Usuario" required><br>
                    <input class="form-control form-control-lg" id="formGroupExampleInput" type="password" pattern="[A-Za-z0-9!?-._-;@$%&/()=?¡¿]{5,12}" name="Pswd" placeholder="Contraseña" required><br>

                    <button type="submit" class="btn bg-success btn-lg text-white" name="btE">Iniciar Sesion</button><br><br>
                    <div>
                        <a href="${pageContext.request.contextPath}/Registro.jsp" class="btn btn-outline-success btn-sm"><i class="fas fa-user-plus" title="Crear cuenta"></i>Registrarme</a><br>
                        <a href="${pageContext.request.contextPath}/RecuperarPassword.jsp" class="btn btn-outline-success btn-sm"><i class="fas fa-unlock-alt" title="Recuperar contraseña"></i>¿Olvidaste tu contraseña?</a><br><br>
                    </div>
                    
                    <div class="alert alert-warning alert-dismissible fade show" role="alert">
                        ${mensaje}
                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                        <%
                            HttpSession sesion = request.getSession();
                            session.invalidate();
                        %>
                    </div>
                </center>
            </form>
        </div>
    </center>    



</body>
</html>
