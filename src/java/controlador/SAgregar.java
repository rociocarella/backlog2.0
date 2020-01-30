/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ClienteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

/**
 *
 * @author VAIO
 */
public class SAgregar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs ClienteDao
     */
    ClienteDao clienteDao;

    public void init() {
    String pass =getServletContext().getInitParameter("jdbcPassword");

        clienteDao = new ClienteDao();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String ID_CLIENTE = request.getParameter("ID_CLIENTE");
            String NOMBRE = request.getParameter("NOMBRE");
            String RUT = request.getParameter("RUT");
            String APELLIDO = request.getParameter("APELLIDO");
            String DIRECCION = request.getParameter("DIRECCION");
            String COMUNA = request.getParameter("COMUNA");
            String EMAIL = request.getParameter("EMAIL");
            String FECHA_NAC = request.getParameter("FECHA_NAC");
            String PASS = request.getParameter("PASS");
            String error = "";
            if (NOMBRE.equals("") || NOMBRE == null) {
                error = "El campos es obligatorio";
                request.getSession().setAttribute("mensaje", error);
                response.sendRedirect("error.jsp");
            } else {
                int Id = 0;
                try {
                    Id = Integer.parseInt(ID_CLIENTE);
                    Cliente c = new Cliente(Id, NOMBRE, RUT, APELLIDO, DIRECCION, COMUNA, EMAIL, FECHA_NAC, PASS);
                    clienteDao.create(c);
                    response.sendRedirect("principal.jsp");
                } catch (NumberFormatException e) {
                    error = "este campo es de tipo numerio" + e.getMessage();
                    request.getSession().setAttribute("mensaje", error);
                    response.sendRedirect("error.jsp");
                } catch (Exception ex) {
                    error = "error:" + ex.getMessage();
                    request.getSession().setAttribute("mensaje", error);
                    response.sendRedirect("error.jsp");
                }
            }
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
