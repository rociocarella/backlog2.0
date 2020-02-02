/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author japa
 */
public class DocumentoDao {
    
    private static final String sql_insert = "INSERT INTO DOCUMENTO(id_documento,nombre_documento,path_documento,version_documento,hash_md5,hash_sha1,hash_sha256,documento_relacionado,fecha_entrega,nro_sprint,nombre_sprint,estado_documento,alcance,conclusion,revision,personas,usuario,origen,celula,proyecto) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    private static final Conexion con = Conexion.estadoConexion();

    public boolean create(Documento doc) {
        PreparedStatement ps;
        try {
            ps = con.getCon().prepareStatement(sql_insert);
            ps.setInt(1, doc.getId_documento());
            ps.setString(2, doc.getNombre_documento());
            ps.setString(3, doc.getPath_documento());
            ps.setInt(4, doc.getVersion_documento());
            ps.setString(5, doc.getHash_md5());
            ps.setString(6, doc.getHash_sha1());
            ps.setString(7, doc.getHash_sha256());
            ps.setDate(8, doc.getFecha_entrega());
            ps.setInt(9, doc.getNro_sprint());
            ps.setString(10, doc.getNombre_sprint());
            ps.setBoolean(11, doc.isEstado_documento());
            ps.setString(12, doc.getAlcance());
            ps.setString(13, doc.getConclusion());
            
            ps.setObject(14, doc.getRevision());
            ps.setObject(15, doc.getPersonas());
            ps.setObject(16, doc.getUsuario());
            ps.setObject(17, doc.getOrigen());
            ps.setObject(18, doc.getOrigen());
            ps.setObject(19, doc.getCelula());
            ps.setObject(20, doc.getProyecto());
            
            
            
            
            
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        return false;
    }

    
}
