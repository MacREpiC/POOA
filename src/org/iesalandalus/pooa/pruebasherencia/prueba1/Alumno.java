package org.iesalandalus.pooa.pruebasherencia.prueba1;

import java.time.LocalDate;

public class Alumno extends Persona {
    private String grupo;
    private double notaMedia;

    public Alumno(String nombre, String apellidos, String grupo, double notaMedia, LocalDate fechaNac){
        setGrupo(grupo);
        setNotaMedia(notaMedia);
        setApellidos(apellidos);
        setNombre(nombre);
        setFechaNac(fechaNac);
    }

    public String getGrupo() {
        return grupo;
    }

    @Override
    public String getNombre(){
        return String.format("Alumno -> %s", super.getNombre());
    }

    public double getNotaMedia(){
        return notaMedia;
    }

    private void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    private void setNotaMedia(double notaMedia){
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        StringBuilder resultado;

        // Llamada al método "toString" de la superclase
        resultado= new StringBuilder (super.toString());

        // A continuación añadimos la información "grupo" de esta subclase
        resultado.append("\n");
        resultado.append ("Grupo: ").append(this.grupo).append("\n");
        resultado.append ("Nota media: ").append(String.format("%6.2f", this.notaMedia));

        return resultado.toString();
    }
}
