package bodega.modelo;

public class Clientes {
    
    private int idCliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String fechaRe;

    public Clientes(int idCliente, String nombre, String apellido, String telefono, String fechaRe) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaRe = fechaRe;
    }

    public Clientes(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaRe() {
        return fechaRe;
    }

    public void setFechaRe(String fechaRe) {
        this.fechaRe = fechaRe;
    }
        
}
