/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Dimas
 */
public class direccion {
    private String departamento; 
    private String municipio;
    private String cuidad;
    private String calle;
    private String bloque;
    private String referencia;

        public direccion(String departamento, String municipio, String cuidad, String calle, String bloque, String referencia) {
            this.departamento = departamento;
            this.municipio = municipio;
            this.cuidad = cuidad;
            this.calle = calle;
            this.bloque = bloque;
            this.referencia = referencia;
        }

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
    
    
    
 
    public String direccionImpresion(){
    return departamento+", "+ municipio+", "+cuidad+", "+calle+", "+bloque+", "+ referencia;
    }
}
