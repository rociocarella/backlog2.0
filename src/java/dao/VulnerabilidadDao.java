/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Vulnerabilidad;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author japa
 */
public class VulnerabilidadDao {
    
    private static final String sql_insert = "INSERT INTO vulnerabilidad(id_vulnerabilidad, nombre_vulnerabilidad, url_servicio, descripcion_vulnerabilidad, impacto_vulnerabilidad, recomendaciones_vulnerabilidad, id_estado_mitigacion, fecha_mitigacion, cvss, fecha_propuesta, pasos, path_poc, num_incidente, id_usuario, id_categoria, id_owasp_2017, id_criticidad, id_tratamiento_riesgo, id_cwe, id_aplicacion, id_ambiente, id_empresa) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setDate(8, vul.getFecha_mitigacion());
            ps.setString(9,vul.getCvss());
            ps.setDate(10, vul.getFecha_propuesta());
            ps.setString(11, vul.getPasos());
            ps.setString(12, vul.getPath_poc());
            ps.setString(13, vul.getNum_incidente());
            ps.setInt(14, vul.getUsuario());
            ps.setInt(15, vul.getCategoria());
            ps.setInt(16, vul.getOwasp());
            ps.setInt(17, vul.getCriticidad());
            ps.setInt(18, vul.getTratamiento_riesgo());
            ps.setInt(19, vul.getCwe());
            ps.setInt(20, vul.getAplicacion());
            ps.setInt(21, vul.getAmbiente());
            ps.setInt(22, vul.getEmpresa());
            
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
