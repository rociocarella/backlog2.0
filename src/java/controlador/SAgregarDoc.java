/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Documento;
import modelo.Vulnerabilidad;

/**
 *
 * @author japa
 */
public class SAgregarDoc extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     
    DocumentoDao documentoDao;
    
    public void init() {
    String pass =getServletContext().getInitParameter("jdbcPassword");

        documentoDao = new DocumentoDao();
    }
    private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String id_documento = request.getParameter("id_documento");
            String nombre_documento = request.getParameter("nombre_documento");
            String path_documento = request.getParameter("path_documento");
            String version_documento = request.getParameter("version_documento");
            String hash_md5 = request.getParameter("hash_md5");
            String hash_sha1 = request.getParameter("hash_sha1");
            String hash_sha256 = request.getParameter("hash_sha256");
            String documento_relacionado = request.getParameter("documento_relacionado");
            String fecha_entrega = request.getParameter("fecha_entrega");
            String nro_sprint = request.getParameter("nro_sprint");
            String nombre_sprint = request.getParameter("nombre_sprint");
            String estado_documento = request.getParameter("estado_documento");
            String alcance = request.getParameter("alcance");
            String conclusion = request.getParameter("conclusion");
            String id_persona = request.getParameter("id_persona");
            String id_idea = request.getParameter("id_idea");
            String id_celula = request.getParameter("id_celula");
            String id_usuario = request.getParameter("id_usuario");
            String id_origen = request.getParameter("id_origen");
            String id_revision = request.getParameter("id_revision");
            
            String error = "";
            
            if (nombre_documento.equals("") || nombre_documento == null) {
                error = "El campos es obligatorio";
                request.getSession().setAttribute("mensaje", error);
                response.sendRedirect("error.jsp");
            } else {
                int Id_doc = 0;
                int ver_doc = 0;
                int nro_sp = 0;
                int id_per = 0;
                int id_celu = 0;
                int id_usu = 0;
                int id_ori = 0;
                int id_revi = 0;
                
                try {
                    Id_doc = Integer.parseInt(id_documento);
                    ver_doc = Integer.parseInt(version_documento);
                    nro_sp = Integer.parseInt(nro_sprint);
                    id_per = Integer.parseInt(id_persona);
                    id_celu = Integer.parseInt(id_celula);        
                    id_usu = Integer.parseInt(id_usuario);       
                    id_ori = Integer.parseInt(id_origen);
                    id_revi = Integer.parseInt(id_revision);        
                    
                    
                    java.util.Date utilDate = new java.util.Date(fecha_entrega);
                    java.sql.Date sqlDate = convert(utilDate);
                    DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
                    
                    
                    boolean b = Boolean.parseBoolean(estado_documento);
                    
                   
                    
                    Documento doc = new Documento(Id_doc, nombre_documento, path_documento, ver_doc, hash_md5, hash_sha1, hash_sha256, documento_relacionado, sqlDate, nro_sp, nombre_sprint,b, alcance, conclusion, id_per, id_idea, id_celu, id_usu, id_ori, id_revi);
                    documentoDao.create(doc);
                    response.sendRedirect("principal.jsp");
                } catch (NumberFormatException e) {
                    error = "este campo es de tipo numerico" + e.getMessage();
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
