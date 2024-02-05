package PrimeraEvaluacion.Examenes.Simulacro2;
/*
Ejercicio 15
Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.

 */

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
        char caracter = teclado.nextLine().charAt(0);
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                contador++;
            }
        }
        System.out.println(contador);
        System.out.println(cadena);

    }
}
