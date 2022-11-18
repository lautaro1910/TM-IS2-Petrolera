package DAO;

import ConectionBD.Conection_BD;
import TransferObject.Yacimiento;

import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class YacimientoDAO {

    private Conection_BD db;
    private Set<Yacimiento> listaYacimientos = new HashSet<Yacimiento>();

    public YacimientoDAO() {
        db = Conection_BD.getInstance();
    }

    public Set<Yacimiento> getListaYacimientos() {
        return listaYacimientos;
    }

    public void agregarYacimiento(Yacimiento yacimiento) {
        this.listaYacimientos.add(yacimiento);
    }

    public void setListaYacimientos(Set<Yacimiento> listaYacimientos) {
        this.listaYacimientos = listaYacimientos;
    }

    public Set getDAO() {
        try {
            listaYacimientos.clear();
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM public.yacimiento ORDER BY nombreyacimiento";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            Yacimiento yacimiento;

            if (resultSet != null) {
                while (resultSet.next()) {
                    yacimiento = new Yacimiento(resultSet.getString("nombreyacimiento"),
                            resultSet.getString("localizacionorigen"),
                            resultSet.getInt("estadoyacimiento"),
                            resultSet.getInt("idyacimiento"));
                    this.listaYacimientos.add(yacimiento);
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());// mostrar el Error
        }
        return this.listaYacimientos;
    }

    public Yacimiento getDAO(String nombreYacimiento) {
        Yacimiento yacimiento = null;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM yacimiento WHERE nombreYacimiento=" + nombreYacimiento;
            this.db.conectar();

            resultSet = this.db.queryR(consulta);
            if (resultSet != null && resultSet.next()) {
                yacimiento = new Yacimiento(resultSet.getString("localizacionOrigen"),
                        resultSet.getString("nombreYacimieto"), resultSet.getInt("estadoYacimiento"),
                        resultSet.getInt("idYacimiento"));
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());// mostrar el Error
        }
        return yacimiento;
    }

    public void create(Yacimiento yacimiento) {
        try {
            this.db.conectar();
            if (db.ifExists("SELECT 1 FROM yacimiento where yacimiento.nombreyacimiento = ?;", yacimiento.getNombreYacimiento())) {
                JOptionPane.showMessageDialog(null, "Error, ya existe el yacimiento!");
            } else {
                String sentenciaSQL = new String();
                sentenciaSQL = "INSERT INTO public.yacimiento(nombreYacimiento, localizacionOrigen, estadoYacimiento)";
                sentenciaSQL = sentenciaSQL + " VALUES ('" + yacimiento.getNombreYacimiento() + "','"
                        + yacimiento.getLocalizacionOrigen() + "'," + yacimiento.getEstadoYacimiento() + ")";
                this.db.statement(sentenciaSQL);
                JOptionPane.showMessageDialog(null, "Operacion exitosa!");
                sentenciaSQL = null;
            }

            this.db.cerrarConexion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }

    public void delete(String nombreYacimiento) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            sentenciaSQL = "DELETE FROM yacimiento WHERE nombreYacimiento = " + nombreYacimiento + ";";
            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }
}
