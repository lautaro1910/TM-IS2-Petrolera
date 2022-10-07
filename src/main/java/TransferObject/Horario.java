
package TransferObject;

public class Horario {
    private String horaIncio;
    private String horaFin;
    private String dia;

    public Horario() {
        this.horaIncio = "null";
        this.horaFin = "null";
        this.dia = "null";
    }

    public Horario(String horaIncio, String horaFin, String dia) {
        this.horaIncio = horaIncio;
        this.horaFin = horaFin;
        this.dia = dia;
    }

    public String getHoraIncio() {
        return horaIncio;
    }

    public void setHoraIncio(String horaIncio) {
        this.horaIncio = horaIncio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

}
