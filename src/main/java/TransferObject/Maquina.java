package TransferObject;

enum EstadoMaquina {
    funcionamiento, mantenimiento, fueraDeServicio;
}

public class Maquina {
    private EstadoMaquina estadoMaquina;
    private String nombreMaquina;

    public Maquina() {
        this.nombreMaquina = "null";
    }

    public Maquina(EstadoMaquina estadoMaquina, String nombreMaquina) {
        this.estadoMaquina = estadoMaquina;
        this.nombreMaquina = nombreMaquina;
    }

    public EstadoMaquina getEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(EstadoMaquina estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public String getNombreMaquina() {
        return nombreMaquina;
    }

    public void setNombreMaquina(String nombreMaquina) {
        this.nombreMaquina = nombreMaquina;
    }

}
