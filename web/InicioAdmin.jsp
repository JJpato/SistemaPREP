<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/2d928f5038.js" crossorigin="anonymous"></script>  
        
    </head>
    <body>
        <%
        HttpSession sesion=request.getSession();
        Usuario us=(Usuario)sesion.getAttribute("usuario");
        if(us==null){
        request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
        else{
        String nom=us.getNombre();
        %>
        <!--Cabecero -->
        <jsp:include page="/WEB-INF/paginas/Comunes/cabecero.jsp"/>

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
                                        <a class="nav-item nav-link">
                                            <h4><i class="fas fa-address-book"></i></h4>
                                        </a>
                                        
                                        
                                        
                                        <a class="nav-item nav-link" href="http://localhost:8080/SistemaPREP/Cerrar">
                                            <h4><i class="fas fa-sign-out-alt" title="cerrar sesion"></i> </h4> 
                                        </a>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </section>                    

    </body>
</html>
<%}%>