/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Dimas
 */
 public abstract class persona {
     
        private int id;
        private String nombre;
        private String apellido; 
        private String sexo;
        private String genero;
        private direccion[] direccion; 
        private String estado_civil;

        public persona(int id, String nombre, String apellido, String sexo, String genero, direccion[] direccion, String estado_civil) {
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

        public direccion[] getDireccion() {
            return direccion;
        }

        public void setDireccion(direccion[] direccion) {
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
          for (direccion direcciones: direccion) {
            System.out.println("- " + direcciones.direccionImpresion());
        }
    
        
        }
 }

    
        
        
        
        
    

 

