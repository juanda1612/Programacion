package PrimeraEvaluacion.Tema02.Ejemplos;

import java.util.Scanner;

public class EjemplosWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // el bucle while empieza evaluando una condicion
        // si el resultado es true, entra en el bloque {} y ejecuta el codigo que contiene
        // al finalizar, vuelve arriba, Aplicacion.md comprobar de nuevo la condicion
        // asi, sucesivamente, haste que la condicion da como resultado false

        int i = 1;
        /*
        while (i < 11){
            System.out.println(i);
            // para que esto pare en ealgun momento, tenemos que hacer que cambie la condicion
            i++;
        }

         */
        //Otro ejemplo
        // Imprimir todos los multiplos de 5 hasta un numero introducido por teclado
        System.out.println();
        int n = teclado.nextInt();
        while (i < n){
            i++;
            if (i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
