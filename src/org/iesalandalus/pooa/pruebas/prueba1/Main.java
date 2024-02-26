package org.iesalandalus.pooa.pruebas.prueba1;

public class Main {
    public static void main(String[] args) {
        Persona persona;
        persona = new Persona("Alejandro", "Melero");

        Alumno alumno;
        alumno = new Alumno("Pepe", "Pérez", "A", 30);

        Profesor profesor;
        profesor = new Profesor("Juan", "Pérez", "Informática", 1400);

        System.out.println(persona.getNombre());
        System.out.println(alumno.getNombre());
        System.out.println(profesor.getNombre());


    }
}
