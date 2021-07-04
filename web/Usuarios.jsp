<%-- 
    Document   : Usuarios
    Created on : 28/06/2021, 10:07:56 PM
    Author     : luism
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Modelo.Usuario"%>

<%

    HttpSession sesion = request.getSession();
    Usuario us = (Usuario) sesion.getAttribute("usuario");
    if (us.getTipous().equals("2")) {
        sesion.setAttribute("mensaje", "No puedes entrar");
        response.sendRedirect("Login.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitudes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/2d928f5038.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <!--Cabecero -->
        <jsp:include page="/WEB-INF/paginas/Comunes/cabecero.jsp"/>
        <!--Menu -->
        <jsp:include page="/menu.jsp"/>


        <section id="details">
            <div id="container">
                <div class="row">
                    <div class="col">
                        <div class="card">
                            <div class="card-header">
                                <h4>
                                    Usuarios
                                </h4>
                            </div>
                            <div class="card-body">
                                <table class="table table-striped">
                                    <thead class="thead-dark">
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre</th>
                                            <th>apellido</th> 
                                            <th>correo</th> 
                                            <th>estatus</th> 
                                            <th>edad</th> 
                                            <th>nivel</th> 
                                            <th>telefono</th> 
                                            <th>Ubicacion</th> 

                                        </tr>
                                    </thead>

                                    <tbody>
                                        <!--Iteramos cada elemento de la lista -->
                                        <c:forEach var="Usuarios" items="${Usuarios}">
                                            <tr>
                                                <td>${Usuarios.getId()}</td>
                                                <td>${Usuarios.getNombre()}</td> 
                                                <td>${Usuarios.getApellido()}</td> 
                                                <td>${Usuarios.getUsu()}</td> 
                                                <td>${Usuarios.getEstatus()}</td> 
                                                <td>${Usuarios.getPwsd()}</td> 
                                                <td>${Usuarios.getTipous()}</td> 
                                                <td>${Usuarios.getTelefono()}</td>
                                                <td>${Usuarios.getUbicacion()}</td>
                                                <td><c:if test = "${Usuarios.getEstatus()<1}">
                                                        <a href="${pageContext.request.contextPath}/ActivarUsuario?nc=${Usuarios.getId()}" 
                                                           class="btn btn-secondary btn-block">
                                                            <i class="fas fa-user-check"></i> Activar
                                                        </a>
                                                    </c:if></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>        
    </body>
</html>
