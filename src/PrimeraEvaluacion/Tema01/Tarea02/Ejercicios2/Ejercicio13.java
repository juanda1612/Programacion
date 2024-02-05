package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*

Realiza un programa que pida el lado de un cuadrado,  y muestre por pantalla El perímetro.
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el lado de un cuadrado");
        int lado = teclado.nextInt();
        double perimetro = 4 * lado;
        System.out.println("El perimetro del cuadrado es " + perimetro);

    }
}
