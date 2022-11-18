/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessObject;

import DAO.CamionDAO;
import TransferObject.Camion;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class ManagerCamion {
    
    CamionDAO cd = new CamionDAO();
    
     public Camion obtengoCamion(int id){
        Camion camion = cd.getDAOCamion(id);
        return camion;
    }  
     
    public Set obtengoLista(){
        
        Set listaObtenida=cd.getDAO();
        
        return listaObtenida;
    
    }
}
