
package com.mycompany.poo2;

public class Poo2 {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno ();
        Alumno alu2 = new Alumno (4, "betito", "el piñador");
        
        System.out.println("La id del alumno 2 es: "+ alu2.getId());
        System.out.println("El nombre del alumno 2 es: "+ alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: "+ alu2.getApellido());
        
        alu1.setId(8);
        alu1.setNombre("piñon");
        alu1.setApellido("fijo");
        
        System.out.println("-------------");
        System.out.println("La id del alumno 1 es: "+ alu1.getId());
        System.out.println("El nombre del alumno 1 es: "+ alu1.getNombre());
        System.out.println("El apellido del alumno 1 es: "+ alu1.getApellido());
        
        System.out.println("-------");
        alu2.setId(55);
        System.out.println("La id del alumno 2 es: "+ alu2.getId());
        System.out.println("El nombre del alumno 2 es: "+ alu2.getNombre());
        System.out.println("El apellido del alumno 2 es: "+ alu2.getApellido());
        System.out.println("-------");
        
        
    }
}
