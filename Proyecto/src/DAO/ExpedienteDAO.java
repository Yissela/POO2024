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
import java.util.ArrayList;
import java.util.List;
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
       
       
       public List<expediente> getAll() throws SQLException {
       
                List<expediente> lista  = new ArrayList();
                
                expediente e = null;
                
                ResultSet rs = this.conexion.CONSULTAR("SELECT o.id_ofendido, o.nombre, expe.delito, expe.estado_expe, d.id_detenido,d.nombre\n" +
"FROM expediente expe\n" +
"JOIN expe_ofendido ex ON ex.n_expediente = expe.n_expediente\n" +
"JOIN ofendido o ON o.id_ofendido = ex.id_ofendido\n" +
"JOIN expe_detenido exDete ON expe.n_expediente = exDete.n_expediente\n" +
"Join detenido d ON d.id_detenido = exDete.id_detenido;");
                    while (rs.next()){
                         e = new expediente();
                    e.setDelitos(rs.getString("expe.delito").trim());
                    e.setEstadoExpediente(rs.getString("expe.estado_expe").trim());
                    e.setIdOfendido(rs.getInt("o.id_Ofendido"));
                    e.setIdDenunciado(rs.getInt("d.id_detenido"));
                    }
                
                    lista.add(e);
                
                    
                    return lista;
       }
       
       
    
}
