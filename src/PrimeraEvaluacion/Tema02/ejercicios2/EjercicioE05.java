package PrimeraEvaluacion.Tema02.ejercicios2;
/*
 Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares. Ejemplo:
 */

import java.util.Scanner;

public class EjercicioE05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int contador = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){
                contador++;
            }
        }
        System.out.println("Los numeros pares son " + contador);
    }
}
