package bodega.modelo;

public class Pagos {
    
    int idPago;
    int idCliente;
    String tipoPa;
    double montoPagar;
    double montoPagado;
    String fechaPa;

    public Pagos(int idPago, int idCliente, String tipoPa, double montoPagar, double montoPagado, String fechaPa) {
        this.idPago = idPago;
        this.idCliente = idCliente;
        this.tipoPa = tipoPa;
        this.montoPagar = montoPagar;
        this.montoPagado = montoPagado;
        this.fechaPa = fechaPa;
    }

    public Pagos() {}

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoPa() {
        return tipoPa;
    }

    public void setTipoPa(String tipoPa) {
        this.tipoPa = tipoPa;
    }

    public double getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(double montoPagar) {
        this.montoPagar = montoPagar;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getFechaPa() {
        return fechaPa;
    }

    public void setFechaPa(String fechaPa) {
        this.fechaPa = fechaPa;
    }

}
