package bodega.service;

import bodega.BD.AccesoBD;
import bodega.modelo.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Service_Venta {

    public void IngresarVentaAlSQL (Ventas venta){         
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO VENTA "
                + "(id_venta, id_producto, total_ve, fecha_ve, fechaReg_ve) "
                + "VALUES (?,?,?,?,?)");    
            ps.setInt(1, venta.getIdVenta());
            ps.setInt(2, venta.getIdProducto());
            ps.setDouble(3, venta.getTotal());
            ps.setString(4, venta.getFechaVe());
            ps.setString(5, venta.getFechaReVe());
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venta guardada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }     }

    public void Editar (Ventas venta){   
                    try {
                Connection con = AccesoBD.getConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE VENTA SET "
                    + "id_producto=?, total_ve=?, fecha_ve=?, fechaReg_ve=? "
                    + "WHERE id_venta=? ");
                ps.setInt(1, venta.getIdProducto());
                ps.setDouble(2, venta.getTotal());
                ps.setString(3, venta.getFechaVe());
                ps.setString(4, venta.getFechaVe());
                ps.setInt(5, venta.getIdVenta());
               ps.executeUpdate();  
                JOptionPane.showMessageDialog(null, "Venta Modificada");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
        }   }

    public void Eliminar(Ventas venta) {
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM VENTA "
                    + "WHERE id_venta =? ");
            ps.setInt(1, venta.getIdVenta());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venta Eliminada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
    }   }
}
