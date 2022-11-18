package DAO;

import ConectionBD.Conection_BD;
import TransferObject.Camion;
import TransferObject.Chofer;
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
                    pozo = new Pozo(resultSet.getInt("cantidadextraida"), resultSet.getString("equipo"), resultSet.getInt("estadoPozo"), resultSet.getString("nombreYacimiento"));
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

    public void ingresarCantExtraida(String namePozo, int cantExtraida) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();

            sentenciaSQL = "UPDATE pozo SET cantidadextraida = pozo.cantidadextraida + " + cantExtraida + "WHERE equipo =" + "'" + namePozo + "'" + ";";

            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();

            JOptionPane.showMessageDialog(null, "Operacion exitosa");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }

    public Set getPozosDeYac(String nombreSuYacimiento) {
        try {
            listaPozos.clear();
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM pozo WHERE nombreyacimiento=" + "'" + nombreSuYacimiento + "'" + ";";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);

            Pozo pozo;

            if (resultSet != null) {
                while (resultSet.next()) {
                    pozo = new Pozo(resultSet.getInt("cantidadextraida"), resultSet.getString("equipo"), resultSet.getInt("estadopozo"), resultSet.getString("nombreyacimiento"));
                    this.listaPozos.add(pozo);
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());// mostrar el Error
        }
        return listaPozos;
    }

    public void create(Pozo pozo) {
        try {
            this.db.conectar();
            if (db.ifExists("SELECT 1 FROM pozo where pozo.equipo = ?;", pozo.getEquipo())) {
                JOptionPane.showMessageDialog(null, "Error, ya existe el pozo!");
            } else {
                
                String sentenciaSQL = new String();
                sentenciaSQL = "INSERT INTO pozo(cantidadextraida, equipo, estadoPozo, nombreYacimiento)";
                sentenciaSQL = sentenciaSQL + " VALUES (" + pozo.getCantidadDeProductoExtraido() + ",'" + pozo.getEquipo()
                        + "','" + pozo.getEstado() + "','" + pozo.getNombreSuYacimiento() + "')"; //si falla corregir comillas IMPORTANTE

                this.db.statement(sentenciaSQL);
                JOptionPane.showMessageDialog(null, "Operacion exitosa!");
                sentenciaSQL = null;
                
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }

    public void createIngreso(int chofer, int camion, String fecha) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();

            sentenciaSQL = "INSERT INTO ingreso(fechaingreso, nrointerno, idcamion)";
            sentenciaSQL = sentenciaSQL + " VALUES ('" + fecha + "','" + chofer + "','" + camion + "')"; //si falla corregir comillas IMPORTANTE

            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();

            JOptionPane.showMessageDialog(null, "Registro exitoso");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }

    /*public int controlIngreso(int camion, String fecha){
        int res = 0;
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            sentenciaSQL = "SELECT * from ingreso where idcamion = "+camion+" and fechaingreso = "+fecha+";";
            this.db.statement(sentenciaSQL);
            if (sentenciaSQL != null){
                res = 1;
                System.out.println("sadasdasdasdasfdsfd");
            }
            sentenciaSQL = null;
            this.db.cerrarConexion();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
        return res;
    }*/
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
