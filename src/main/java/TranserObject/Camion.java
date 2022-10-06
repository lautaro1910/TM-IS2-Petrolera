package TranserObject;

enum TipoCamion{
    porta, carreton, chupa, grua, batea, tracker;
}
public class Camion {
    private String fechaInicioServicio;
    private String fechaFinServicio;
    private String mercancia;
    private String horasServicio;
    private TipoCamion tipoCamion;

    public Camion(){
        this.fechaInicioServicio="null";
        this.fechaFinServicio="null";
        this.mercancia="null";
        this.horasServicio="null";
    }
    
    public Camion(String fechaInicioServicio,String fechaFinServicio,String mercancia,String horasServicio,TipoCamion tipoCamion){
        this.fechaInicioServicio=fechaInicioServicio;
        this.fechaFinServicio=fechaFinServicio;
        this.mercancia=mercancia;
        this.horasServicio=horasServicio;
        this.tipoCamion=tipoCamion;
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

    public String getMercancia() {
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

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
    
}
