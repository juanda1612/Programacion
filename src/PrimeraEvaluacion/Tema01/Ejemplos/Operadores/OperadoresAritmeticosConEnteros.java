package PrimeraEvaluacion.Tema01.Ejemplos.Operadores;

import java.util.Scanner;

public class OperadoresAritmeticosConEnteros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce dos numeros enteros");
        int numero1 = teclado.nextInt();
        System.out.println("");
        int numero2 = teclado.nextInt();

        // SUMA
        int suma = numero1 + numero2 ;
        System.out.println(numero1 +" + " + numero2 +" = " + suma);

        // RESTA
        int resta = numero1 - numero2;
        System.out.println(numero1 +" - " + numero2 +" = " + resta);

        // MULTIPLICACION
        int producto = numero1 * numero2;
        System.out.println( numero1 +" . " + numero2 + " = " + producto);

        // DIVISION
        int cociente = numero1 / numero2;
        System.out.println(numero1 +" / " + numero2 + " = " + cociente);

        // resto de la division entera o modulo
        int resto = numero1 % numero2;
        System.out.println(numero1 +" % " + numero2 + " = " + resto);
     }
}
