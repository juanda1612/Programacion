package PrimeraEvaluacion.Tema02.ejercicios;
/*
Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta que seleccionamos la opción de “Salir”.
 */

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        do {
            System.out.println("Menu:");
            System.out.println("(1)Configuracion");
            System.out.println("(2)Salir");
            n = teclado.nextInt();
            switch (n) {
                case 1:
                    System.out.println("has elegido :CONFIGURACION");
                    break;
                case 2:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Introduce un numero valido");
            }
        }while (n != 2);
    }
}
