
package Datos;

import Entidades.EReceta;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Receta {
    
   public ArrayList<EReceta> listarReceta() throws SQLException{
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    Conexion con = new Conexion();
    String sql;
    ArrayList<EReceta> lista = new ArrayList();
    sql = "Select from Receta";
    cn = con.getConnection();
    st = cn.createStatement();
    rs = st.executeQuery(sql);
        while ( rs.next() ){
            EReceta rec = new EReceta();
            try{
            rec.setIdReceta(rs.getInt("Id_Receta"));
            rec.setCantidad(rs.getInt("Cantidad"));
            rec.setInstrucciones(rs.getString("Instrucciones"));
            } catch (SQLException ex) {
                Logger.getLogger(Receta.class.getName()).log(Level.SEVERE, null, ex);
            }
            lista.add(rec);
        }       
        return lista;
   }
   
 public void registrarReceta(EReceta rec) throws SQLException {

        Connection cn = null;
        Statement st = null;
        String sql;

        Conexion con = new Conexion();

        sql = "INSERT INTO receta (ID_Receta, ID_Atencion, ID_Medicamento, Cantidad, Instrucciones) " + 
              "VALUES (" + rec.getIdReceta() + "," 
              + rec.getIdAtencion() + ","  
              + rec.getIdMedicamento() + ","
              + rec.getCantidad() + ",'"  
              + rec.getInstrucciones() + "')";
        
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Receta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(st != null) {
                st.close();
            }
            if(cn != null) {
                cn.close();
            }
        }

    }
}