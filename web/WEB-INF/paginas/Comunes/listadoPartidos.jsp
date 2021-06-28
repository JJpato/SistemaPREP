
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section id="partidos">
    <div class="container">
        <div class="row">
            <div class="col-md-12"> 
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Partidos 
                            <a href="#" class="btn btn-block btn-success" 
                               data-toggle="modal" data-target="#agregarPartidoModal">
                                <i class="fas fa-plus"></i> Agregar
                            </a>
                        </h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Alcance</th> 
                                <th>Acciones</th> 
                            </tr>
                        </thead>
                        <tbody>
                            <!--Iteramos cada elemento de la lista -->
                            <c:forEach var="partidos" items="${partidos}">
                                <tr>
                                    <td>${partidos.getIdPartido()}</td>
                                    <td>${partidos.getNombrePartido()}</td> 
                                    <td>${partidos.getAlcance()}</td> 
                                    <td>
                                        <a href="${pageContext.request.contextPath}/Controlador?pagina=Partidos&accion=editar&nc=${partidos.getIdPartido()}"
                                           class="btn btn-primary btn-block" >
                                            <i class="fas fa-angle-double-right"></i>Editar
                                        </a>
                                        <a href="${pageContext.request.contextPath}/Controlador?pagina=Partidos&accion=eliminar&nc=${partidos.getIdPartido()}" 
                                           class="btn btn-secondary btn-block">
                                            <i class="fas fa-trash"></i> Eliminar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Modal agregar Partido-->
<div class="modal fade" id="agregarPartidoModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-secondary text-white">
                <h5 class="modal-title">Agregar Partido</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/Controlador?pagina=Partidos&accion=insertar" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="id">Id</label>
                        <input type="number" class="form-control" name="id" placeholder="Ingrese Id" required>
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" placeholder="Ingrese nombre de partido" required>
                    </div>
                    <div class="form-group">
                        <label for="alc">Alcance</label><br>
                        <select class="form-control bg-light" name="alcance" id="alc">
                            <option>Nacional</option>
                            <option>Local</option>
                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btm-primary bg-primary text-white" type="submit">Guardar</button>
                </div>
            </form>
        </div>
    </div>
</div>
