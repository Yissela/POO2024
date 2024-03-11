/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Delito {
    int id_delito;
    String nombre;

    public Delito(int id_delito, String nombre) {
        this.id_delito = id_delito;
        this.nombre = nombre;
    }

    public int getId_delito() {
        return id_delito;
    }

    public void setId_delito(int id_delito) {
        this.id_delito = id_delito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

}

class Direccion {

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    String departamento; 
    String municipio;
    String cuidad;
    String calle;
    String bloque;
    String referencia;
    
    
    public Direccion(String departamento, String municipio, String cuidad, String calle, String bloque, String referencia){
        this.departamento = departamento;
        this.municipio = municipio;
        this.cuidad = cuidad;
        this.calle = calle;
        this.bloque = bloque;
        this.referencia = referencia;
}
 
    public String direccionImpresion(){
    return departamento+", "+ municipio+", "+cuidad+", "+calle+", "+bloque+", "+ referencia;
    }

}


abstract class persona {
    int id;
    String nombre;
    String apellido; 
    String sexo;
    String genero;
    Direccion[] direccion; 
    String estado_civil;

    public persona(int id, String nombre, String apellido, String sexo, String genero, Direccion[] direccion, String estado_civil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.genero = genero;
        this.direccion = direccion;
        this.estado_civil = estado_civil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Direccion[] getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion[] direccion) {
        this.direccion = direccion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    
    
   
    
    
   
    
    public void InfoPersona(){
          System.out.print("Nombre y apellido:" + nombre+ "  " + apellido + "  Direccion:" );
          for (Direccion direcciones: direccion) {
            System.out.println("- " + direcciones.direccionImpresion());
        }
          
}
    
}


class Detenido extends persona{
    
    Delito[] delito;

    public Detenido(int id, String nombre, String apellido, String sexo, String genero, Direccion[] direccion, String estado_civil) {
        super(id, nombre, apellido, sexo, genero, direccion, estado_civil);
    }

    

    

   

}

class Denunciante extends persona{

    public Denunciante(int id, String nombre, String apellido, String sexo, String genero, Direccion[] direccion, String estado_civil) {
        super(id, nombre, apellido, sexo, genero, direccion, estado_civil);
    }

    

    

}

class ofendido extends persona {

    public ofendido(int id, String nombre, String apellido, String sexo, String genero, Direccion[] direccion, String estado_civil) {
        super(id, nombre, apellido, sexo, genero, direccion, estado_civil);
    }

   

   

}








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
