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
        /*
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
        */
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

            <section id="details">
                <div id="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>
                                        Registar Votos
                                        <a href="#" class="btn btn-block btn-success" 
                                           data-toggle="modal" data-target="#agregarVotosModal">
                                            <i class="fas fa-plus"></i> Agregar
                                        </a>
                                    </h4>
                                </div>
                                <div class="card-body">
                                    <table class="table table-striped">
                                        <thead class="thead-dark">
                                            <tr>
                                                <th>#</th>
                                                <th>numeroCasilla</th>
                                                <th>tipoCasilla</th> 
                                                <th>entidad</th> 
                                                <th>distrito</th> 
                                                <th>seccional</th> 
                                                <th>votos</th> 
                                                <th>idPartido</th> 
                                            </tr>
                                        </thead>

                                        <tbody>
                                            <!--Iteramos cada elemento de la lista -->
                                            <c:forEach var="votos" items="${votos}">
                                                <tr>
                                                    <td>${votos.getIdVotos()}</td>
                                                    <td>${votos.getNumeroCasilla()}</td> 
                                                    <td>${votos.getTipoCasilla()}</td> 
                                                    <td>${votos.getEntidad()}</td> 
                                                    <td>${votos.getDistrito()}</td> 
                                                    <td>${votos.getSeccional()}</td> 
                                                    <td>${votos.getVotos()}</td> 
                                                    <td>${votos.getIdPartido()}</td> 
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
        </form>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <!-- Modal agregar Partido-->
        <div class="modal fade" id="agregarVotosModal">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header bg-secondary text-white">
                        <h5 class="modal-title">Agregar Votos</h5> 
                        <button class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>

                    <form action="${pageContext.request.contextPath}/Controlador?pagina=Votos&accion=insertar" method="POST" class="was-validated">
                        <div class="modal-body">
                            <div class="form-group">
                                <label for="numcasilla">Numero de casilla</label>
                                <input type="number" class="form-control" name="numcasilla" placeholder="Ingrese numero de casilla" required>
                            </div>
                            <div class="form-group">
                                <label for="selecttipocasilla">Tipo de casilla</label><br>
                                <select class="form-control bg-light" name="tipocasilla" id="selecttipocasilla">
                                    <option>Basica</option>
                                    <option>Contigua</option>
                                    <option>Extraordinaria</option>
                                    <option>Otras</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Entidad</label>
                                <select class="form-control bg-light" name="entidad" id="selecttipocasilla">
                                    <option>Jalisco</option>
                                </select>                            
                            </div>
                            <div class="form-group">
                                <label>Distrito</label>
                                <select class="form-control bg-light" name="distrito" id="selecttipocasilla">
                                    <option>Tonala</option>
                                </select>                            
                            </div>
                            <div class="form-group">
                                <label>Seccional</label>
                                <input type="number" class="form-control" name="seccional" placeholder="Ingrese seccional" required>
                            </div>

                            <div class="container-fluid">
                                <div class="form-group">
                                    <h3>Votos</h3>
                                    <!--Iteramos cada elemento de la lista -->
                                    <c:forEach var="partidos" items="${partidos}">
                                        <div class="row">
                                            <div class="col-md-4">
                                                <label>Id partido</label>
                                                <input type="number" class="form-control" name="idpartido" value="${partidos.getIdPartido()}" required>
                                            </div>
                                            <div class="col-md-4 ml-auto">
                                                ${partidos.getNombrePartido()}
                                                <input type="number" class="form-control" name="todosvotos" value="0" placeholder="Ingrese votos" required>      
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <button class="btn btm-primary bg-primary text-white" type="submit">Guardar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>