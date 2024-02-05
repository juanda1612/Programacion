package PrimeraEvaluacion.Examenes.Simulacro2;
/*
Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor. Ejemplo:
 */

import java.util.Scanner;

public class MasEjercicios4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero >= 0 && numero <= 20){
            for (int i = 1; i <= numero; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("error");
        }
    }
}
