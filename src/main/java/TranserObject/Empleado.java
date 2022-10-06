package TranserObject;

public class Empleado {
    private String nombre;
    private String apellido;
    private String DNI;
    private int estado;
    private String diagrama;
    private String telefono;
    private int numInterno;

    public Empleado(){
        this.nombre="null";
        this.apellido="null";
        this.DNI="null";
        this.estado=0;
        this.diagrama="null";
        this.telefono="null";
        this.numInterno=0;
    }
    
    public Empleado(String nombre,String apellido,String DNI,int estado, String diagrama, String telefono, int numInterno){
        this.nombre=nombre;
        this.apellido=apellido;
        this.DNI=DNI;
        this.estado=estado;
        this.diagrama=diagrama;
        this.telefono=telefono;
        this.numInterno=numInterno;
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

    public String getDiagrama() {
        return diagrama;
    }

    public void setDiagrama(String diagrama) {
        this.diagrama = diagrama;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumInterno() {
        return numInterno;
    }

    public void setNumInterno(int numInterno) {
        this.numInterno = numInterno;
    }
    
    
}
