
package Datos;

import Entidades.EMedicamento;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Medicamento {
    
   public ArrayList<EMedicamento> listarMedicamentos() throws SQLException{
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    Conexion con = new Conexion();
    String sql;
    ArrayList<EMedicamento> lista = new ArrayList();
    sql = "Select from medicamento";
    cn = con.getConnection();
    st = cn.createStatement();
    rs = st.executeQuery(sql);
        while ( rs.next() ){
            EMedicamento med = new EMedicamento();
            try{
            med.setIdMedicamento(rs.getInt("Id_Medicamento"));
            med.setNombre(rs.getString("Nombre"));
            med.setDescripcion(rs.getString("Descripcion"));
            med.setMarca(rs.getString("Marca"));
            } catch (SQLException ex) {
                Logger.getLogger(Medicamento.class.getName()).log(Level.SEVERE, null, ex);
            }
            lista.add(med);
        }       
        return lista;
   }
   
   public void registrarMedicamento (EMedicamento med) throws SQLException{
        Connection cn = null;
        Statement st = null;
        String sql;
        Conexion con = new Conexion();
        sql = "insert into medicamento ( Id_Medicamento, "
                + "nombre, descripcion, marca )" 
                + "values (" + med.getIdMedicamento()
                +  ",'" + med.getNombre()
                +  "','" + med.getDescripcion()
                +  "','" + med.getMarca() + "')";
        try {
            cn = con.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        st = cn.createStatement();
        st.executeUpdate(sql);
        
        cn.close();        
    }
}
