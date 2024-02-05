package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[5];
        double notaMedia = 0.0;
        System.out.println("Introduce las notas obtenidas");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = teclado.nextInt();
            notaMedia = notaMedia + notas[i];
        }
        notaMedia = notaMedia / notas.length;
        System.out.print("Las notas son: "+Arrays.toString(notas));
        System.out.print("\n La nota media es : " + notaMedia);
        Arrays.sort(notas);
        System.out.print("\n La nota mas alta es : "+ notas[4]);
        System.out.print("\n La nota mas baja es : "+ notas[0]);
    }
}
