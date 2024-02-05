package PrimeraEvaluacion.Examenes.ExamenChatGpt;
/*
Escribe un programa en Java que solicite al usuario ingresar un número entero. Luego, utiliza una estructura de control para determinar si ese número es positivo, negativo o cero. Muestra el resultado al usuario.
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if (n > 0){
            System.out.println("El numero es  positivo");
        } else if (n < 0) {
            System.out.println("El numero es  negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }
}
