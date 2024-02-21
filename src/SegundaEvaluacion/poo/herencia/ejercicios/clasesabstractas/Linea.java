package SegundaEvaluacion.poo.herencia.ejercicios.clasesabstractas;

public class Linea {
  private int dimensiones;
  private Punto puntoInicio;
  private Punto puntoFin;

    public Linea(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }

    public double calcularLongitud(){

        return 0;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "dimensiones=" + dimensiones +
                ", puntoInicio=" + puntoInicio +
                ", puntoFin=" + puntoFin +
                '}';
    }

    public void dibujarLinea(){

    }
}
