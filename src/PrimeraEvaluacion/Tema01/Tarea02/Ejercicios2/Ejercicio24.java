package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Un alumno desea saber cual será su nota final en un módulo. Dicha calificación se compone de los siguientes porcentajes:
El 55% se obtiene del promedio de la nota de las tres evaluaciones.
El 30% se obtiene de la nota en un examen final.
El 15% se obtiene de la calificación de un trabajo final.

 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota de las tres evaluaciones");
        double evaluaciones = teclado.nextDouble();
        double evaluaciones2 = teclado.nextDouble();
        double evaluaciones3 = teclado.nextDouble();
        System.out.println("Introduce la nota del examen final");
        double examenFinal = teclado.nextDouble();
        System.out.println("Introduce la nota del trabajo final");
        double trabajoFinal = teclado.nextDouble();

        double sumaEvaluacion = (evaluaciones + evaluaciones2 + evaluaciones3) / 3;
        double notaTresEvaluaciones = (sumaEvaluacion * 55) / 100 ;
        examenFinal = (examenFinal * 30) / 100;
        trabajoFinal = (trabajoFinal * 15) / 100;

        double notaFinal = notaTresEvaluaciones + examenFinal + trabajoFinal;
        System.out.print("Tu nota es " + notaFinal);



    }
}
