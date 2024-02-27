package org.iesalandalus.pooa.pruebasherencia.prueba1;

import java.time.LocalDate;

public class Profesor extends Persona{
    private String especialidad;
    private double salario;

    public Profesor(String nombre, String apellidos, String especialidad, double salario, LocalDate fechaNac){
        setEspecialidad(especialidad);
        setSalario(salario);
        setNombre(nombre);
        setApellidos(apellidos);
        setFechaNac(fechaNac);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String getNombre(){
        return String.format("Profesor -> %s", super.getNombre());
    }

    private void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder resultado;

        // Llamada al método "toString" de la superclase
        resultado= new StringBuilder (super.toString());

        // A continuación añadimos la información "especializada" de esta subclase
        resultado.append("\n");
        resultado.append ("Especialidad: ").append(this.especialidad).append("\n");
        resultado.append ("Salario: ").append(String.format("%7.2f euros", this.salario));

        return resultado.toString();
    }
}
