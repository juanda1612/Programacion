package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina el valor de las siguientes expresiones lógicas:
 */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean X = true;
        boolean Y = false;
        boolean Z = true;
        boolean resultadoA = (X && Y) || (X && Z);
        System.out.println(resultadoA);
        boolean resultadoB = (X || !Y)&& (!X || Z) ;
        System.out.println(resultadoB);
        boolean resultadoC = X || Y && Z ;
        System.out.println(resultadoC);
        boolean resultadoD = !(X || Y) && Z ;
        System.out.println(resultadoD);
        boolean resultadoE = X || Y || X && !Z && !Y ;
        System.out.println(resultadoE);
        boolean resultadoF = !X || !Y || Z && X && !Y;
        System.out.println(resultadoF);
    }
}
