package SegundaEvaluacion.Colecciones.Ejercicios;
/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> n = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
           n.add(teclado.nextDouble());
        }
        System.out.println(n);
    }
}
