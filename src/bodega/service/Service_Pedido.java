package bodega.service;

import bodega.BD.AccesoBD;
import bodega.modelo.Pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Service_Pedido {

    public void IngresarPedidoAlSQL (Pedidos pedido){         
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO PEDIDO "
                + "(id_pedido, id_cliente, id_producto, fecha_pe, fechaReg_pe) "
                + "VALUES (?,?,?,?,?)");    
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, pedido.getIdCliente());
            ps.setInt(3, pedido.getIdProducto());
            ps.setString(4, pedido.getFechaPe());
            ps.setString(5, pedido.getFechaRePe());
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pedido guardado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }     }

    public void Editar (Pedidos pedido){   
                    try {
                Connection con = AccesoBD.getConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE PEDIDO SET "
                    + "id_cliente=?, id_producto=?, fecha_pe=?, fechaReg_pe=? "
                    + "WHERE id_pedido=? ");
                ps.setInt(1, pedido.getIdCliente());
                ps.setInt(2, pedido.getIdProducto());
                ps.setString(3, pedido.getFechaPe());
                ps.setString(4, pedido.getFechaPe());
                ps.setInt(5, pedido.getIdPedido());
               ps.executeUpdate();  
                JOptionPane.showMessageDialog(null, "Pedido Modificado");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
        }   }

    public void Eliminar(Pedidos pedido) {
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM PEDIDO "
                    + "WHERE id_pedido =? ");
            ps.setInt(1, pedido.getIdPedido());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pedido Eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
    }   }
}
