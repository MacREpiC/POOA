package org.iesalandalus.pooa.pruebasherencia.prueba1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Alejandro", "Sáez", "A", 30,LocalDate.now());
        Profesor profesor = new Profesor("Juan", "Pérez", "Informática", 1400 ,LocalDate.now());

        System.out.println(alumno);
        System.out.println(profesor);

        System.out.println("---------");

        System.out.println(alumno.saludar());
        System.out.println(profesor.saludar());
    }
}
