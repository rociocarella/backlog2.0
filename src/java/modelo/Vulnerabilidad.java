/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.util.Date;

/**
 *
 * @author Rocío del Mar Mágica
 * 
 * id_vulnerabilidad
 * nombre_vulnerabilidad
 * url_servicio
 * descripcion_vulnerabilidad
 * impacto_vulnerabilidad
 * recomendaciones_vulnerabilidad
 * id_estado_mitigacion
 * fecha_mitigacion
 * ----
 * id_cwe
 * id_owasp
 * id_categoria
 * id_criticidad
 * id_ambiente
 * id_tratamiento_riesgo
 * id_usuario
 * id_empresa
 * id_aplicacion
 * -----
 * cvss  string
 * fecha_propuesta
 * pasos LONGTEXT
 * path_poc
 * num_incidente 
 * 
 * 
 */
public class Vulnerabilidad {
    private int id_vulnerabilidad;
    private String nombre_vulnerabilidad;
    private String url_servicio;
    private String descripcion_vulnerabilidad;
    private String impacto_vulnerabilidad;
    private String recomendaciones_vulnerabilidad;
    private int id_estado_mitigacion;
    private Date fecha_mitigacion;
    private String cvss;
    private Date fecha_propuesta;
    private String pasos;
    private String path_poc;
    private String num_incidente;
    
    private Cwe cwe;
    private Owasp owasp;
    private Criticidad criticidad;
    private Ambiente ambiente;
    private Tratamiento_Riesgo tratamiento_riesgo;
    private Usuario usuario;
    private Empresa empresa;
    private Aplicacion aplicacion;

    public Vulnerabilidad (int id_vulnerabilidad, String nombre_vulnerabilidad, String url_servicio, String descripcion_vulnerabilidad, String impacto_vulnerabilidad, String recomendaciones_vulnerabilidad, int id_estado_mitigacion, Date fecha_mitigacion, String cvss, Date fecha_propuesta, String pasos, String path_poc, String num_incidente, Cwe cwe, Owasp owasp, Criticidad criticidad, Ambiente ambiente, Tratamiento_Riesgo tratamiento_riesgo, Usuario usuario, Empresa empresa, Aplicacion aplicacion) {
        this.id_vulnerabilidad = id_vulnerabilidad;
        this.nombre_vulnerabilidad = nombre_vulnerabilidad;
        this.url_servicio = url_servicio;
        this.descripcion_vulnerabilidad = descripcion_vulnerabilidad;
        this.impacto_vulnerabilidad = impacto_vulnerabilidad;
        this.recomendaciones_vulnerabilidad = recomendaciones_vulnerabilidad;
        this.id_estado_mitigacion = id_estado_mitigacion;
        this.fecha_mitigacion = fecha_mitigacion;
        this.cvss = cvss;
        this.fecha_propuesta = fecha_propuesta;
        this.pasos = pasos;
        this.path_poc = path_poc;
        this.num_incidente = num_incidente;
        this.cwe = cwe;
        this.owasp = owasp;
        this.criticidad = criticidad;
        this.ambiente = ambiente;
        this.tratamiento_riesgo = tratamiento_riesgo;
        this.usuario = usuario;
        this.empresa = empresa;
        this.aplicacion = aplicacion;
    }

    public int getId_vulnerabilidad() {
        return id_vulnerabilidad;
    }

    public void setId_vulnerabilidad(int id_vulnerabilidad) throws Exception
    {
        if(id_vulnerabilidad !=0)
        {
            this.id_vulnerabilidad = id_vulnerabilidad;
        }
        else
        {
            throw new Exception ("El id no puede estar vacío");
        }
    }

    public String getNombre_vulnerabilidad() {
        return nombre_vulnerabilidad;
    }

    public void setNombre_vulnerabilidad(String nombre_vulnerabilidad) throws Exception
    {
        if(nombre_vulnerabilidad.trim().length()!=0)
        {
            this.nombre_vulnerabilidad = nombre_vulnerabilidad;
        }
        else
        {
            throw new Exception ("El nombre no puede estar vacío");
        }
    }

    public String getUrl_servicio() {
        return url_servicio;
    }

    public void setUrl_servicio(String url_servicio) {
        this.url_servicio = url_servicio;
    }

    public String getDescripcion_vulnerabilidad() {
        return descripcion_vulnerabilidad;
    }

