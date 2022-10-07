
package TransferObject;

public class Supervisor extends Empleado {
    private String usuario;
    private String contraseña;

    public Supervisor() {
        super();
        this.usuario = "null";
        this.contraseña = "null";
    }

    public Supervisor(String usuario, String contraseña, String nombre, String apellido, String DNI, int estado,
            String diagrama, String telefono, int numInterno) {
        super(nombre, apellido, DNI, estado, diagrama, telefono, numInterno);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
