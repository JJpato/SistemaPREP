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
        <form action="${pageContext.request.contextPath}/Controlador?pagina=Votos" method="POST" class="was-validated">
            <section id="details">
                <div id="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Votos</h4>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label for="selecttipocasilla">Tipo de casilla</label>
                                        <select class="form-control" name="tipocasilla" id="selecttipocasilla">
                                            <option>Basica</option>
                                            <option>Contigua</option>
                                            <option>Extraordianria</option>
                                            <option>Otras</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>Entidad</label>
                                        <input type="text" class="form-control" name="entidad" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Distrito</label>
                                        <input type="text" class="form-control" name="entidad" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Seccional</label>
                                        <input type="text" class="form-control" name="entidad" required>
                                    </div>
                                    <label>Lista partidos</label>
                                    <!--Iteramos cada elemento de la lista -->
                                    <c:forEach var="partidos" items="${partidos}">
                                        <div class="form-group">
                                            <label>${partidos.getNombrePartido()}</label>
                                            <input type="number" class="form-control" name="partidosVotos" placeholder="Introduce votos" required>
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <jsp:include page="/WEB-INF/paginas/Comunes/botonesNavegacionRegistroPartido.jsp"/>
        </form>
    </body>
</html>