    public void setDescripcion_vulnerabilidad(String descripcion_vulnerabilidad) {
        this.descripcion_vulnerabilidad = descripcion_vulnerabilidad;
    }

    public String getImpacto_vulnerabilidad() {
        return impacto_vulnerabilidad;
    }

    public void setImpacto_vulnerabilidad(String impacto_vulnerabilidad) {
        this.impacto_vulnerabilidad = impacto_vulnerabilidad;
    }

    public String getRecomendaciones_vulnerabilidad() {
        return recomendaciones_vulnerabilidad;
    }

    public void setRecomendaciones_vulnerabilidad(String recomendaciones_vulnerabilidad) {
        this.recomendaciones_vulnerabilidad = recomendaciones_vulnerabilidad;
    }

    public int getId_estado_mitigacion() {
        return id_estado_mitigacion;
    }

    public void setId_estado_mitigacion(int id_estado_mitigacion) throws Exception
    {
        if(id_estado_mitigacion !=0)
        {
            this.id_estado_mitigacion = id_estado_mitigacion;
        }
        else
        {
            throw new Exception ("El id no puede estar vacío");
        }

    }

    public Date getFecha_mitigacion() {
        return fecha_mitigacion;
    }

    /* validar fecha oe zi */
    
    public void setFecha_mitigacion(Date fecha_mitigacion) {
        this.fecha_mitigacion = fecha_mitigacion;
    }

    public String getCvss() {
        return cvss;
    }

    public void setCvss(String cvss) throws Exception 
    {
        if(cvss.trim().length()!=0)
        {
            this.cvss = cvss;
        }
        else
        {
            throw new Exception("El cvss no puede estar vacío");
        }
    }

    public Date getFecha_propuesta() {
        return fecha_propuesta;
    }

    /* fecha propuesta validar oe zi */
    public void setFecha_propuesta(Date fecha_propuesta) {
        this.fecha_propuesta = fecha_propuesta;
    }

    public String getPasos() {
        return pasos;
    }

    public void setPasos(String pasos) throws Exception
    {
        if(pasos.trim().length()!=0)
        {
            this.pasos = pasos;
        }
        else
        {
            throw new Exception("El campo no puede estar vacío");
        }
    }

    public String getPath_poc() {
        return path_poc;
    }

    public void setPath_poc(String path_poc) {
        this.path_poc = path_poc;
    }

    public String getNum_incidente() {
        return num_incidente;
    }

    public void setNum_incidente(String num_incidente) {
        this.num_incidente = num_incidente;
    }

    public Cwe getCwe() {
        return cwe;
    }

    public void setCwe(Cwe cwe) {
        this.cwe = cwe;
    }

    public Owasp getOwasp() {
        return owasp;
    }

    public void setOwasp(Owasp owasp) {
        this.owasp = owasp;
    }

    public Criticidad getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(Criticidad criticidad) {
        this.criticidad = criticidad;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Tratamiento_Riesgo getTratamiento_riesgo() {
        return tratamiento_riesgo;
    }

    public void setTratamiento_riesgo(Tratamiento_Riesgo tratamiento_riesgo) {
        this.tratamiento_riesgo = tratamiento_riesgo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }

    @Override
    public String toString() {
        return "Vulnerabilidad{" + "id_vulnerabilidad=" + id_vulnerabilidad + ", nombre_vulnerabilidad=" + nombre_vulnerabilidad + ", url_servicio=" + url_servicio + ", descripcion_vulnerabilidad=" + descripcion_vulnerabilidad + ", impacto_vulnerabilidad=" + impacto_vulnerabilidad + ", recomendaciones_vulnerabilidad=" + recomendaciones_vulnerabilidad + ", id_estado_mitigacion=" + id_estado_mitigacion + ", fecha_mitigacion=" + fecha_mitigacion + ", cvss=" + cvss + ", fecha_propuesta=" + fecha_propuesta + ", pasos=" + pasos + ", path_poc=" + path_poc + ", num_incidente=" + num_incidente + ", cwe=" + cwe + ", owasp=" + owasp + ", criticidad=" + criticidad + ", ambiente=" + ambiente + ", tratamiento_riesgo=" + tratamiento_riesgo + ", usuario=" + usuario + ", empresa=" + empresa + ", aplicacion=" + aplicacion + '}';
    }
    
 
    
    
    
}
