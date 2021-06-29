<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Modelo.Usuario"%>

<%

    HttpSession sesion = request.getSession();
    Usuario us = (Usuario) sesion.getAttribute("usuario");
    if (us == null) {
        response.sendRedirect("Login.jsp");
    }
%>

<!--Botones de menu -->
<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">
                            <c:if test = "${usuario.getTipous().equals('1')}">
                                <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Controlador?pagina=Partidos"><h4>
                                        <i class="fas fa-book-open"></i>Registrar Partido</h4>
                                </a>
                            </c:if>
                            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Controlador?pagina=Votos">
                                <h4><i class="fas fa-box-tissue"></i>Votos</h4>
                            </a>
                            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Resultado">
                                <h4><i class="fas fa-columns"></i>Resultados</h4>
                            </a>
                            <c:if test = "${usuario.getTipous().equals('1')}">
                                <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Controlador?pagina=Usuarios">
                                    <h4><i class="fas fa-child"></i>Usuarios</h4> 
                                </a>  
                            </c:if>

                            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Cerrar">
                                <h4><i class="fas fa-sign-out-alt" title="cerrar sesion">Salir</i> </h4> 
                            </a>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
    </div>
</section>    