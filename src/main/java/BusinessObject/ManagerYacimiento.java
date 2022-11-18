
package BusinessObject;

import DAO.YacimientoDAO;
import TransferObject.Yacimiento;
import java.util.Set;

public class ManagerYacimiento {
    YacimientoDAO yd = new YacimientoDAO();
    
    public Yacimiento ingresoDatos(String localizacion, int estadoYacimiento, String nombreYacimiento) {
        Yacimiento yacimiento = new Yacimiento();

        yacimiento.setLocalizacionOrigen(localizacion);
        yacimiento.setEstadoYacimiento(estadoYacimiento);
        yacimiento.setNombreYacimiento(nombreYacimiento);
        
        return yacimiento;
    }

    public void pasoDatos(Yacimiento yacimiento) {
        yd.create(yacimiento);

    }
    
    public Set obtengoLista(){
        Set listaObtenida=yd.getDAO();
        
        return listaObtenida;
    }
}