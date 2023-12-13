package bodega.service;

import bodega.BD.AccesoBD;
import bodega.modelo.Pagos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Service_Pago {
    
    public void IngresarPagoAlSQL (Pagos pago){         
        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO PAGO "
                + "(id_pago, id_cliente, tipoPa, montoPagar, montopagado, fechaPa) "
                + "VALUES (?,?,?,?,?,?)");    
            ps.setInt(1, pago.getIdPago());
            ps.setInt(2, pago.getIdCliente());
            ps.setString(3, pago.getTipoPa());
            ps.setDouble(4, pago.getMontoPagar());
            ps.setDouble(5, pago.getMontoPagado());
            ps.setString(6, pago.getFechaPa());
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago Realizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }     }
    
    public List<Pagos> reporteDeSQL() {
        List<Pagos> listaPagos = new ArrayList<>();

        try {
            Connection con = AccesoBD.getConexion();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM PAGO");
            ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pagos pago = new Pagos();
            pago.setIdPago(rs.getInt("id_pago"));
            pago.setIdCliente(rs.getInt("id_cliente"));
            pago.setTipoPa(rs.getString("tipoPa"));
            pago.setMontoPagar(rs.getDouble("montoPagar"));
            pago.setMontoPagado(rs.getDouble("montoPagado"));
            pago.setFechaPa(rs.getString("fechaPa"));

            listaPagos.add(pago);
        }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listaPagos;
    }
}
