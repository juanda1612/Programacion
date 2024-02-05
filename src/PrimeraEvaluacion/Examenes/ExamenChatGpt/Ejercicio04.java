package PrimeraEvaluacion.Examenes.ExamenChatGpt;
/*
Escribe un programa en Java que solicite al usuario ingresar dos números enteros. Luego, utiliza una estructura de control para determinar si el primer número es divisible por el segundo. Muestra el resultado al usuario.
 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        if (a > b){
            System.out.println("es divisible");
        }else {
            System.out.println("No es divisible");
        }

    }
}
