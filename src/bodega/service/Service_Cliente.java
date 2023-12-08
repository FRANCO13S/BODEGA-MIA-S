package bodega.service;

import bodega.BD.AccesoBD;
import bodega.modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Service_Cliente extends AccesoBD{
    
    public void IngresarClienteAlSQL (Clientes cliente){         
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO CLIENTE "
                + "(id_cliente, nombre_cli, apellido_cli, telefono_cli, fechaReg_cli) "
                + "VALUES (?,?,?,?,?)");    
            ps.setInt(1, cliente.getIdCliente());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getFechaRe());
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente guardado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }   }

    public void Editar (Clientes cliente){   
                    try {
                Connection con = AccesoBD.getConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE CLIENTE SET "
                    + "nombre_cli=?, apellido_cli=?, telefono_cli=?, fechaReg_cli=? "
                    + "WHERE id_cliente=? ");
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getApellido());
                ps.setString(3, cliente.getTelefono());
                ps.setString(4, cliente.getFechaRe());
                ps.setInt(5, cliente.getIdCliente());
               ps.executeUpdate();  
                JOptionPane.showMessageDialog(null, "Cliente Modificado");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
        }   }
    
    public void Eliminar(Clientes cliente) {
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM CLIENTE "
                    + "WHERE id_cliente =? ");
            ps.setInt(1, cliente.getIdCliente());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
    }   }
}
