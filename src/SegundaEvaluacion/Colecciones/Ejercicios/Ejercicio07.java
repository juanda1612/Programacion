package SegundaEvaluacion.Colecciones.Ejercicios;
/*
Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double media = 0.0;
        for (int i = 0; i < 5; i++) {
            notas.add(teclado.nextDouble());
            media = (media + notas.get(i));
        }
        media = media/5;
        System.out.println("Las notas son: " + notas);
        Collections.sort(notas);
        System.out.printf("Las nota media es: %.2f\n", media);
        System.out.println("Las nota mas alta es: " + notas.get(4));
        System.out.println("Las nota mas baja es: " + notas.get(0));
    }
}
