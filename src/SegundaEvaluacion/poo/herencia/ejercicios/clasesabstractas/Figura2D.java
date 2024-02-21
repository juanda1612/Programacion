package SegundaEvaluacion.poo.herencia.ejercicios.clasesabstractas;

import java.util.ArrayList;

public abstract class Figura2D {
    protected int lados;
    protected final int dimensiones = 2;

    public Figura2D(int lados) {
        this.lados = lados;
    }

    public String nombreFigura(){
        return null;
    }

    protected abstract ArrayList<Linea> crearLineas();

    protected abstract double calcularPerimetro();
    protected abstract double calcularArea();
}
