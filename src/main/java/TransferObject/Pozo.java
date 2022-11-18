package TransferObject;

public class Pozo {

    private int cantidadExtraida;  //aca habria que especificar el tipo de producto, no?
    // private String tipoProducto; //codificado. 1=agua sucia, 0=petroleummm O suponemos todo petroleo?
    private String equipo;
    private int estadoPozo;
    private String nombreSuYacimiento;   //cambiar a pozo

    
    public Pozo(){
        this.cantidadExtraida = 0;
        this.equipo = "";
        this.estadoPozo = 0;
        this.nombreSuYacimiento = "";
    }
    
    public Pozo(int cantidadDeProductoExtraido, String equipo, int estadoPozo, String nombreSuYacimiento) {
        this.cantidadExtraida = cantidadDeProductoExtraido;
        this.equipo = equipo;
        this.estadoPozo = estadoPozo;
        this.nombreSuYacimiento = nombreSuYacimiento;
    }

    public int getEstado() {
        return estadoPozo;
    }

    public void setEstado(int estadoPozo) {
        this.estadoPozo = estadoPozo;
    }

    public String getNombreSuYacimiento() {
        return nombreSuYacimiento;
    }

    public void setNombreSuYacimiento(String nomrbeSuYacimiento) {
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
