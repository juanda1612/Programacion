package SegundaEvaluacion.Colecciones.Ejercicios;
/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> n = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            n.add(teclado.nextDouble());
        }
        for (int i = n.size() - 1; i >= 0; i--) {
            System.out.print(n.get(i) + " ");
        }
    }
}
