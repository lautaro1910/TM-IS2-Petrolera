
package TransferObject;

public class JefeDeArea extends Empleado {
    private String usuario;
    private String contraseña;

    public JefeDeArea() {
        super();
        this.usuario = "null";
        this.contraseña = "null";
    }

    public JefeDeArea(String usuario, String contraseña, String nombre, String apellido, String DNI, int estado,
            String diagrama, String telefono, int numInterno) {
        super(numInterno, nombre, apellido, DNI, estado, estado, diagrama);
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
