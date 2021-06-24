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
              String user=request.getParameter("Usu");
              String ps=request.getParameter("Pswd");
              String a;
              int Nivel;
              UsuariosDao UDAO = new UsuariosDao();
              int status;
               Nivel=Integer.parseInt(UDAO.DNivel(user));
               status=UDAO.Dstatus(user);
           if(request.getParameter("btE")!= null){
                if(UDAO.log(user, ps)){
                    status=UDAO.Dstatus(user);
                   if(status==0){
                       response.sendRedirect("Estatus.jsp");
                   }
                   else if(status==1){
                    if(Nivel==1){
                    Usuario usu = new Usuario(user,ps);
                    HttpSession session = request.getSession();
                    session.setAttribute("usuario", usu);
                    request.getRequestDispatcher("Inicio.jsp").forward(request, response);
                    }
                    else if(Nivel==2){
                    Usuario usu = new Usuario(user,ps);
                    HttpSession session = request.getSession();
                    session.setAttribute("usuario", usu);
                    request.getRequestDispatcher("Inicio.jsp").forward(request, response);
                        //response.sendRedirect("http://localhost:8080/SistemaPREP/reenvio");
                    }
                   }
                }
                else{response.sendRedirect("http://localhost:8080/SistemaPREP/Login.jsp");                    
                }
                
//                if(UDAO.Dstatus(user)==0){
//                    response.sendRedirect("Estatus.jsp");
//                }
//                else if(UDAO.Dstatus(user)==1){
//                    out.print(UDAO.DNivel(user));
//                    
//                    if(Nivel==1){
//                    response.sendRedirect("InicioAdmin.jsp");
//                        out.print(UDAO.DNivel(user));
//                    }
//                    else if(Nivel==2){
//                        out.print("hola2");
//                    //response.sendRedirect("Inicio.jsp");
//                    }
//                }
               
//               out.print(UDAO.DNivel(user));
//               out.print(UDAO.log(user, ps));
           }
                         
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
