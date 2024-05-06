package exepciones.videos.v1excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Video01 {
    public static void main(String[] args) {

        //EXCEPCIONES NO VERIFICADAS:
        try {
            int dividiendo = 10;
            int divisor = 0;
            int cociente = dividiendo/divisor; // esto es una Exception in thread "main" java.lang.ArithmeticException: / by zero
        } catch (ArithmeticException exceptionA){
            System.out.println("Ha petado.");
            System.out.println(exceptionA.getMessage());
        }
        System.out.println("Hemos pasado la excepción aritmética");


        try{
            int[] array = new int[3]; // array de tamaño 3; indice de 0 a 2
            int numero = array[3];  // esto es una Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        } catch (ArrayIndexOutOfBoundsException exceptionLimiteArray){
            System.out.println("Te has salido del array");
            System.out.println(exceptionLimiteArray.getMessage());
            System.out.println(exceptionLimiteArray.getStackTrace());
        }

        System.out.println("Hemos pasado la excepción del array");

         try{
             String cadena = null;
             System.out.println(cadena.toUpperCase()); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "cadena" is null
         } catch (NullPointerException exceptionNull){
             System.out.println("Tienes que inicializar la cadena con un valor");
             System.out.println(exceptionNull.getMessage());
         }

        System.out.println("Hemos pasado la excepción Null");

         try{
             int numero = Integer.parseInt("Cochinillo"); // Exception in thread "main" java.lang.NumberFormatException: For input string: "no es un número"
         } catch (NumberFormatException exceptionFormato){
             System.out.println("Cochinillo no es un número");
             System.out.println(exceptionFormato.getMessage());
         }

        System.out.println("Hemos pasado la excepción del formato");

        // EXCEPCIONES VERIFICADAS:
        try {
            FileReader fr = new FileReader("archivo.txt"); // Unhandled exception: java.io.FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        }
        System.out.println("Y sigue...");


    }
}
