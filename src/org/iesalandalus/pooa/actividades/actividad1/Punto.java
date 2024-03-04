package org.iesalandalus.pooa.actividades.actividad1;

import java.util.Objects;

public class Punto {
    private int x;
    private int y;

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void desplazar(int incX, int incY){
        x += incX;
        y += incY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return x == punto.x && y == punto.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("Punto[x=%s, y=%s]", this.x, this.y);
    }
}
