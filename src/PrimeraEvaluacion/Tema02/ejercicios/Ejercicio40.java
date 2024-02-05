package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Random;
import java.util.Scanner;

/*
Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste adivine un número que el programa ha elegido al azar. El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si se introduce un número fuera del intervalo debe dar un mensaje de error.
Para que el programa elija un número al azar utilizamos el método random de la clase Math:

 */
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        System.out.println("elige un numero del 1 al 100");
        int n = teclado.nextInt();
        int numAleatorio = generador.nextInt(1 , 100);
        if (n <= 100 && n > 0) {
            do {
                if (n == 0){
                    System.out.println("Te rendiste");
                    break;
                }
                if (n > numAleatorio) {
                    System.out.println("El numero es menor que el introdudido");
                }
                if (n < numAleatorio) {
                    System.out.println("El numero es mayor que el introducido");
                }
                n = teclado.nextInt();
            } while (n != numAleatorio);
            System.out.println("El numero era " + numAleatorio);
        }else {
            System.out.println("Error");
        }
    }
}
