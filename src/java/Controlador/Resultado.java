
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Resultados;
import ModeloDao.VotosDAO;
import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.List;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Raul
 */
@WebServlet(name = "Resultado", urlPatterns = {"/Resultado"})
public class Resultado extends HttpServlet {

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
            out.println("<title>Servlet Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Resultado at " + request.getContextPath() + "</h1>");
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
        doPost(request, response);
        
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
    /*    
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
                String url = "jdbc:mysql://localhost:3306/votaciones";
                String usuario = "root";
                String contrasena = "";
                try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }



        try {
            con = DriverManager.getConnection(url,usuario,contrasena);
        } catch (SQLException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                  if ( con != null ) 
                      
                        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = stmt.executeQuery("SELECT p.nombre_partido, sum(v.votos) FROM Votos v JOIN partidos p on p.id_partido = v.fk_id_partido  GROUP by v.fk_id_partido;");
        } catch (SQLException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        out.print("    <head>\n" +
"        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0\" crossorigin=\"anonymous\">\n" +
"    </head>");
        out.print("<!--Cabecero --> <header id=\"main-header\" class=\"py-2 bg-secondary text-white\"> <div class=\"container\"> <div class=\"row\"> <div class=\"col-md-6\"> <a href=\"Inicio.jsp\" class=\"nav-item nav-link text-white\"> <h1> <i class=\"fas fa-balance-scale\"></i></i> Sistema PREP </h1> </a> </div> </div> </div> </header>");
        out.print("<h1>"+"VOTOS"+"</h1>");
            out.print("<center>");
            out.print("<table border='1'>");
            out.print("<tr>");
            out.print("<th>"+"PARTIDOS"+"</th>");
            out.print("<th>"+"VOTOS"+"</th>");
            out.print("</tr>");
        try {
            while(rs.next()){
                String Pr=rs.getString(1);
                int Vt=rs.getInt(2);
                out.print("<tr>");//---------
                
                out.print("<td>");
                out.print(""+ Pr);
                out.print("</td>");
                
                out.print("<td>");
                out.print(Vt);
                out.print("</td>");
                
                
                out.print("</tr>");
                
            }
            out.print("</table>");
            out.print("</center>");
        } catch (SQLException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        HttpSession sesion = request.getSession();
        
        VotosDAO daovotos = new VotosDAO();
        
        List<Resultados> resultado = daovotos.ResultaF();
        sesion.setAttribute("Consul", resultado);
        
        
        System.out.println(resultado.get(0).getPartido());
        List<Resultados> resultadom = daovotos.ResultaM();
        sesion.setAttribute("ConsulM", resultadom);
        
        System.out.println(resultadom.get(0).getPartido());
        List<Resultados> resultadol = daovotos.ResultaL();
        sesion.setAttribute("ConsulL", resultadol);
        
        System.out.println(resultadol.get(0).getPartido());
        
        response.sendRedirect("resultado.jsp");
        
        
          
        
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

    private static class Resultset {

        public Resultset() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private int getInt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getString(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private int getInt() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getString() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
