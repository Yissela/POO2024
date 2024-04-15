/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.denunciado;

import proyecto.data;

/**
 *
 * @author Dimas
 */
public class DenunciadoDAO {
    
      private data conexion;

    public DenunciadoDAO(data conexion) {
        this.conexion = conexion;
    }
    
    
    public void guardar(denunciado de) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(de.getId()).equals("") ){
        sql = "";
            
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
    
}
