package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dimas
 */
 public abstract class persona {
     
        private int id;

    public StringProperty getDireccion() {
        return direccion;
    }

    public void setDireccion(StringProperty direccion) {
        this.direccion = direccion;
    }
        private  StringProperty nombre = new SimpleStringProperty();
        private StringProperty apellido = new SimpleStringProperty(); 
        private StringProperty sexo = new SimpleStringProperty();
        private StringProperty genero = new SimpleStringProperty();
        //private direccion[] direccion; 
        private StringProperty estado_civil = new SimpleStringProperty();
        private StringProperty direccion = new SimpleStringProperty();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StringProperty getNombre() {
        return nombre;
    }

    public void setNombre(StringProperty nombre) {
        this.nombre = nombre;
    }

    public StringProperty getApellido() {
        return apellido;
    }

    public void setApellido(StringProperty apellido) {
        this.apellido = apellido;
    }

    public StringProperty getSexo() {
        return sexo;
    }

    public void setSexo(StringProperty sexo) {
        this.sexo = sexo;
    }

    public StringProperty getGenero() {
        return genero;
    }

    public void setGenero(StringProperty genero) {
        this.genero = genero;
    }

 

    public StringProperty getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(StringProperty estado_civil) {
        this.estado_civil = estado_civil;
    }

       
        
        
         
 }

    
        
        
        
        
    

 

