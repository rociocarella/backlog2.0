/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.VulnerabilidadDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Vulnerabilidad;
import java.util.Date;
import java.text.SimpleDateFormat;
import modelo.*;

/**
 *
 * @author japa
 */
public class SAgregarV extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    VulnerabilidadDao vulnerabilidadDao;
    
    String cwe;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id_vulnerabilidad = request.getParameter("id_vulnerabilidad");
            String nombre_vulnerabilidad = request.getParameter("nombre_vulnerabilidad");
            String url_servicio = request.getParameter("url_servicio");
            String descripcion_vulnerabilidad = request.getParameter("descripcion_vulnerabilidad");
            String impacto_vulnerabilidad = request.getParameter("impacto_vulnerabilidad");
            String recomendaciones_vulnerabilidad = request.getParameter("recomendaciones_vulnerabilidad");
            String id_estado_mitigacion = request.getParameter("id_estado_mitigacion");
            String fecha_mitigacion = request.getParameter("fecha_mitigacion");
            String cvss = request.getParameter("cvss");
            String fecha_propuesta = request.getParameter("fecha_propuesta");
            String pasos = request.getParameter("pasos");
            String path_poc = request.getParameter("path_poc");
            String num_incidente = request.getParameter("num_incidente");
            String cwe = request.getParameter("cwe");
            String owasp = request.getParameter("owasp");
            String criticidad = request.getParameter("criticidad");
            String ambiente = request.getParameter("ambiente");
            String tratamiento_riesgo = request.getParameter("tratamiento_riesgo");
            String usuario = request.getParameter("usuario");
            String empresa = request.getParameter("empresa");
            String aplicacion = request.getParameter("aplicacion");
            String error = "";
            
            if (nombre_vulnerabilidad.equals("") || nombre_vulnerabilidad == null) {
                error = "El campos es obligatorio";
                request.getSession().setAttribute("mensaje", error);
                response.sendRedirect("error.jsp");
            } else {
                int Id = 0;
                int id_estado = 0;
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha_mitig = null;
                Date fecha_prop = null;
                
                try {
                    Id = Integer.parseInt(id_vulnerabilidad);
                    id_estado = Integer.parseInt(id_estado_mitigacion);
                    fecha_mitig = formato.parse(fecha_mitigacion);
                    fecha_prop = formato.parse(fecha_propuesta);
                    
                    Cwe cwe2 = new Cwe();
                    Owasp owasp2 = new Owasp();
                    Criticidad criticidad2 = new Criticidad();
                    Ambiente ambiente1 = new Ambiente();
                    Tratamiento_Riesgo tratamiento = new Tratamiento_Riesgo();
                    Usuario usuario1 = new Usuario();
                    Empresa empresa1 = new Empresa();
                    Aplicacion aplicacion1 = new Aplicacion();
                    
                    
                    
               
                    cwe = String.valueOf(cwe2.getId_cwe());
                    owasp2.getId_owasp_2017();
                    criticidad2.getId_criticidad();
                    ambiente1.getId_ambiente();
                    tratamiento.getId_tratamiento();
                    usuario1.getId_usuario();
                    empresa1.getId_empresa();
                    aplicacion1.getId_aplicacion();
                    
                    
                    
                    Vulnerabilidad vul = new Vulnerabilidad(Id, nombre_vulnerabilidad, url_servicio, descripcion_vulnerabilidad,impacto_vulnerabilidad ,recomendaciones_vulnerabilidad, id_estado, fecha_mitig, cvss, fecha_prop, pasos, path_poc, num_incidente, cwe2,owasp2,criticidad2,ambiente1,tratamiento,usuario1,empresa1,aplicacion1);
                    vulnerabilidadDao.create(vul);
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
