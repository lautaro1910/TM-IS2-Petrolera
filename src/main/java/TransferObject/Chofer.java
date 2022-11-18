package TransferObject;

import java.util.ArrayList;

public class Chofer extends Empleado {

    private ArrayList<Camion> camion = new ArrayList();
    
    public Chofer() {
        super();
    }

    public Chofer(int numInterno, String nombre, String apellido, String DNI, int estado, int telefono, String diagrama) {
        super(numInterno, nombre, apellido, DNI, estado, telefono, diagrama);
    }
}
