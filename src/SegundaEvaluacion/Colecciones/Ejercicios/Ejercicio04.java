package SegundaEvaluacion.Colecciones.Ejercicios;
/*
Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener y Aplicacion.md continuación lo inicialice con números aleatorios comprendidos entre 1 y 10. Mostrar la suma de todos los números que se guardan en el array.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        int longitud = teclado.nextInt();
        int suma = 0;
        ArrayList<Integer> n = new ArrayList<>(longitud);
        for (int i = 0; i < longitud; i++) {
            n.add(generador.nextInt(1, 11));
            suma = suma + n.get(i);
        }
        System.out.println(n);
        System.out.println(suma);

    }
}
