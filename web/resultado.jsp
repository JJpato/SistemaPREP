<%-- 
    Document   : resultado
    Created on : 17/06/2021, 11:31:27 AM
    Author     : Raul
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/38fbf1aa31.js" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <!--Cabecero -->
        <jsp:include page="/WEB-INF/paginas/Comunes/cabecero.jsp"/>
        <jsp:include page="/menu.jsp"/>
        
        <section id="partidos">
            <div class="container">
                <div class="row">
                    <div class="col-md-8"> 
                        <div class="card">
                            <div class="card-header text-white" style="background-color:rgb(184, 134, 11);">
                                <h4>Resultado de Votaciones           Federal
                                </h4>
                            </div>
                            <table class="table table-striped">
                                <thead class="thead-dark">
                                    <tr>
                                        <th>PARTIDOS</th>
                                        <th>VOTOS</th> 
                                        <th>ALCANCE</th> 
                                    </tr>
                                </thead>
                                <tbody>
                                    <!--Iteramos cada elemento de la lista -->
                                    <c:forEach var="Consul" items="${Consul}">
                                        <tr>
                                            <td>${Consul.getPartido()}</td>
                                            <td>${Consul.getVotos()}</td> 
                                            <td>${Consul.getAlcance()}</td> 
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <br>
        <br>
        <br>
        
        
        <section id="partidoss">
            <div class="container">
                <div class="row">
                    <div class="col-md-8"> 
                        <div class="card">
                            <div class="card-header text-white" style="background-color:rgb(169, 169, 169);">
                                <h4>Resultado de Votaciones             Municipal
                                </h4>
                            </div>
                            <table class="table table-striped">
                                <thead class="thead-dark">
                                    <tr>
                                        <th>PARTIDOS</th>
                                        <th>VOTOS</th> 
                                        <th>ALCANCE</th> 
                                    </tr>
                                </thead>
                                <tbody>
                                    <!--Iteramos cada elemento de la lista -->
                                    <c:forEach var="ConsulM" items="${ConsulM}">
                                        <tr>
                                            <td>${ConsulM.getPartido()}</td>
                                            <td>${ConsulM.getVotos()}</td> 
                                            <td>${ConsulM.getAlcance()}</td> 
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <br>
        <br>
        <br>
        
        
        <section id="partidosss">
            <div class="container">
                <div class="row">
                    <div class="col-md-8"> 
                        <div class="card">
                            <div class="card-header text-white" style="background-color:rgb(233, 150, 122);">
                                <h4>Resultado de Votaciones              Local
                                </h4>
                            </div>
                            <table class="table table-striped">
                                <thead class="thead-dark">
                                    <tr>
                                        <th>PARTIDOS</th>
                                        <th>VOTOS</th> 
                                        <th>ALCANCE</th> 
                                    </tr>
                                </thead>
                                <tbody>
                                    <!--Iteramos cada elemento de la lista -->
                                    <c:forEach var="ConsulL" items="${ConsulL}">
                                        <tr>
                                            <td>${ConsulL.getPartido()}</td>
                                            <td>${ConsulL.getVotos()}</td> 
                                            <td>${ConsulL.getAlcance()}</td> 
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
