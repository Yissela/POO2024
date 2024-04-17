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
import model.expeDenunciado;
import model.expeDenunciante;
import model.expeOfendido;
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
    
     public void guardarOfendido(expeOfendido e) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(e.getIdExpeOfendido()).equals(" ") ){
            sql = "INSERT INTO public.expe_ofendido(\n" +
"	\"id_expeOfen\", n_expediente, id_ofendido)\n" +
"	VALUES ('"+e.getIdExpeOfendido()+"','"+e.getIdNumExpe()+"','"+e.getIdOfendidoExpe()+"');";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
     
      public void guardarDenunciante(expeDenunciante e) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(e.getIdExpeDenunciante()).equals(" ") ){
            sql = "INSERT INTO public.expe_denunciante(\n" +
"	\"id_expeDenu\", n_expediente, id_denunciante)\n" +
"	VALUES ('"+e.getIdExpeDenunciante()+"','"+e.getIdNumExpe()+"','"+e.getIdDenuncianteExpe()+"');";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
    
       public void guardarDenunciado(expeDenunciado e) throws SQLException{
    
        String sql = null;
        if(!String.valueOf(e.getIdExpeDenunciado()).equals(" ") ){
            sql = "INSERT INTO public.expe_detenido(\n" +
"	\"id_expeDete\", n_expediente, id_detenido)\n" +
"	VALUES ('"+e.getIdExpeDenunciado()+"','"+e.getIdNumExpe()+"','"+e.getIdDenunciaExpe()+"');";
        }
    PreparedStatement pst = this.conexion.getConexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    pst.executeUpdate();
    
    
    }
    
}
