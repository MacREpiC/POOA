package org.iesalandalus.pooa.pruebas.prueba1;

public class Profesor extends Persona{
    protected String especialidad;
    protected double salario;

    public Profesor(String nombre, String apellidos, String especialidad, double salario){
        setEspecialidad(especialidad);
        setSalario(salario);
        setNombre(nombre);
        setApellidos(apellidos);
    }
    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
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
