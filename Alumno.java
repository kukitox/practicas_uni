
package com.mycompany.poo2;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }
    
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
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
    
    
    
    
    
    public void mostrarNombre(){
        System.out.println("El nombre del alumno es, ");
    }
    
    public void saberAprobrado (double calificacion){
        
        if (calificacion >=6){
            System.out.println("Aprobre la materia");
        }
        else{
            System.out.println("Desaprobe pal pingo");
        }
    }

}
