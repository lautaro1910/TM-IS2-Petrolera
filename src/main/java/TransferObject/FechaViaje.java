
package TransferObject;

public class FechaViaje {
    private String diaInicio;
    private String diaFin;
    private String hora;

    public FechaViaje() {
        this.diaInicio = "null";
        this.diaFin = "null";
        this.hora = "null";
    }

    public FechaViaje(String diaIncio, String diaFin, String hora) {
        this.diaInicio = diaIncio;
        this.diaFin = diaFin;
        this.hora = hora;
    }

    public String getDiaIncio() {
        return diaInicio;
    }

    public void setDiaIncio(String diaInicio) {
        this.diaInicio = diaInicio;
    }

    public String getDiaFin() {
        return diaFin;
    }

    public void setDiaFin(String diaFin) {
        this.diaFin = diaFin;
    }

    public String getHora() {
        return hora;
    }

    public void setDia(String hora) {
        this.hora = hora;
    }
}
