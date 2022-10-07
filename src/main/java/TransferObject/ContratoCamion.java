package TransferObject;

public class ContratoCamion {
    private String nombreDueño;
    private String fechaInicioContrato;
    private String fechaFinContrato;
    private float montoAlquiler;

    public ContratoCamion() {
        this.nombreDueño = "null";
        this.fechaInicioContrato = "null";
        this.fechaFinContrato = "null";
        this.montoAlquiler = 0;
    }

    public ContratoCamion(String nombreDueño, String fechaInicioContrato, String fechaFinContrato, int montoAlquiler) {
        this.nombreDueño = nombreDueño;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
        this.montoAlquiler = montoAlquiler;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(String fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public float getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(float montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

}
