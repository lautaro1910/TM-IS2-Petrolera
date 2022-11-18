/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessObject;

import DAO.ChoferDAO;
import TransferObject.Chofer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */

   public class ManagerChofer {
     ChoferDAO chd = new ChoferDAO();

    public List<Integer> obtengoListaChoferXCamion(int nroInterno,int nroID){
        List<Integer> listaObtenida = new ArrayList<>();
               listaObtenida = chd.getChoferCamion(nroInterno, nroID);
        return listaObtenida;
    }
    
    public Chofer obtengoChofer(int nroInterno){
        Chofer chofer=chd.getDAOChofer(nroInterno);
        return chofer;
    }  
    
    

    
}
