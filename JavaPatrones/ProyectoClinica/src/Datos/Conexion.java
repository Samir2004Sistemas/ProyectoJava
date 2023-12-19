
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private String user;
    private String pass;
    private String ruta;
    private Connection con;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Conexion() {
        this.user = "root";
        this.pass = "";
        this.con = null;
        this.ruta = "jdbc:mysql://localhost:3306/clinica";
        
    }

    public Conexion(String user, String pass, String ruta, Connection con) {
        this.user = user;
        this.pass = pass;
        this.ruta = ruta;
        this.con = con;
    }

    public Connection getConnection() throws SQLException{
        Connection cn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(this.ruta,
                                            this.user,
                                         this.pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return cn;
    }
    
}

