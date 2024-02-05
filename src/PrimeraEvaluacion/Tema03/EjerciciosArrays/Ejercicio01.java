package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //YO
        /*
        double[] numeros = new double[5];
        System.out.println("Introduce los numeros");
        for (int i = 0; i < 5; i++) {
            numeros[i] = teclado.nextDouble();
        }
        System.out.println("numeros introducidos");
        for (int i = 0; i <5 ; i++) {
            System.out.print(numeros[i] + ", ");
        }

         */
        //CLASE
        double[] numeros = new double[5];
        System.out.println("Introduce los numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextDouble();
            double numero2 = teclado.nextDouble();
            numeros[i] = numero2;
        }
        System.out.println("numeros introducidos");
        System.out.println(Arrays.toString(numeros));
    }
}
