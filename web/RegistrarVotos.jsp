<%-- 
    Document   : RegistrarVotos
    Created on : 15/06/2021, 11:28:47 PM
    Author     : Hacker777
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style type ="text/css">
        table{
            font-family: sans-serif;
            border: 14px solid gray;
            max-width: 700px;
            margin: auto;
            
            height: 60vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
  
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registar voto</title>
                <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/2d928f5038.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <!--Cabecero -->
        <jsp:include page="/WEB-INF/paginas/Comunes/cabeceroVotos.jsp"/>
        
        <form action="${pageContext.request.contextPath}/ControladorV?accion=modificar" method="GET" class="was-validated">
            <jsp:include page="/WEB-INF/paginas/Comunes/botonesNavegacionRegistroPartido.jsp"/>

            <section id="details">
                <div id="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Registar Votos</h4>
                                </div>
                                <div class="card-body">
                                     <table border="1">
                                    <c:forEach var="partido" items="${partido}">
                                        <th> ID </th>
                                        <th> Alcance </th>
                                        <th> Nombre </th>
                                                                                                                                                             
                                        <tr> 
                                            <td><c:out value="${partido.getIdPartido()}"/></td> <label for="nombre"> -- </label>
                                      
                                            <td><c:out value="${partido.getAlcance()}"/></td> <label for="nombre"> -- </label>
                                            <td><c:out value="${partido.getNombrePartido()}"/><label for="nombre"> -- </label> <input name="nombre" placeholder="Ingrese votos" value="${votaciones.getNumeroDeVotos()}" >
                                            </td>
                                            <br>

                                        </tr>
                                            
                                    </c:forEach>
                                        
                                      </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </form>
                                    
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>