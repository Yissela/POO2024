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
public class direccion {
    private StringProperty departamento = new SimpleStringProperty(); 
    private StringProperty municipio = new SimpleStringProperty();
    private StringProperty cuidad = new SimpleStringProperty();
    private StringProperty calle = new SimpleStringProperty();
    private StringProperty bloque = new SimpleStringProperty();
    private StringProperty referencia = new SimpleStringProperty();

    public StringProperty getDepartamento() {
        return departamento;
    }

    public void setDepartamento(StringProperty departamento) {
        this.departamento = departamento;
    }

    public StringProperty getMunicipio() {
        return municipio;
    }

    public void setMunicipio(StringProperty municipio) {
        this.municipio = municipio;
    }

    public StringProperty getCuidad() {
        return cuidad;
    }

    public void setCuidad(StringProperty cuidad) {
        this.cuidad = cuidad;
    }

    public StringProperty getCalle() {
        return calle;
    }

    public void setCalle(StringProperty calle) {
        this.calle = calle;
    }

    public StringProperty getBloque() {
        return bloque;
    }

    public void setBloque(StringProperty bloque) {
        this.bloque = bloque;
    }

    public StringProperty getReferencia() {
        return referencia;
    }

    public void setReferencia(StringProperty referencia) {
        this.referencia = referencia;
    }

       
    
 
    public String direccionImpresion(){
    return departamento+", "+ municipio+", "+cuidad+", "+calle+", "+bloque+", "+ referencia;
    }
}
