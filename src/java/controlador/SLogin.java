/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ClienteDao;
import dao.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VAIO
 */
public class SLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    UsuarioDao usuarioDao;

    public void init() {

        usuarioDao = new UsuarioDao();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String usuario = request.getParameter("NOMBRE");
            String pass = request.getParameter("PASS");

            boolean ok = usuarioDao.autenticacion(usuario, pass);
            if (ok) {
                RequestDispatcher dispar = request.getRequestDispatcher("menu.jsp");
                dispar.forward(request, response);
            } else {
                RequestDispatcher dispar = request.getRequestDispatcher("login.jsp");
                dispar.forward(request, response);
            }

//        String cuentaX = request.getParameter("cuenta");
//        String claveX = request.getParameter("clave");
//        String mensaje = "";
//        (String nombre, String pass)
//        if (clienteDao.autenticacion(cuentaX, claveX)) {
//
//            response.sendRedirect("Bienvenido.jsp");
//        } else {
//            try {
//                mensaje = "Todos los campos deben estar registrado";
//                response.sendRedirect("error.jsp");
//            } catch (Exception ex) {
//                mensaje = "debe completar todos los campos";
//                mensaje = "error:"+ex.getMessage();
//                response.sendRedirect("error.jsp");
//            }
//        }
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
        processRequest(request, response);
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
