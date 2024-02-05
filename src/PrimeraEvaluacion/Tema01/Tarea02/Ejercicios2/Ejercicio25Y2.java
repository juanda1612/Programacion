package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina el valor de las siguientes expresiones lógicas:
 */

import java.util.Scanner;

public class Ejercicio25Y2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean W = false;
        boolean X = true;
        boolean Y = true;
        boolean Z = false;
        boolean resultadoA = W || Y && X && W || Z ;
        System.out.println(resultadoA);
        boolean resultadoB = X && !Y && !X || !W && Y ;
        System.out.println(resultadoB);
        boolean resultadoC = !(W || !Y) && X || Z  ;
        System.out.println(resultadoC);
        boolean resultadoD = X && Y && W || Z || X;
        System.out.println(resultadoD);
        boolean resultadoE = Y || !(Y || Z && W) ;
        System.out.println(resultadoE);
        boolean resultadoF = !X && Y && (!Z || !X);
        System.out.println(resultadoF);
    }
}
