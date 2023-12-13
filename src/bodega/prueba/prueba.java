package bodega.prueba;

import bodega.BD.AccesoBD;
import java.sql.Connection;
import java.sql.SQLException;

public class prueba {

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
