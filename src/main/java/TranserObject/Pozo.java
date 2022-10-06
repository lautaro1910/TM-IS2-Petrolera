
package TranserObject;

public class Pozo {
    private String cantidadDeProductoExtraido;
    private String equipo;

    public Pozo(){
        this.cantidadDeProductoExtraido="null";
        this.equipo="null";
    }
    
    public Pozo(String cantidadDeProductoExtraido,String equipo){
        this.cantidadDeProductoExtraido=cantidadDeProductoExtraido;
        this.equipo=equipo;
    }
    
    public String getCantidadDeProductoExtraido() {
        return cantidadDeProductoExtraido;
    }

    public void setCantidadDeProductoExtraido(String cantidadDeProductoExtraido) {
        this.cantidadDeProductoExtraido = cantidadDeProductoExtraido;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
}
