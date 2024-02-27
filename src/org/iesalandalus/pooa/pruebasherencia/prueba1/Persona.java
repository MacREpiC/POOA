package org.iesalandalus.pooa.pruebasherencia.prueba1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;

    public Persona(String nombre, String apellidos, LocalDate fechaNac){
        setApellidos(apellidos);
        setNombre(nombre);
        setFechaNac(fechaNac);
    }

    public Persona() {
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    protected void setFechaNac(LocalDate fechaNac){
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();

        resultado.append("Nombre: ").append (this.nombre).append("\n");
        resultado.append("Apellidos: ").append (this.apellidos).append("\n");

        return resultado.toString();
    }
}
