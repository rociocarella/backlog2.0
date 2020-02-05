/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VAIO
 */
public class Conexion {
        public static Conexion instancia;
    private Connection con;
    public String db="backlog"; /*Aqui debes escribir el nombre de la bd*/
    public String usuario="root"; /*Aqui debes escribir el usuario de la bd*/
    public String clave=""; /*Aqui debes escribir el clave de la bd*/

    public Conexion() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost/"+db,usuario,clave);
                } catch (SQLException ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    
    public static Conexion estadoConexion(){
        if (instancia==null) {
            instancia=new Conexion();            
        }
        return instancia;
    }

    public Connection getCon() {
        return con;
    }
    
    public void cerrarConexion() {
        instancia=null;
    }

}
