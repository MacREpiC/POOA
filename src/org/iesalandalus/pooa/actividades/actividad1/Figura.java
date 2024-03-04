package org.iesalandalus.pooa.actividades.actividad1;

public abstract class Figura {
    private Color color;
    private Punto centro;
    public abstract double getPerimetro();

    public abstract void desplazar(int cantidad, Direccion direccion);

    public abstract void desplazar(int incX, int incY);
}
