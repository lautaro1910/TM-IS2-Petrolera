
package TransferObject;

public class Viaje {
    private String lugarOrigen;
    private String lugarDestino;
    private String fechaViaje;

    public Viaje() {
        this.lugarOrigen = "null";
        this.lugarDestino = "null";
        this.fechaViaje = "null";
    }

    public Viaje(String lugarOrigen, String lugarDestino, String fechaViaje) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fechaViaje = fechaViaje;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

}
