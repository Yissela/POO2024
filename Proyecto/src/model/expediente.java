/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Dimas
 */
public class expediente {
        private int nExpediente;
        private  StringProperty fecha = new SimpleStringProperty();
        private StringProperty breveNarracion = new SimpleStringProperty(); 
        private StringProperty estadoExpediente = new SimpleStringProperty();

    public int getnExpediente() {
        return nExpediente;
    }

    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    public StringProperty getFecha() {
        return fecha;
    }

    public void setFecha(StringProperty fecha) {
        this.fecha = fecha;
    }

    public StringProperty getBreveNarracion() {
        return breveNarracion;
    }

    public void setBreveNarracion(StringProperty breveNarracion) {
        this.breveNarracion = breveNarracion;
    }

    public StringProperty getEstadoExpediente() {
        return estadoExpediente;
    }

    public void setEstadoExpediente(StringProperty estadoExpediente) {
        this.estadoExpediente = estadoExpediente;
    }
     
    
    
}
