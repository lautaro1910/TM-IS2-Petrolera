package TransferObject;

public class Yacimiento {

    private String localizacionOrigen;
    private int estadoYacimiento;
    private String nombreYacimiento;
    private int idYacimiento;

    public Yacimiento() {
        this.localizacionOrigen = "null";
        this.estadoYacimiento = 0;
        this.nombreYacimiento = "null";
        this.idYacimiento = 0;
    }

    public Yacimiento(String nombreYacimiento, String localizacionOrigen, int estadoYacimiento, int idYacimiento) {
        this.localizacionOrigen = localizacionOrigen;
        this.estadoYacimiento = estadoYacimiento;
        this.nombreYacimiento = nombreYacimiento;
        this.idYacimiento = idYacimiento;
    }

    public int getIdYacimiento() {
        return idYacimiento;
    }

    public void setIdYacimiento(int idYacimiento) {
        this.idYacimiento = idYacimiento;
    }

    public String getLocalizacionOrigen() {
        return localizacionOrigen;
    }

    public void setLocalizacionOrigen(String localizacionOrigen) {
        this.localizacionOrigen = localizacionOrigen;
    }

    public int getEstadoYacimiento() {
        return estadoYacimiento;
    }

    public void setEstadoYacimiento(int estadoYacimiento) {
        this.estadoYacimiento = estadoYacimiento;
    }

    public String getNombreYacimiento() {
        return nombreYacimiento;
    }

    public void setNombreYacimiento(String nombreYacimiento) {
        this.nombreYacimiento = nombreYacimiento;
    }

}
