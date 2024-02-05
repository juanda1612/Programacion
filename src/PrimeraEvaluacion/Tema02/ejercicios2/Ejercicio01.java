package PrimeraEvaluacion.Tema02.ejercicios2;
/*
Dibuja una tabla de dimensiones nxm con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones que delimitan la tabla, es decir, las más externas, mientras que el resto de los elementos contendrán el valor 0.
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Primera version
        /*for (int i = 0; i < 5; i++) {
            System.out.print("1");
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 4 || i == 3 && j == 9 || i == 1 && j == 9 || i == 2 && j == 9){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

         */
        //Segunda version
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las columnas y las filas");
        int columna = teclado.nextInt();
        int fila = teclado.nextInt();
        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                if (i == 0 || i == columna - 1 || j == 0 || j == fila - 1) {
                    System.out.print("1 \t");
                }else {
                    System.out.print("0 \t");
                }
            }
            System.out.println();
        }
    }
}
