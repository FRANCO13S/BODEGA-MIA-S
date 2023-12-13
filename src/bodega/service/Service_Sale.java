package bodega.service;

import bodega.BD.AccesoBD;
import bodega.modelo.Sales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Service_Sale {
    
    public void IngresarSaleAlSQL (Sales sale){         
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO SALE "
                + "(id_sale, descripcion, precio, cantidad, importe, sub, igv, total) "
                + "VALUES (?,?,?,?,?,?,?,?)");    
            ps.setInt(1, sale.getIdSale());
            ps.setString(2, sale.getDescripcion());
            ps.setDouble(3, sale.getPrecio());
            ps.setInt(4, sale.getCantidad());
            ps.setDouble(5, sale.getImporte());
            ps.setDouble(6, sale.getSub());
            ps.setDouble(7, sale.getIgv());
            ps.setDouble(8, sale.getTotal());
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sale guardada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }     }
}
