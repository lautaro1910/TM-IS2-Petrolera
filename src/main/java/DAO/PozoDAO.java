package DAO;

import ConectionBD.Conection_BD;
import TransferObject.Pozo;

import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class PozoDAO {

    private Conection_BD db;
    private Set<Pozo> listaPozos = new HashSet<Pozo>();

    public PozoDAO() {
        db = Conection_BD.getInstance();
    }

    public Set<Pozo> getListaPozos() {
        return listaPozos;
    }

    public void agregarPozo(Pozo pozo) {
        this.listaPozos.add(pozo);
    }

    public void setListaPozos(Set<Pozo> listaPozos) {
        this.listaPozos = listaPozos;
    }

    public Set getDAO() {
        try {
            listaPozos.clear();
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM pozo ORDER BY equipo";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            Pozo pozo;

            if (resultSet != null) {
                while (resultSet.next()) {
                    pozo = new Pozo(resultSet.getInt("cantidadextraida"), resultSet.getString("equipo"), resultSet.getInt("estado"), resultSet.getString("nombreYacimiento"));
                    this.listaPozos.add(pozo);
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());// mostrar el Error
        }
        return this.listaPozos;
    }

    public Pozo getDAO(String equipo) {
        Pozo pozo = null;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM pozo WHERE equipo=" + equipo;
            this.db.conectar();

            resultSet = this.db.queryR(consulta);
            if (resultSet != null && resultSet.next()) {
                pozo = new Pozo(resultSet.getInt("cantidadextraida"), resultSet.getString("equipo"), resultSet.getInt("estado"), resultSet.getString("nombreYacimiento"));
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());// mostrar el Error
        }
        return pozo;
    }

    public void create(Pozo pozo) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            sentenciaSQL = "INSERT INTO pozo(cantidadextraida, equipo, estado, nombreYacimiento)";
            sentenciaSQL = sentenciaSQL + " VALUES (" + pozo.getCantidadDeProductoExtraido() + ",'" + pozo.getEquipo()
                    +"','" + pozo.getEstado() + "','" + pozo.getNomrbeSuYacimiento() + "')"; //si falla corregir comillas IMPORTANTE
            
            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }

    public void delete(String equipo) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            sentenciaSQL = "DELETE FROM pozo WHERE equipo = " + equipo + ";";
            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }
}
