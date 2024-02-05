package SegundaEvaluacion.Colecciones.Ejercicios;
/*
Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y los muestre ordenados de menor Aplicacion.md mayor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        Random generador = new Random();
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            n.add(generador.nextInt(1, 11));
        }
        System.out.println(n);
        Collections.sort(n);
        System.out.println(n);
    }
}
