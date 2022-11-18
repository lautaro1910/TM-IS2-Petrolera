package DAO;

import ConectionBD.Conection_BD;
import TransferObject.Camion;
import TransferObject.Chofer;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

public class ChoferDAO {
    private Conection_BD db;
    private List<Integer> listaUnida = new ArrayList<>();

    public ChoferDAO() {
        db = Conection_BD.getInstance();
    }

    public List<Integer> getListaUnida() {
        return listaUnida;
    }

    public void setListaUnida(List<Integer> listaUnida) {
        this.listaUnida = listaUnida;
    }
    
 //SELECT * from chofer, camion WHERE nrointerno = 100 AND id = 1000   
    public List getChoferCamion(int nroInterno,int nroID) {
        try {
            //listaChofer.clear();
            Chofer chofer;
            Camion camion;
            
            ResultSet resultSet = null;
            
            String consulta = "SELECT * FROM chofer , camion WHERE nrointerno=" + "" + nroInterno + "AND id= " + "" + nroID + ";";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
 
            if (resultSet != null) {
                while (resultSet.next()) {
                    //Chofer(int numInterno, String nombre, String apellido, int DNI, int estado, int telefono, String diagrama) 
                 /*   chofer = new Chofer(
                         
                            resultSet.getInt("nrointerno"), 
                            resultSet.getString("nombrechofer"),
                            resultSet.getString("apellidochofer"),
                            resultSet.getString("dni"),
                            resultSet.getInt("telefono"),
                            resultSet.getInt("estadochofer"),
                            resultSet.getString("diagramachofer"));*/
                   /* camion = new Camion(
                    resultSet.getString("fechainicioservicio"),
                            resultSet.getString("fechafinservicio"),
                            resultSet.getString("mercancia"),
                            resultSet.getString("tipocamion"),
                            resultSet.getString("horasfuncionamiento"));*/
                    //error con el tipo enum
                    this.listaUnida.add(nroInterno); //Pos 0 chofer
                    this.listaUnida.add(nroID); //Pos 1 camion
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());// mostrar el Error
        }
        return listaUnida;
    }
 
  
        public Chofer getDAOChofer(int nroInterno) {
         Chofer chofer = null;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM chofer WHERE nroInterno=" + "'" + nroInterno + "'" + ";";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            if (resultSet != null) {
                while (resultSet.next()) {
                    chofer = new Chofer( 
                            resultSet.getInt("nrointerno"), 
                            resultSet.getString("nombrechofer"),
                            resultSet.getString("apellidochofer"),
                            resultSet.getString("dni"),
                            resultSet.getInt("estadochofer"),
                            resultSet.getInt("telefono"),
                            resultSet.getString("diagramachofer"));
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return chofer;
    }
        

    public void create(Chofer chofer) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            
            sentenciaSQL = "INSERT INTO chofer(nombrechofer, apellidochofer, dni, telefono, estadochofer, diagramachofer)";
            sentenciaSQL = sentenciaSQL + " VALUES (" + chofer.getNombre() + ",'" + chofer.getApellido()
                    +"','" + chofer.getDNI() + "','" + chofer.getTelefono() + "','" +chofer.getEstado()+ "','" +chofer.getDiagrama() + "')"; //si falla corregir comillas IMPORTANTE
            
            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }

    public void delete(int nroInterno) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            
            sentenciaSQL = "DELETE FROM chofer WHERE nrointerno = " + nroInterno + ";";
            
            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }
}
