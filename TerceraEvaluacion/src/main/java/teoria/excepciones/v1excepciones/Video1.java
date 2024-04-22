package teoria.excepciones.v1excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.jar.JarException;

public class Video1 {
    public static void main(String[] args) {
        // EXCEPCIONES NO VERIFICADAS:
        System.out.println("\nPrimera");
        try {
            int dividendo = 10;
            int divisor = 0;
            int cociente = dividendo/divisor; // esto es una ArithmeticException: / by zero
        }catch (ArithmeticException exceptionA){
            System.out.println("Ha petado");
            System.out.println(exceptionA.getMessage());
        }
        System.out.println("Hemos pasado el primer bloque");

        System.out.println("\nSegunda");
        try {
            int[]array = new int[3]; // array de tamaño 4; indice va de 0 a 3

            int numero = array[3]; // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }catch (ArrayIndexOutOfBoundsException exceptionB){
            System.out.println("Peto");
            System.out.println(exceptionB.getMessage());
            System.out.println(exceptionB.getStackTrace());
        }
        System.out.println("Hemos pasado el segundo bloque");

        System.out.println("\nTercera");
        try {
            String cadena = null;
            System.out.println(cadena.toLowerCase());// NullPointerException: Cannot invoke "String.toLowerCase()" because "cadena" is null
        }catch (NullPointerException exceptionC){
            System.out.println("s");
            System.out.println(exceptionC.getMessage());
        }
        System.out.println("Hemos pasado el tercer bloque");

        System.out.println("\nCuarta");
        try {
            int numero2 = Integer.parseInt("cochinillo");// NumberFormatException: For input string: "cochinillo"
        }catch (NumberFormatException exceptionD){
            System.out.println(exceptionD.getMessage());
            System.out.println(exceptionD.getStackTrace());
        }

        System.out.println("Hemos pasado el cuarto bloque");

        // EXCEPCIONES VERIFICADAS
        System.out.println("\nQuinta");
        try {
            FileReader fr = new FileReader("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        }


    }
}
