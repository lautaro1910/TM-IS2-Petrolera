package BusinessObject;

import DAO.PozoDAO;
import TransferObject.Camion;
import TransferObject.Chofer;
import TransferObject.Pozo;
import java.util.Set;

public class ManagerPozo {

    PozoDAO pd = new PozoDAO();

    public Pozo ingresoDatos(int cantidadDeProductoExtraido, String equipo, int estadoPozo, String nombreYacimiento) {
        Pozo pozo = new Pozo();

        pozo.setCantidadDeProductoExtraido(cantidadDeProductoExtraido);
        pozo.setEquipo(equipo);
        pozo.setEstado(estadoPozo);
        pozo.setNombreSuYacimiento(nombreYacimiento);

        return pozo;
    }

    /*public Pozo pasoDatos(Pozo pozo) {
        Pozo pozoAux = new Pozo();

        pozoAux.setCantidadDeProductoExtraido(pozo.getCantidadDeProductoExtraido());
        pozoAux.setEquipo(pozo.getEquipo());

        return pozoAux;
    }*/
    public void modifyCantExtraida(String namePozo, int cantExtraida) {
        pd.ingresarCantExtraida(namePozo, cantExtraida);
    }

    public void pasoDatos(Pozo pozo) {
        pd.create(pozo);
    }

    public void registroIngreso(int camion, int chofer, String fecha) {
        pd.createIngreso(camion, chofer, fecha);
    }

    public Set obtengoLista() {
        Set listaObtenida = pd.getDAO();
        return listaObtenida;
    }

    public Set obtengoListaYac(String nombreYac) {
        Set listaObtenida = pd.getPozosDeYac(nombreYac);
        return listaObtenida;
    }

    /*public int control(int camion, String fecha){
        int res = 0;
        res= pd.controlIngreso(camion, fecha);
        return res;
    }*/
}
