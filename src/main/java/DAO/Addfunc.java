package DAO;

import BusinessObject.ManagerMaquina;
import TransferObject.Maquina;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Addfunc implements Add {

    protected Vector<Maquina> aDatos = new Vector();
    ManagerMaquina mm = new ManagerMaquina();
    ArrayList<Maquina> listadeMaquinas = new ArrayList<Maquina>();
    Maquina maquinaAux = new Maquina();

    public Addfunc(String nombreyac) {
        this.llenar(nombreyac);
    }

    @Override
    public Iteratorr createIterator() {
        return new IteratorFunc(this);
    }

    public void llenar(String nombreyac) {
        listadeMaquinas= mm.listarmaquinas(nombreyac);
        aDatos = new Vector <Maquina>(listadeMaquinas.size());
        int i=0;
        while (i < listadeMaquinas.size()) {

            aDatos.add(listadeMaquinas.get(i));
            i++;}
        i=0;

    }

}
