package bodega.service;

import bodega.BD.AccesoBD;
import bodega.modelo.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Service_Producto {

    public void IngresarProductoAlSQL(Productos producto) {
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement(" INSERT INTO PRODUCTO "
                    + "(id_producto, nombre_pro, precio_pro, descri_pro, fechaReg_pro) "
                    + "VALUES (?,?,?,?,?)");
            ps.setInt(1, producto.getIdProducto());
            ps.setString(2, producto.getNomPro());
            ps.setDouble(3, producto.getPrecio());
            ps.setString(4, producto.getDescrip());
            ps.setString(5, producto.getFechaRePro());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto guardado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void Editar(Productos producto) {
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE PRODUCTO SET "
                    + "nombre_pro=?, precio_pro=?, descri_pro=?, fechaReg_pro=? "
                    + "WHERE id_producto=? ");
            ps.setString(1, producto.getNomPro());
            ps.setDouble(2, producto.getPrecio());
            ps.setString(3, producto.getDescrip());
            ps.setString(4, producto.getFechaRePro());
            ps.setInt(5, producto.getIdProducto());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Modificado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void Eliminar(Productos producto) {
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM PRODUCTO "
                    + "WHERE id_producto =? ");
            ps.setInt(1, producto.getIdProducto());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
/*
    public void mostrarProducto(Productos products){
        try{
            Connection cn =AccesoBD.getConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT nombre_pro "
                    + "FROM PRODUCTO");
            ps.setString(1, products.getNomPro());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Productos");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void mostrarProductos(JComboBox<String> comboBox) {
        try {
            Connection cn = AccesoBD.getConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT nombre_pro FROM PRODUCTO");
            ResultSet rs = ps.executeQuery();
            comboBox.removeAllItems();
            while (rs.next()) {
                String nombreProducto = rs.getString("nombre_pro");
                comboBox.addItem(nombreProducto);
            }
            rs.close();
            ps.close();
            cn.close();
            JOptionPane.showMessageDialog(null, "Productos cargados en el JComboBox.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + ex.toString());
    }   }
*/
}
