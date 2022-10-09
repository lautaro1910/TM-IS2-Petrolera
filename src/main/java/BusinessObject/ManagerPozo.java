
package BusinessObject;

import TransferObject.Pozo;

public class ManagerPozo {

    public Pozo ingresoDatos(int cantidadDeProductoExtraido, String equipo, int estado, String nombreYacimiento) {
        Pozo pozo = new Pozo();

        pozo.setCantidadDeProductoExtraido(cantidadDeProductoExtraido);
        pozo.setEquipo(equipo);
        pozo.setEstado(estado);
        pozo.setNomrbeSuYacimiento(nombreYacimiento);

        return pozo;
    }

    public Pozo pasoDatos(Pozo pozo) {
        Pozo pozoAux = new Pozo();

        pozoAux.setCantidadDeProductoExtraido(pozo.getCantidadDeProductoExtraido());
        pozoAux.setEquipo(pozo.getEquipo());

        return pozoAux;
    }
}
