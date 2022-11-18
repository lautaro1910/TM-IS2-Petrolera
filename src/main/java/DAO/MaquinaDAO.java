/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConectionBD.Conection_BD;
import TransferObject.Maquina;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MaquinaDAO {
    private Conection_BD db;
    private Set<Maquina> listaMaquinas = new HashSet<Maquina>();
    
    public MaquinaDAO() {
        db = Conection_BD.getInstance();
    }
    
    public Set<Maquina> getListaMaquinas() {
        return listaMaquinas;
    }

    public void agregarMaquina(Maquina maquinas) {
        this.listaMaquinas.add(maquinas);
    }

    public void setListaMaquinas(Set<Maquina> listaMaquinas) {
        this.listaMaquinas = listaMaquinas;
    }

    public Set getDAO() {
        try {
            listaMaquinas.clear();
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM public.maquina ORDER BY nombremaquina";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            Maquina maquina;

            if (resultSet != null) {
                while (resultSet.next()) {
                    maquina = new Maquina(resultSet.getString("estadoMaquina"),
                            resultSet.getString("nombreMaquina"), resultSet.getInt("idMaquina"));
                    this.listaMaquinas.add(maquina);
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());// mostrar el Error
        }
        return this.listaMaquinas;
    }

    public Set getDAO(String nombreYacimiento) {
        try {
            listaMaquinas.clear();
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM maquina WHERE nombreyacimiento=" + "'" + nombreYacimiento + "'" + ";";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            Maquina maquina;
            
            if (resultSet != null) {
                while (resultSet.next()) {
                    maquina = new Maquina(resultSet.getString("estadoMaquina"), resultSet.getString("nombreMaquina"), resultSet.getInt("idMaquina"));
                    this.listaMaquinas.add(maquina);
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listaMaquinas;
    }
    private ArrayList <Maquina> listaM = new ArrayList<Maquina>();
     public ArrayList getDAOArray(String nombreYacimiento) {
        try {
            listaM.clear();
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM maquina WHERE nombreyacimiento=" + "'" + nombreYacimiento + "'" + ";";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            Maquina maquina;
            
            if (resultSet != null) {
                while (resultSet.next()) {
                    maquina = new Maquina(resultSet.getString("estadoMaquina"), resultSet.getString("nombreMaquina"), resultSet.getInt("idMaquina"));
                    this.listaM.add(maquina);
                }
                resultSet.close();
            }
            this.db.cerrarConexion();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listaM;
    } 
     
    public void create(Maquina maquina) {
        //no fue pedido
    }

    public void delete(String nombremaquina) {
        try {
            this.db.conectar();
            String sentenciaSQL = new String();
            sentenciaSQL = "DELETE FROM maquina WHERE nombremaquina = " + nombremaquina + ";";
            this.db.statement(sentenciaSQL);
            sentenciaSQL = null;
            this.db.cerrarConexion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos: " + ex);// mostrar el Error
        }
    }
    
}
