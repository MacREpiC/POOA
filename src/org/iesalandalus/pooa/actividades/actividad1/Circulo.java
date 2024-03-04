package org.iesalandalus.pooa.actividades.actividad1;

public class Circulo extends Figura{
    private Punto centro;
    private Figura circulo;
    private Figura rectangulo;

    private int radio;

    public Punto getCentro(){
        return centro;
    }

    public int getRadio(){
        return radio;
    }

    @Override
    public double getPerimetro(){
        return 2d * Math.PI * radio;
    }

    @Override
    public void desplazar(int cantidad, Direccion direccion){
        int incY = 0;
        int incX = 0;
        switch (direccion){
            case ARRIBA -> incY = cantidad;
            case ABAJO -> incY =- cantidad;
            case IZQUIERDA -> incX =- cantidad;
            case DERECHA -> incY = cantidad;
        }
        desplazar(incX, incY);
    }

    @Override
    public void desplazar(int incX, int incY) {

    }
}
