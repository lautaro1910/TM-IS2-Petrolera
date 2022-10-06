
package BusinessObject;
import TranserObject.Pozo;


public class ManagerPozo {
    
    public Pozo ingresoDatos(String cantidadDeProductoExtraido, String equipo){
        Pozo pozo = new Pozo();

        pozo.setCantidadDeProductoExtraido(cantidadDeProductoExtraido);
        pozo.setEquipo(equipo);

        return pozo;
    }
    
    public Pozo pasoDatos(Pozo pozo){
        Pozo pozoAux = new Pozo();

        pozoAux.setCantidadDeProductoExtraido(pozo.getCantidadDeProductoExtraido());
        pozoAux.setEquipo(pozo.getEquipo());

        return pozoAux;
    }    
}
