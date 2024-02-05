package PrimeraEvaluacion.Examenes;

import java.util.Scanner;

/**
 * @author Juan Daniel
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota de las 2 practicas");
        int nota1 = teclado.nextInt();
        int nota2 = teclado.nextInt();
        System.out.println("Introduce la nota del examen");
        int notaExamen = teclado.nextInt();

        double suma = (nota1 + nota2)/2.0;
        double mediaP = (0.3 * suma) + (0.7 * notaExamen);

        System.out.println("Nota de la p01: " + nota1);
        System.out.println("Nota de la p02: " + nota2);
        System.out.println("Nota del examen: " + notaExamen);
        System.out.println("==================");
        System.out.printf("Nota 1º evaluacion: %.2f", mediaP );




    }
}
