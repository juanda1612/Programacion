package SegundaEvaluacion.poo.herencia.ejercicios.clasesabstractas;

import java.util.ArrayList;

public class Rectangulo extends Figura2D {
    Punto p1;
    Punto p2;
    Punto p3;
    Punto p4;

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(4); // todos los rectangulos tienen 4 lados, no hace falta que se pida por teclado
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Rectangulo(ArrayList<Punto> puntos) {
        super(4);
        // suponemos que el arrayList tiene 4 puntos
        this.p1 = puntos.get(0);
        this.p2 = puntos.get(1);
        this.p3 = puntos.get(2);
        this.p4 = puntos.get(3);
    }

    @Override
    public String toString() {
        return  p1 + " - " + p2 + " - " + p3 + " - " + p4;
    }

    @Override
    public ArrayList<Linea> crearLineas() {
        ArrayList<Linea>lineas = new ArrayList<>();
        return lineas;
    }

    @Override
    public double calcularPerimetro() {

        return 0;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
