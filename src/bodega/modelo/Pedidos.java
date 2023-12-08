package bodega.modelo;

public class Pedidos {
    
    private int idPedido;
    private int idCliente;
    private int idProducto;
    private String fechaPe;
    private String fechaRePe;

    public Pedidos(int idPedido, int idCliente, int idProducto, String fechaPe, String fechaRePe) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.fechaPe = fechaPe;
        this.fechaRePe = fechaRePe;
    }

    public Pedidos(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getFechaPe() {
        return fechaPe;
    }

    public void setFechaPe(String fechaPe) {
        this.fechaPe = fechaPe;
    }

    public String getFechaRePe() {
        return fechaRePe;
    }

    public void setFechaRePe(String fechaRePe) {
        this.fechaRePe = fechaRePe;
    }
    
}
