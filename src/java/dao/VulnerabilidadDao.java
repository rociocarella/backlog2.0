/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Vulnerabilidad;
import conexion.Conexion;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;


/**
 *
 * @author japa
 */
public class VulnerabilidadDao {
    
    private static final String sql_insert = "INSERT INTO VUlNERABILIDAD(id_vulnerabilidad,nombre_vulnerabilidad, url_servicio, descripcion_vulnerabilidad,impacto_vulnerabilidad,recomendaciones_vulnerabilidad,id_estado_mitigacion,fecha_mitigacion,cvss,fecha_propuesta,pasos,path_poc,num_incidente,cwe,owasp,criticidad,ambiente,tratamiento_riesgo,usuario,empresa,aplicacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String sql_delete = "DELETE FROM VUlNERABILIDAD WHERE id_vulnerabilidad=?";
    private static final String sql_update = "UPDATE VUlNERABILIDAD SET nombre_vulnerabilidad=?, url_servicio=?, descripcion_vulnerabilidad=?, impacto_vulnerabilidad=?, recomendaciones_vulnerabilidad=?, id_estado_mitigacion=?, fecha_mitigacion=?, cvss,fecha_propuesta=?, pasos=?, path_poc=?, num_incidente=?, cwe=?, owasp=?, criticidad=?, ambiente=?, tratamiento_riesgo=?, usuario=?, empresa=?, aplicacion=? WHERE id_vulnerabilidad= ?";
    private static final String sql_read = "SELECT * FROM VUlNERABILIDAD WHERE id_vulnerabilidad= ?";
    private static final String sql_readAll = "SELECT * FROM VUlNERABILIDAD";
    

    private static final Conexion con = Conexion.estadoConexion();

    public boolean create(Vulnerabilidad vul) {
        PreparedStatement ps;
        try {
             
            
            ps = con.getCon().prepareStatement(sql_insert);
            ps.setInt(1, vul.getId_vulnerabilidad());
            ps.setString(2, vul.getNombre_vulnerabilidad());
            ps.setString(3, vul.getUrl_servicio());
            ps.setString(4, vul.getDescripcion_vulnerabilidad());
            ps.setString(5, vul.getImpacto_vulnerabilidad());
            ps.setString(6, vul.getRecomendaciones_vulnerabilidad());
            ps.setInt(7, vul.getId_estado_mitigacion());
            ps.setDate(8, (java.sql.Date) vul.getFecha_mitigacion());
            ps.setString(9,vul.getCvss());
            ps.setDate(10, (java.sql.Date) vul.getFecha_propuesta());
            ps.setString(11, vul.getPasos());
            ps.setString(12, vul.getPath_poc());
            ps.setString(13, vul.getNum_incidente());
            
            ps.setInt(14, cwe.getId_cwe());
            ps.setObject(15, owasp.getId_owasp_2017());
            ps.setObject(16, criticidad.getId_criticidad());
            ps.setObject(17, ambiente.getId_ambiente());
            ps.setObject(18, tratamiento_Riesgo.getId_tratamiento());
            ps.setObject(19, usuario.getId_usuario());
            ps.setObject(20, empresa.getId_empresa());
            ps.setObject(21, ambiente.getId_ambiente());
            
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

    public void create(Vulnerabilidad v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
