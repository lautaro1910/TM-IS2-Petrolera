package TransferObject;

public class Company {
    private String nombre;
    private String ubicacion;
    private String tipoDeProducto;
    private String cantidadDeProducto;
    private String telefono;

    public Company() {
        this.nombre = "null";
        this.ubicacion = "null";
        this.tipoDeProducto = "null";
        this.cantidadDeProducto = "null";
        this.telefono = "null";
    }

    public Company(String nombre, String ubicacion, String tipoDeProducto, String cantidadDeProducto, String telefono) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipoDeProducto = tipoDeProducto;
        this.cantidadDeProducto = cantidadDeProducto;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public String getCantidadDeProducto() {
        return cantidadDeProducto;
    }

    public void setCantidadDeProducto(String cantidadDeProducto) {
        this.cantidadDeProducto = cantidadDeProducto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
