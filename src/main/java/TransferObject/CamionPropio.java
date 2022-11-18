package TransferObject;

public class CamionPropio extends Camion {
    private int estadoCamion;

    public CamionPropio() {
        super();
    }
/*
    public CamionPropio(int estadoCamion, String fechaInicioServicio, String fechaFinServicio, String mercancia,
            String horasServicio, TipoCamion tipoCamion) {
        super(fechaInicioServicio, fechaFinServicio, mercancia, horasServicio, tipoCamion);
        this.estadoCamion = estadoCamion;
    }
*/
    public int getEstadoCamion() {
        return estadoCamion;
    }

    public void setEstadoCamion(int estadoCamion) {
        this.estadoCamion = estadoCamion;
    }

}
