<%@page import="Modelo.Usuario"%>

<%

    HttpSession sesion = request.getSession();
    Usuario us = (Usuario) sesion.getAttribute("usuario");
    if (us == null) {
        response.sendRedirect("Login.jsp");
    } else {
        String nom = us.getNombre();
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
                            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Controlador?pagina=Partidos"><h4>
                                    <i class="fas fa-book-open"></i>Registrar Partido</h4></a>
                            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Controlador?pagina=Votos">
                                <h4><i class="fas fa-box-tissue"></i>Votos</h4>
                            </a>
                            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Resultado">
                                <h4></i>Resultados</h4>
                            </a>
                            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/Cerrar">
                                <h4><i class="fas fa-sign-out-alt" title="cerrar sesion"></i> </h4> 
                            </a>

                        </div>
                    </div>
                </nav>
            </div>
        </div>
    </div>
</section>    