package TransferObject;

public class Pozo {

    private int cantidadExtraida;  //aca habria que especificar el tipo de producto, no?
    // private String tipoProducto; //codificado. 1=agua sucia, 0=petroleummm O suponemos todo petroleo?
    private String equipo;
    private int estado;
    private String nombreSuYacimiento;

    
    public Pozo(){
        this.cantidadExtraida = 0;
        this.equipo = "";
        this.estado = 0;
        this.nombreSuYacimiento = "";
    }
    
    public Pozo(int cantidadDeProductoExtraido, String equipo, int estado, String nomrbeSuYacimiento) {
        this.cantidadExtraida = cantidadDeProductoExtraido;
        this.equipo = equipo;
        this.estado = estado;
        this.nombreSuYacimiento = nomrbeSuYacimiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNomrbeSuYacimiento() {
        return nombreSuYacimiento;
    }

    public void setNomrbeSuYacimiento(String nomrbeSuYacimiento) {
        this.nombreSuYacimiento = nomrbeSuYacimiento;
    }

    public int getCantidadDeProductoExtraido() {
        return cantidadExtraida;
    }

    public void setCantidadDeProductoExtraido(int cantidadDeProductoExtraido) {
        this.cantidadExtraida = cantidadDeProductoExtraido;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

}
