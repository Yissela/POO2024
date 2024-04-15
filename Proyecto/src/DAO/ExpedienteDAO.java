/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import proyecto.data;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import model.expediente;


/**
 *
 * @author Dimas
 */
public class ExpedienteDAO {
    
    
     private data conexion;
    
    public ExpedienteDAO(data conexion){
            this.conexion = conexion;
    }
  
    

    
    public void guardar(expediente e) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(e.getnExpediente()).equals(" ") ){
            sql = "";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
    
    
}
