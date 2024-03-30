package proyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class data {
    Connection connection = null; 
    
    String url = "jdbc:postgresql://localhost:5432/POO";
    
    
    public Connection ConectarBases() {
    
    try{
        Class.forName("org.postgresql.Driver");
      connection = DriverManager.getConnection(url, "postgres", "Garcia");
      JOptionPane.showMessageDialog(null, "Se conecto la base de datos");
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error" + e.toString());
    }
    return connection;

}
        
        
        
      
       
       
       
       
    
}
