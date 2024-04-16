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
        if(!String.valueOf(e.getIdExpediente()).equals(" ") ){
            sql = "INSERT INTO public.expediente(\n" +
"	n_expediente, breve_narracion, estado_expe, fecha, delito)\n" +
"	VALUES ('"+e.getIdExpediente()+"', '"+e.getBreveNarracion()+"', '"+e.getEstadoExpediente()+"','"+ e.getFecha()+"','" +e.getDelitos()+"');";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
    
     public void guardarOfendido(expediente e) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(e.getIdExpediente()).equals(" ") ){
            sql = "INSERT INTO public.expe_ofendido(\n" +
"	\"id_expeOfen\", n_expediente, id_ofendido)\n" +
"	VALUES ('"+e.getIdOfendido()+"','"+e.getIdExpediente()+"','"+e.getIdOfendido()+"');";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
     
      public void guardarDenunciante(expediente e) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(e.getIdExpediente()).equals(" ") ){
            sql = "";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
    
       public void guardarDenunciado(expediente e) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(e.getIdExpediente()).equals(" ") ){
            sql = "";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
    
}
