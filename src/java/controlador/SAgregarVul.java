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
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import modelo.*;

/**
 *
 * @author japa
 */
public class SAgregarVul extends HttpServlet {

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
    
    public void init() {
    String pass =getServletContext().getInitParameter("jdbcPassword");

        vulnerabilidadDao = new VulnerabilidadDao();
    }
     private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
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
            String cwe = request.getParameter("id_cwe");
            String owasp = request.getParameter("id_owasp_2017");
            String criticidad = request.getParameter("id_criticidad");
            String ambiente = request.getParameter("id_ambiente");
            String tratamiento_riesgo = request.getParameter("id_tratamiento_riesgo");
            String usuario = request.getParameter("id_usuario");
            String empresa = request.getParameter("id_empresa");
            String aplicacion = request.getParameter("id_aplicacion");
            String id_categoria = request.getParameter("id_categoria");
            
            String error = "";
            
            if (nombre_vulnerabilidad.equals("") || nombre_vulnerabilidad == null) {
                error = "El campos es obligatorio";
                request.getSession().setAttribute("mensaje", error);
                response.sendRedirect("error.jsp");
            } else {
                int Id = 0;
                int id_estado = 0;
                int cwe1 = 0;
                int owasp1 = 0;
                int criticidad1 = 0;
                int ambiente1 = 0 ;
                int tratamiento_riesgo1 = 0;
                int usuario1 = 0;
                int empresa1 = 0;
                int aplicacion1 = 0;
                int categoria1 = 0;
                int num_incid1 = 0;
                
                
               
                
                try {
                    Id = Integer.parseInt(id_vulnerabilidad);
                    id_estado = Integer.parseInt(id_estado_mitigacion);
                    cwe1 = Integer.parseInt(cwe);
                    owasp1 = Integer.parseInt(owasp);
                    criticidad1= Integer.parseInt(criticidad);
                    ambiente1= Integer.parseInt(ambiente);
                    tratamiento_riesgo1=Integer.parseInt(tratamiento_riesgo);
                    usuario1= Integer.parseInt(usuario);
                    empresa1= Integer.parseInt(empresa);
                    aplicacion1= Integer.parseInt(aplicacion);
                    categoria1= Integer.parseInt(id_categoria);
                    
                    java.util.Date utilDate = new java.util.Date(fecha_mitigacion);
                    java.sql.Date sqlDate = convert(utilDate);
                    DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
               
                    
                    java.util.Date utilDate2 = new java.util.Date(fecha_propuesta);
                    java.sql.Date sqlDate2 = convert(utilDate2);
                    DateFormat df2 = new SimpleDateFormat("dd/MM/YYYY");
                 
                    
                    
                    
                    
                    
                    
                    
                    Vulnerabilidad vul = new Vulnerabilidad(Id, nombre_vulnerabilidad, url_servicio, descripcion_vulnerabilidad,impacto_vulnerabilidad ,recomendaciones_vulnerabilidad, id_estado,sqlDate , cvss, sqlDate2, pasos, path_poc, num_incidente,usuario1,categoria1,owasp1,criticidad1,tratamiento_riesgo1,cwe1,aplicacion1,ambiente1,empresa1);                   
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
