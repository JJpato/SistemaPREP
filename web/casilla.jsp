<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votos</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    </head>
    <body>
        <!--Cabecero -->
        <jsp:include page="/WEB-INF/paginas/Comunes/cabecero.jsp"/>
        <br>
        <section id="casillas">
            <div class="container">
                <div class="row">
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header">
                                <h4>Casilla</h4>
                            </div>
                            <form action="${pageContext.request.contextPath}/Controlador?pagina=Votos" method="POST" class="was-validated">
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
                                    <input type="text" class="form-control" name="entidad" placeholder="Ingrese entidad" required>
                                </div>
                                <div class="form-group">
                                    <label>Distrito</label>
                                    <input type="text" class="form-control" name="entidad" placeholder="Ingrese distrito" required>
                                </div>
                                <div class="form-group">
                                    <label>Seccional</label>
                                    <input type="number" class="form-control" name="entidad" placeholder="Ingrese seccional" required>
                                </div>
                                <section id="actions" class="py-3 mb-4 bg-light">
                                    <div class="container">
                                        <div class="row">
                                            <div class="col-md-9">
                                                <a href="Inicio.jsp" class="btn btn-secondary btn-block">
                                                    Cancelar
                                                </a>
                                            </div>
                                            <div class="col-md-3">
                                                <button type="submit" class="btn btn-success btn-block">
                                                    <i class="fas fa-check"></i> Siguiente
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </section>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>


    </body>
</html>
