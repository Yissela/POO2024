/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Dimas
 */
public class expediente {
        private int idExpediente;

    public String getDelitos() {
        return delitos;
    }

    public void setDelitos(String delitos) {
        this.delitos = delitos;
    }
        private  LocalDate fecha;
        private String breveNarracion; 
        private String estadoExpediente;
        private String delitos;
        private int IdOfendido;
        private int IdDenunciado;
        private int IdDenunciante;

    public int getIdOfendido() {
        return IdOfendido;
    }

    public void setIdOfendido(int IdOfendido) {
        this.IdOfendido = IdOfendido;
    }

    public int getIdDenunciado() {
        return IdDenunciado;
    }

    public void setIdDenunciado(int IdDenunciado) {
        this.IdDenunciado = IdDenunciado;
    }

    public int getIdDenunciante() {
        return IdDenunciante;
    }

    public void setIdDenunciante(int IdDenunciante) {
        this.IdDenunciante = IdDenunciante;
    }

    public int getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

  

    public String getBreveNarracion() {
        return breveNarracion;
    }

    public void setBreveNarracion(String breveNarracion) {
        this.breveNarracion = breveNarracion;
    }

    public String getEstadoExpediente() {
        return estadoExpediente;
    }

    public void setEstadoExpediente(String estadoExpediente) {
        this.estadoExpediente = estadoExpediente;
    }

 
    
    
}
