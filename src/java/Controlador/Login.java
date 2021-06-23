/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ModeloDao.UsuariosDao;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        processRequest(request, response);

        
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
        PrintWriter out = response.getWriter();
        String user;
              String ps;
              String a;
           if(request.getParameter("btE")!= null){
                user= request.getParameter("Usu");
                ps= request.getParameter("Pswd");
                UsuariosDao UDAO = new UsuariosDao();
                a=UDAO.log(user, ps);
                out.print(a);
                if(UDAO.access){
                Usuario usu = new Usuario(user,ps);
                HttpSession session = request.getSession();
                session.setAttribute("usuario", usu);
                request.getRequestDispatcher("Inicio.jsp").forward(request, response);
                 /*HttpSession session = request.getSession();
                 session.setAttribute("usuario", usu);   
                 request.getRequestDispatcher("http://localhost:8080/SistemaPREP/Inicio.jsp").forward(request, response);*/
                    //response.sendRedirect("Inicio.jsp");
                }
                else{response.sendRedirect("http://localhost:8080/SistemaPREP/Login.jsp");                    
                }
           }
                
    }   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
