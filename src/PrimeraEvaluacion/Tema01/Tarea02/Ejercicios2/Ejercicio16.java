package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce coordenadas A");
        double ax = teclado.nextDouble();
        double ay = teclado.nextDouble();
        System.out.println("Introduce coordenadas B");
        double bx = teclado.nextDouble();
        double by = teclado.nextDouble();
        double distancia = Math.sqrt(Math.pow(bx - ax , 2) + Math.pow(by - ay , 2));
        System.out.println("La distancia entre los puntos A y B es = " + distancia);
    }
}
