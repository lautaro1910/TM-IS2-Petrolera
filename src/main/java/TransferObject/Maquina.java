package TransferObject;

enum EstadoMaquina {
    funcionamiento, mantenimiento, fueraDeServicio;
}

public class Maquina {
    private String estadoMaquina;
    private String nombreMaquina;
    private int idMaquinaria;

    public Maquina() {
        this.nombreMaquina = "null";
    }

    public Maquina(String estadoMaquina, String nombreMaquina, int idMaquinaria) {
        this.estadoMaquina = estadoMaquina;
        this.nombreMaquina = nombreMaquina;
        this.idMaquinaria = idMaquinaria;
    }
    
    public int getIdMaquina(){
        return idMaquinaria;
    }

    public String getEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(String estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public String getNombreMaquina() {
        return nombreMaquina;
    }

    public void setNombreMaquina(String nombreMaquina) {
        this.nombreMaquina = nombreMaquina;
    }

}
