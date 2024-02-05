package PrimeraEvaluacion.Examenes.ExamenChatGpt;
/*
Escribe un programa en Java que solicite al usuario ingresar una cadena de texto. Luego, utiliza un bucle para recorrer la cadena y contar cuántas veces aparece la letra 'Aplicacion.md'. Finalmente, muestra el resultado al usuario."
 */

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String n = teclado.nextLine();
        int contador = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i)  == 'a'){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
