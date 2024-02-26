package org.iesalandalus.pooa.pruebas.prueba1;

import java.text.SimpleDateFormat;

public class Persona {
    protected String nombre;
    protected String apellidos;

    public Persona(String nombre, String apellidos){
        setApellidos(apellidos);
        setNombre(nombre);
    }

    public Persona() {
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        StringBuilder resultado=new StringBuilder();

        resultado.append("Nombre: ").append (this.nombre).append("\n");
        resultado.append("Apellidos: ").append (this.apellidos).append("\n");

        return resultado.toString();
    }
}
