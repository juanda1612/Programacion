package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la secuencia (sin contar el 0 final).
 */

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //YO
        int n = 0;
        int contador = 0;
        while (true){
            n = teclado.nextInt();
            contador++;
            if (n == 0){
                contador--;
                System.out.println(contador);
                break;
            }

        }


        /*
        //Profe
        int numero = teclado.nextInt();
        int contador = 0;
        while (numero != 0){
            contador++;
            numero = teclado.nextInt();
        }
        System.out.println(contador);

         */
    }


}
