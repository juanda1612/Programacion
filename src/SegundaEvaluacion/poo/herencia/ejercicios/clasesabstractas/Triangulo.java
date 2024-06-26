package SegundaEvaluacion.poo.herencia.ejercicios.clasesabstractas;

import java.util.ArrayList;

public class Triangulo extends Figura2D{
  Punto p1;
  Punto p2;
  Punto p3;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        super(3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangulo(ArrayList<Punto> puntos) {
        super(4);
        // suponemos que el arrayList tiene 4 puntos
        this.p1 = puntos.get(0);
        this.p2 = puntos.get(1);
        this.p3 = puntos.get(2);
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

    @Override
    public ArrayList<Linea> crearLineas() {
        return null;
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
