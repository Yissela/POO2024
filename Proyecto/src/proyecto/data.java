 package proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ventanas.BuscarController;


public class data {
    Connection connection = null; 
    private Statement statement;
    
    String url = "jdbc:postgresql://localhost:5432/POO";

   public data(){
   
   
   }
    
    
    
    
    public void ConectarBases() {
    
    try{
        Class.forName("org.postgresql.Driver");
      connection = DriverManager.getConnection(url, "postgres", "Garcia");
      statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      JOptionPane.showMessageDialog(null, "Se conecto la base de datos");
    
    }catch(ClassNotFoundException | SQLException ex){
        Logger.getLogger(BuscarController.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
}
        
    public ResultSet CONSULTAR(String sql) throws SQLException{
        ResultSet rs = null;
        rs = statement.executeQuery(sql);
        System.out.println(sql);
    
        return rs;
    
    
    }    
    
    public boolean GUARDAR(String sql) throws SQLException{
    return(statement.executeUpdate(sql)>0);
    
    }
        
      public void CERRAR(){
          try{
          if(connection != null)
              connection.close();
          
          if(statement != null)
              statement.close();
          
          
          System.out.println("Conexion Cerrada");
          
          }catch(SQLException ex){
          
           Logger.getLogger(BuscarController.class.getName()).log(Level.SEVERE, null, ex);
          
          }
      
      
      
      }
       
       
      public  Connection getConexion(){
          return connection;
      }
       
    
}
