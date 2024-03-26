/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * 
 *
 * @author Dimas Garcia
 */
public class Mavenproject2 {

    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:postgresql://localhost:5432/POO";
        
        Connection connection = DriverManager.getConnection(url, "postgres", "Garcia");
        
       String query = "Select nombre from delito";
       
       try (Statement stmt = connection.createStatement();
               ResultSet rs = stmt.executeQuery(query)){
           
           while (rs.next()){
                String nombre = rs.getString("nombre");
                System.out.println(nombre);
       }
       
       }
        
    }
}
