package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería imprimir true si son iguales, false en caso contrario.
 */

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = teclado.nextLine();
        System.out.println("Introduce otra cadena de texto:");
        String cadena2 = teclado.nextLine();

        cadena = cadena.replace(" " , "");
        cadena2 = cadena2.replace(" " ,"");

        if (cadena.equals(cadena2)){
            System.out.println("Si," + cadena + " es igual Aplicacion.md " + cadena2);
        }else{
            System.out.println("No, no son iguales");
        }

    }
}
