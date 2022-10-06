
package BusinessObject;
import TranserObject.Yacimiento;

public class ManagerYacimiento {
    public Yacimiento ingresoDatos(String localizacion,int estadoYacimiento, String nombreYacimiento){
        Yacimiento yacimiento = new Yacimiento();

        yacimiento.setLocalizacionOrigen(localizacion);
        yacimiento.setEstadoYacimiento(estadoYacimiento);
        yacimiento.setNombreYacimiento(nombreYacimiento);

        return yacimiento;
    }

    public Yacimiento pasoDatos(Yacimiento yacimiento){
        Yacimiento yacimientoAux = new Yacimiento();

        yacimientoAux.setLocalizacionOrigen(yacimiento.getLocalizacionOrigen());
        yacimientoAux.setEstadoYacimiento(yacimiento.getEstadoYacimiento());
        yacimientoAux.setNombreYacimiento(yacimiento.getNombreYacimiento());

        return yacimientoAux;
    }
}