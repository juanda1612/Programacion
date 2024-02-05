package SegundaEvaluacion.Colecciones.Ejercicios;
/*
Realizar un programa que pida un tamaño de array por teclado y Aplicacion.md continuación cree un array formado por elementos aleatorios pares entre 1 y 50.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        int longitud = teclado.nextInt();
        ArrayList<Integer> n = new ArrayList<>(longitud);
        for (int i = 0; i < longitud; i++) {
            n.get(generador.nextInt(1,51));
            if (n.get(i) % 2 == 0){
                n.add(i);
            }
        }
        System.out.println(n);
    }
}
