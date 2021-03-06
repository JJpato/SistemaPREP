/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDao.UsuariosDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luism
 */
public class RegistrarUsarios extends HttpServlet {

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
            out.println("<title>Servlet RegistrarUsarios</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrarUsarios at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
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
        //processRequest(request, response);
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellidos");
        String edad = request.getParameter("edad");
        String correo = request.getParameter("email");
        String contrasena = request.getParameter("psw");
        String tel = request.getParameter("telefono");
        String tipoUs = request.getParameter("TipoUs");
        String estado = request.getParameter("estado");
        String municipio = request.getParameter("municipio");
        String calleNum = request.getParameter("calleNumero");
        String CoP = request.getParameter("cp");
        int ubi = Integer.parseInt(request.getParameter("ubicacion"));
        //int idu=Integer.parseInt(request.getParameter("id"));

        UsuariosDao us = new UsuariosDao();
        String mess = us.crearUsu(nombre, apellido, correo, contrasena, edad, tel, tipoUs, estado, municipio, calleNum, CoP, ubi);
        HttpSession sesion = request.getSession();

        if (mess != null) {
            sesion.setAttribute("mensaje", "Usuario creado exitosamente");
            response.sendRedirect("Login.jsp");
        } else {
            sesion.setAttribute("mensaje", "Error al crear usuario");
            response.sendRedirect("Login.jsp");
        }
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
