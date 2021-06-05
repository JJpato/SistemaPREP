
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
                                <th>Descripcion</th>            
                            </tr>
                        </thead>
                        <tbody>
                            <!--Iteramos cada elemento de la lista -->
                            <c:forEach var="partidos" items="${partidos}">
                                <tr>
                                    <td>${partidos.getIdPartido()}</td>
                                    <td>${partidos.getNombrePartido()}</td> 
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
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar Partido</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/Controlador?pagina=Partidos&accion=insertar" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="id">Id</label>
                        <input type="text" class="form-control" name="id" required>
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" required>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btm-primary bg-info text-white" type="submit">Guardar</button>
                </div>
            </form>
        </div>
    </div>
</div>
