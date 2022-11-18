package TransferObject;

public class Empleado {
    private int numInterno;
    private String nombre;
    private String apellido;
    private String DNI;
    private int estado;
    private int telefono;
    private String diagrama;

    public Empleado() {
    }

    public Empleado(int numInterno, String nombre, String apellido, String DNI, int estado, int telefono, String diagrama) {
        this.numInterno = numInterno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estado = estado;
        this.telefono = telefono;
        this.diagrama = diagrama;
    }

    public int getNumInterno() {
        return numInterno;
    }

    public void setNumInterno(int numInterno) {
        this.numInterno = numInterno;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDiagrama() {
        return diagrama;
    }

    public void setDiagrama(String diagrama) {
        this.diagrama = diagrama;
    }
    

}
