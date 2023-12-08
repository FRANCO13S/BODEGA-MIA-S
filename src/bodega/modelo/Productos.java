package bodega.modelo;

public class Productos {
    
    private int idProducto;
    private String nomPro;
    private double precio;
    private String descrip;
    private String fechaRePro;

    public Productos(int idProducto, String nomPro, double precio,
            String descrip, String fechaRePro) {
        this.idProducto = idProducto;
        this.nomPro = nomPro;
        this.precio = precio;
        this.descrip = descrip;
        this.fechaRePro = fechaRePro;
    }

    public Productos(int idProducto) {
        this.idProducto = idProducto;
    }        
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getFechaRePro() {
        return fechaRePro;
    }

    public void setFechaRePro(String fechaRePro) {
        this.fechaRePro = fechaRePro;
    } 
    
}
