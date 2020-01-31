/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Rocío del Mar Mágica
 * 
 * id_documento int
 * nombre_documento 
 * path_documento
 * version_documento int
 * hash_md5 
 * hash_sha1
 * hash_sha256
 * documento_relacionado
 * fecha_entrega DATE
 * nro_sprint 
 * nombre_sprint
 * estado_documento
 * alcance
 * conclusion
 * 
 * 
 */
public class Documento {
    
    private int id_documento;
    private String nombre_documento;
    private String path_documento;
    private int version_documento;
    private String hash_md5;
    private String hash_sha1;
    private String hash_sha256;
    private String documento_relacionado;
    private Date fecha_entrega;
    private int nro_sprint;
    private String nombre_sprint;
    private boolean estado_documento;
    private String alcance;
    private String conclusion;
    
    private Revision revision;
    private Personas personas;
    private Usuario usuario;
    private Origen origen;
    private Celula celula;
    private Proyecto proyecto;

    public Documento(int id_documento, String nombre_documento, String path_documento, int version_documento, String hash_md5, String hash_sha1, String hash_sha256, String documento_relacionado, Date fecha_entrega, int nro_sprint, String nombre_sprint, boolean estado_documento, String alcance, String conclusion, Revision revision, Personas personas, Usuario usuario, Origen origen, Celula celula, Proyecto proyecto) {
        this.id_documento = id_documento;
        this.nombre_documento = nombre_documento;
        this.path_documento = path_documento;
        this.version_documento = version_documento;
        this.hash_md5 = hash_md5;
        this.hash_sha1 = hash_sha1;
        this.hash_sha256 = hash_sha256;
        this.documento_relacionado = documento_relacionado;
        this.fecha_entrega = fecha_entrega;
        this.nro_sprint = nro_sprint;
        this.nombre_sprint = nombre_sprint;
        this.estado_documento = estado_documento;
        this.alcance = alcance;
        this.conclusion = conclusion;
        this.revision = revision;
        this.personas = personas;
        this.usuario = usuario;
        this.origen = origen;
        this.celula = celula;
        this.proyecto = proyecto;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) throws Exception
    {
        if(id_documento !=0)
        {
            this.id_documento = id_documento;
        }
        else
        {
            throw new Exception("El id no puede estar vacío");
        }
    }

    public String getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(String nombre_documento) throws Exception
    {
        if(nombre_documento.trim().length()!=0)
        {
            this.nombre_documento = nombre_documento;
        }
        else
        {
            throw new Exception("El nombre del documento no puede estar vacío");
        }
    }

    public String getPath_documento() {
        return path_documento;
    }

    public void setPath_documento(String path_documento) throws Exception
    {
        if(path_documento.trim().length()!=0)
        {
            this.path_documento = path_documento;
        }
        else
        {
            throw new  Exception ("El path del documento no puede estar vacío");
        }
    }

    public int getVersion_documento() {
        return version_documento;
    }

    public void setVersion_documento(int version_documento) throws Exception
    {
        if(version_documento !=0)
        {
            this.version_documento = version_documento;
        }
        else
        {
            throw new Exception ("La versión del documento no puede estar vacía");
        }
    }

    public String getHash_md5() {
        return hash_md5;
    }

    public void setHash_md5(String hash_md5) throws Exception
    {
        if(hash_md5.trim().length()!=0)
        {
            this.hash_md5 = hash_md5;
        }
        else
        {
            throw new Exception ("El campo no puede estar vacío");
        }
    }

    public String getHash_sha1() {
        return hash_sha1;
    }

    public void setHash_sha1(String hash_sha1) throws Exception
    {
        if(hash_sha1.trim().length()!=0)
        {
            this.hash_sha1 = hash_sha1;
        }
        else
        {
            throw new Exception("El campo no puede estar vacío");
        }
    }

    public String getHash_sha256() {
        return hash_sha256;
    }

    public void setHash_sha256(String hash_sha256) throws Exception
    {
        if(hash_sha256.trim().length()!=0)
        {
            this.hash_sha256 = hash_sha256;
        }
        else
        {
            throw new Exception("El campo no puede estar vacío");
        }
    }

    public String getDocumento_relacionado() {
        return documento_relacionado;
    }

    public void setDocumento_relacionado(String documento_relacionado) {
        this.documento_relacionado = documento_relacionado;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) throws Exception
    {

        /* arreglar fecha */
            this.fecha_entrega = fecha_entrega;

    }

    public int getNro_sprint() {
        return nro_sprint;
    }

    public void setNro_sprint(int nro_sprint) {
        this.nro_sprint = nro_sprint;
    }

    public String getNombre_sprint() {
        return nombre_sprint;
    }

    public void setNombre_sprint(String nombre_sprint) {
        this.nombre_sprint = nombre_sprint;
    }

    public boolean isEstado_documento() {
        return estado_documento;
    }

    public void setEstado_documento(boolean estado_documento) throws Exception
    {
        if(estado_documento = true)
        {
            this.estado_documento = estado_documento;
        }
        else
        {
            throw new Exception("El estado de documento no puede estar vacío");
        }
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) throws Exception
    {
        if(alcance.trim().length()!=0)
        {
            this.alcance = alcance;
        }
        else
        {
            throw new Exception("El campo no puede estar vacío");
        }
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) throws Exception
    {
        if(conclusion.trim().length()!=0)
        {
            this.conclusion = conclusion;
        }
        else
        {
            throw new Exception("La conclusión no puede estar vacía");
        }
    }

    public Revision getRevision() {
        return revision;
    }

    public void setRevision(Revision revision) {
        this.revision = revision;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Celula getCelula() {
        return celula;
    }

    public void setCelula(Celula celula) {
        this.celula = celula;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    

    
}
