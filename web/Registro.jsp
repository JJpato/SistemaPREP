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
        <h1 class="display-1" class="text-success">Nuevo usuario</h1>
        <div class="w-50 p-3" class="ratio ratio-16x9" class="shadow p-3 mb-5 bg-body rounded">
            <form action="${pageContext.request.contextPath}/RegistrarUsarios" method="post" class="was-validated">

                <input type="text" placeholder="Nombre" name="nombre"  class="form-control" id="formGroupExampleInput" required><br><br>
                <input type="text" placeholder="Apellidos" name="apellidos"  class="form-control" id="formGroupExampleInput" required><br><br>
                <input type="number" placeholder="Edad" name="edad" class="form-control"  id="formGroupExampleInput" required><br><br>
                <input type="email" placeholder="Correo Electronico" name="email" pattern="^[a-zA-Z0-9@.!#$%&’*+/=?^_`~-]{8,100}" class="form-control" id="formGroupExampleInput" required><br><br>
                <input type="password" placeholder="Contraseña" name="psw" pattern="[A-Za-z0-9!?-._]{5,12}" class="form-control" id="formGroupExampleInput" type1="password" required><br><br>
                <input type="tel" placeholder="Telefono" name="telefono"  pattern="[0-9]{8,12}" class="form-control" id="formGroupExampleInput" required><br><br>
                <input type="number" placeholder="Numero de ubicacion" pattern="^[0-9]+" name="ubicacion"  class="form-control" id="formGroupExampleInput" required><br><br>
                <input type="text" placeholder="Estado" name="estado" class="form-control" id="formGroupExampleInput" required><br><br>
                <input type="text" placeholder="Municipio" name="municipio"  class="form-control" id="formGroupExampleInput"required><br><br>
                <input type="text" placeholder="Calle y Numero" name="calleNumero"  class="form-control" id="formGroupExampleInput" required><br><br>
                <input type="number" placeholder="Codigo postal" name="cp" pattern="^[0-9]+{1,5}" class="form-control" id="formGroupExampleInput" required><br><br>
                <div align="left">
                    Tipo Usuario<br><br>
                    - Administrador           <input type="radio" name="TipoUs" value="1" class="form-check-input" required value><br><br>
                    - Capturista         <input type="radio" name="TipoUs" value="2" class="form-check-input" required value><br>
                </div>
                <br><br>
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <a href="${pageContext.request.contextPath}/Login.jsp" class="btn btn-secondary form-control btn-block">Regresar</a>
                        </div>
                        <div class="col">
                            <button id="btnSubmit" class="btn btn-success form-control btn-block" type="submit">Registrarme</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </center>
</body>
</html>
