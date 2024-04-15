/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.delito;
import proyecto.data;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Dimas
 */
public class DelitoDAO {
    
     private data conexion;

    public DelitoDAO(data conexion) {
        this.conexion = conexion;
    }
    
    
    public void guardar(delito d) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(d.getId_delito()).equals("") ){
        sql = "INSERT INTO public.delito(\n" +
"	id_delito, nombre)\n" +
"	VALUES ('" + d.getId_delito() + "','" + d.getNombre() + "');";
            
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
    
    
}
