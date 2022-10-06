/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectionBD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conection_BD {
    private static Conection_BD INSTANCE = null;
    private Connection conexion = null;
    //private String servidor;
    private String BD_NAME;
    private String BD_USER;
    private String BD_PWD;
    private String BD_URL;
    
    private String query;
    private int id_insertado;
    private Statement sentencia = null;

 
private Conection_BD(){
   // servidor = "localhost";
    BD_NAME = "TSB";
    BD_USER = "postgres";
    BD_PWD = "Admin";
    BD_URL = "jdbc:postgresql://localhost:5432/" + BD_NAME;
    
}
private static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Conection_BD();
        }
    }

    public static Conection_BD getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        
        return INSTANCE;
    }


public void conectar(){
    try {
            conexion = DriverManager.getConnection(BD_URL, BD_USER, BD_PWD);
            System.out.println("Conexion a Base de Datos " + BD_URL + " . . . . .Ok");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar la Base de Datos" + ex);
        }
    }
public void cerrarConexion() {
        try {
              this.conexion.close();
              System.out.println("Cerrando conexion a " + BD_URL + " . . . . . Ok");
            } catch (Exception errorCONN) {
                errorCONN.printStackTrace();
            }
    }
public int query(String consulta) {
        int r = 0;
        try {
            this.query = consulta;
            Statement stmt = this.conexion.prepareStatement(this.query, Statement.RETURN_GENERATED_KEYS);
            r = stmt.executeUpdate(this.query);

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                this.id_insertado = rs.getInt(1);
            }
        } catch (SQLException ex) {
        }
        return r;
    }

        public ResultSet queryR(String consulta) throws SQLException {
        ResultSet r = null;
        
            this.query = consulta;
            PreparedStatement stmt = this.conexion.prepareStatement(this.query);
            r = stmt.executeQuery();
        
        return r;
    }

    public void statement(String sentenciaSQL){
    try {
        sentencia=conexion.createStatement();
        sentencia.execute(sentenciaSQL);          
        
    } catch (SQLException ex) {
        Logger.getLogger(Conection_BD.class.getName()).log(Level.SEVERE, null, ex);
    }     
}

}