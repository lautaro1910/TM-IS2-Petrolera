/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessObject;

import DAO.MaquinaDAO;
import TransferObject.Maquina;
import TransferObject.Yacimiento;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class ManagerMaquina {
    MaquinaDAO md = new MaquinaDAO();
      
    public Maquina ingresoDatos(String nombreMaquina, String estadoMaquina) {
        Maquina maquina = new Maquina();

        maquina.setNombreMaquina(nombreMaquina);
        maquina.setNombreMaquina(estadoMaquina);
        
        return maquina;
    }

    public void pasoDatos(Maquina maquina) {
        md.create(maquina);

    }
    
    public ArrayList listarmaquinas(String nombreyacimiento) {
        ArrayList listaObtenida =  md.getDAOArray(nombreyacimiento);
        return listaObtenida;
    }
    
    public Set obtengoLista(String nombreyacimiento){
        Set listaObtenida=md.getDAO(nombreyacimiento);
        
        return listaObtenida;
    }
}
