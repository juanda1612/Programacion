package SegundaEvaluacion.poo.herencia.ejercicios.clasesabstractas;

import java.util.ArrayList;

public abstract class Figura2D {
    int lados;
    final int DIMENSIONES = 2;

    public Figura2D(int lados) {
        this.lados = lados;
    }

    public String nombreFigura(){
        if (lados == 3){
            return "Triangulo";
        }else if (lados == 4){
            return "Rectangulo";
        }else {
            return " gracias por la sugerencia; añadiremos figuras de " + lados + " lados en el futuro";
        }
    }

    public abstract ArrayList<Linea> crearLineas();

    public abstract double calcularPerimetro();
    public abstract double calcularArea();
}
