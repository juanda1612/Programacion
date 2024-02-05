package PrimeraEvaluacion.Tema01.Ejemplos.Variables;
/*
variables de tipo boolean
 */

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        // son variables que solo pueden tomar dos valores: true, false
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce edad: ");
        int edad = teclado.nextInt(); teclado.nextLine();
        boolean mayorDeEdad = edad >= 1; // si edad es <=18 guardara true; si no sera false
        System.out.print("Eres mayor de edad: " + mayorDeEdad);

    }
}
