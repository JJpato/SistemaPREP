package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ModeloDao.PartidosDAO;
import Modelo.Partidos;
import Modelo.Usuario;
import ModeloDao.UsuariosDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JJ
 */
@WebServlet(urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = request.getParameter("pagina");

        if (pagina != null) {
            switch (pagina) {
                case "Partidos":
                    Partidos(request, response);
                    break;
                case "Usuarios":
                    //Usuarios(request, response);
                    break;
                default:
                    response.sendRedirect("Inicio.jsp");
            }
        } else {
            response.sendRedirect("Inicio.jsp");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina = request.getParameter("pagina");

        if (pagina != null) {
            switch (pagina) {
                case "Partidos":
                    Partidos(request, response);
                    break;
                case "Usuarios":
                    //Usuarios(request, response);
                    break;
                default:
                    response.sendRedirect("Inicio.jsp");
            }
        } else {
            response.sendRedirect("Inicio.jsp");
        }
    }

    protected void Partidos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    insertarPartido(request, response);
                    break;
                case "editar":
                    editarPartido(request, response);
                    break;
                case "modificar":
                    actualizarPartido(request, response);
                    break;
                case "eliminar":
                    eliminarPartidos(request, response);
                    break;
                default:
                    listarPartidos(request, response);
            }
        } else {
            listarPartidos(request, response);
        }
    }

    protected void listarPartidos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        PartidosDAO dao = new PartidosDAO();

        List<Partidos> partidos = dao.listar();
        sesion.setAttribute("partidos", partidos);

        response.sendRedirect("RegistrarPartido.jsp");
    }

    private void insertarPartido(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nc = request.getParameter("id");
        String nombre = request.getParameter("nombre");

        Partidos partido = new Partidos(Integer.parseInt(nc), nombre);

        PartidosDAO dao = new PartidosDAO();

        dao.insertar(partido);

        //redirigimos
        listarPartidos(request, response);
    }

    private void editarPartido(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperra el id
        int id = Integer.parseInt(request.getParameter("nc"));

        //recuperar datos de la base de datos
        PartidosDAO dao = new PartidosDAO();
        Partidos partido = dao.encontrar(id);

        request.setAttribute("partido", partido);
        String jspEditar = "/WEB-INF/paginas/editar/editarPartido.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }

    private void actualizarPartido(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nc = request.getParameter("nc");
        String nombre = request.getParameter("nombre");

        Partidos partido = new Partidos(Integer.parseInt(nc), nombre);

        PartidosDAO dao = new PartidosDAO();

        int registrosModificados = dao.actualizar(partido);

        System.out.println("registros modificados = " + registrosModificados);

        //redirigimos
        listarPartidos(request, response);
    }

    private void eliminarPartidos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //recuperra el id 
        int id = Integer.parseInt(request.getParameter("nc"));

        PartidosDAO dao = new PartidosDAO();
        int registrosModificados = dao.eliminar(id);

        System.out.println("registros eliminados = " + registrosModificados);

        listarPartidos(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
