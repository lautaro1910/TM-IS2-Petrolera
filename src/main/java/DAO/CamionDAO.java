package DAO;
import ConectionBD.Conection_BD;
import TransferObject.Camion;
import TransferObject.Pozo;

import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class CamionDAO {
     private Conection_BD db;
    private Set<Camion> listaCamion = new HashSet<Camion>();

    public CamionDAO() {
        db = Conection_BD.getInstance();
    }

    public Set<Camion> getListaCamion() {
        return listaCamion;
    }

    public void agregarPozo(Camion camion) {
        this.listaCamion.add(camion);
    }

    public void setListaCamion(Set<Camion> listaCamion) {
        this.listaCamion = listaCamion;
    }

    public Set getDAO() {
        try {
            listaCamion.clear();
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM camion";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            Camion camion;

            if (resultSet != null) {
                while (resultSet.next()) {
                    camion = new Camion(
                    resultSet.getString("fechainicioservicio"),
                    resultSet.getString("fechafinservicio"),
                            resultSet.getString("mercancia"),
                            resultSet.getString("tipocamion"),
                            resultSet.getString("horasfuncionamiento"));
                    this.listaCamion.add(camion);
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());// mostrar el Error
        }
        return this.listaCamion;
    }
    
       
        public Camion getDAOCamion(int idCamion) {
             Camion camion = null;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM camion WHERE id=" + "'" + idCamion + "'" + ";";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            if (resultSet != null) {
                while (resultSet.next()) {
                    camion = new Camion(
                            resultSet.getString("fechainicioservicio"),
                            resultSet.getString("fechafinservicio"),
                            resultSet.getString("mercancia"),
                            resultSet.getString("tipocamion"),
                            resultSet.getString("horasfuncionamiento"));
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return camion;
    }

    public void create(Camion camion) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            sentenciaSQL = "INSERT INTO camion( fechainicioservicio, fechafinservicio, mercancia, tipocamion, horasfuncionamiento)";
            sentenciaSQL = sentenciaSQL + 
                    " VALUES (" + camion.getFechaInicioServicio() + ",'" + 
                    camion.getFechaFinServicio() +"','" 
                    + camion.getMercancia() + "','" 
                    + camion.getTipoCamion() + "','"
                    + camion.getHorasServicio() + "')"; //si falla corregir comillas IMPORTANTE
            
            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }

    public void delete(int id) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            sentenciaSQL = "DELETE FROM camion WHERE id = " + id + ";";
            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }
}
