package bodega.modelo;

public class Ventas {
    
    private int idVenta;
    private int idProducto;
    private double total;
    private String fechaVe;
    private String fechaReVe;

    public Ventas(int idVenta, int idProducto, double total, String fechaVe, String fechaReVe) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.total = total;
        this.fechaVe = fechaVe;
        this.fechaReVe = fechaReVe;
    }

    public Ventas(int idVenta) {
        this.idVenta = idVenta;
    }
    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFechaVe() {
        return fechaVe;
    }

    public void setFechaVe(String fechaVe) {
        this.fechaVe = fechaVe;
    }

    public String getFechaReVe() {
        return fechaReVe;
    }

    public void setFechaReVe(String fechaReVe) {
        this.fechaReVe = fechaReVe;
    }    
        
}
