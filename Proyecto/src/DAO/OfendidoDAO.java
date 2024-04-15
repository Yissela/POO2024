/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.ofendido;
import proyecto.data;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Dimas
 */
public class OfendidoDAO {
    
    private data conexion;
    
    public OfendidoDAO(data conexion){
            this.conexion = conexion;
    }
  
    

    
    public void guardar(ofendido o) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(o.getId()).equals(" ") ){
            sql = "";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
   
   
}
