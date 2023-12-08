/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega.prueba;

import bodega.BD.AccesoBD;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author FRANCO NIERI
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        try {
            Connection cn = AccesoBD.getConexion();
            System.out.println("Conexion ok.");
            cn.close(); // Cierra la conexion
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
