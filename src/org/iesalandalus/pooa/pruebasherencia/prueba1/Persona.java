package org.iesalandalus.pooa.pruebasherencia.prueba1;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;

    public Persona(String nombre, String apellidos, LocalDate fechaNac){
        setApellidos(apellidos);
        setNombre(nombre);
        setFechaNac(fechaNac);
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    private void setFechaNac(LocalDate fechaNac){
        this.fechaNac = fechaNac;
    }

    public abstract String saludar();

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();

        resultado.append("Nombre: ").append (this.nombre).append("\n");
        resultado.append("Apellidos: ").append (this.apellidos).append("\n");

        return resultado.toString();
    }
}
