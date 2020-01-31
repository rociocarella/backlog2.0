/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;
import Modelo.*;


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
            ps.setDate(8,vul.getFecha_mitigacion());
            ps.setString(9,vul.getCvss());
            ps.setDate(10, vul.getFecha_propuesta());
            ps.setString(11, vul.getPasos());
            ps.setString(12, vul.getPath_poc());
            ps.setString(13, vul.getNum_incidente());
            
            
            
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

    public boolean delete(int id_usuario) {
        PreparedStatement ps;
        try {
            ps = con.getCon().prepareStatement(sql_delete);
            ps.setInt(1, id_usuario);
            if (ps.executeUpdate() > 1) {
                if (ps.executeUpdate() > 0) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        return false;
    }

    public boolean update(Usuario cli) {
        PreparedStatement ps;
        try {
            ps = con.getCon().prepareStatement(sql_update);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getPassword());
            ps.setString(3, cli.getToken_csrf());
            ps.setString(4, cli.getUltima_conexion());
            ps.setString(5, cli.getCorreo_electronico());
            ps.setInt(6, cli.getId_tipo_usuario());
            
            ps.setInt(7, cli.getId_usuario());
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

    public Usuario read(int id_usuario) {
        PreparedStatement ps;
        ResultSet rs;
        Usuario clie = null;
        try {
            ps = con.getCon().prepareStatement(sql_read);
            ps.setInt(1, id_usuario);
            rs = ps.executeQuery();
            while (rs.next()) {
                clie = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
            }
            return clie;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        return clie;
    }

    public List<Usuario> readAll() {
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<Usuario> usuarios = new ArrayList();
        try {
            ps = con.getCon().prepareStatement(sql_readAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuarios.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
            return usuarios;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        return usuarios;
    }
    
}
