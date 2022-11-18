package TransferObject;

public class Camion {
    private String fechaInicioServicio;
    private String fechaFinServicio;
    private String mercancia;
    private String horasServicio;
    private String tipoCamion;

    public Camion() {
        this.fechaInicioServicio = "null";
        this.fechaFinServicio = "null";
        this.mercancia = "null";
        this.horasServicio = "null";
    }

    public Camion(String fechaInicioServicio, String fechaFinServicio, String mercancia,String tipoCamion, String horasServicio) {
        this.fechaInicioServicio = fechaInicioServicio;
        this.fechaFinServicio = fechaFinServicio;
        this.mercancia = mercancia;
        this.horasServicio = horasServicio;
        this.tipoCamion = tipoCamion;
    }

    public String getFechaInicioServicio() {
        return fechaInicioServicio;
    }

    public void setFechaInicioServicio(String fechaInicioServicio) {
        this.fechaInicioServicio = fechaInicioServicio;
    }

    public String getFechaFinServicio() {
        return fechaFinServicio;
    }

    public void setFechaFinServicio(String fechaFinServicio) {
        this.fechaFinServicio = fechaFinServicio;
    }

    public String getMercancia() {  //La empresa le dice mercancia???
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    public String getHorasServicio() {
        return horasServicio;
    }

    public void setHorasServicio(String horasServicio) {
        this.horasServicio = horasServicio;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

}
