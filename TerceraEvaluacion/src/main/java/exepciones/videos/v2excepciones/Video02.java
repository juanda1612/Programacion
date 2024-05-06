package exepciones.videos.v2excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


// TRY CATCH FINALLY
public class Video02 {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("Hola"); // Hola no se puede pasar a entero
            System.out.println(num);

        } catch (NumberFormatException e){
            System.out.println("El formato del número es incorrecto");

        } catch (NullPointerException e){

        } finally {

        }

        Scanner teclado = new Scanner(System.in);
        int decimal, resultado;
        try{
            decimal = teclado.nextInt(); // Puede producirse un AritmeticalException si se mete por teclado un 0 o un NumberFormatException si se introduce algo que no sea un número
            resultado = 100 / decimal;
        } catch (Exception e){ // No importa la excepción que se produzca va a capturar todas y mostrar el mensaje error si se produce alguna
            System.out.println("Error");
        }


        // Métodos útiles de la clase Exception
        // getMessage obtenemos una cadena descriptiva del error
        // printStackTrace se muestra por la salida estándar la traza de errores que se han producido

        int num1, num2;

        try{
            // Aqui va el código que puede lanzar una exception
            num1 = teclado.nextInt();
            num2 = Integer.parseInt("hola");
            System.out.println(num2 / num1);

        } catch (ArithmeticException e){
            System.out.println("El error es: " + e.getMessage());
            e.printStackTrace();

        } catch (InputMismatchException e){
            System.out.println("El error es: " + e.getMessage());
            e.printStackTrace();

        } catch (NumberFormatException e){
            System.out.println("El error es: " + e.getMessage());
            e.printStackTrace();

        }


        try {
            int a = 1 / 0;
            System.out.println(a);

        } catch (ArithmeticException e){
            System.out.println("Error " + e.getMessage());

        } finally {
            System.out.println("Fin del programa");
        }


        /* try {
            int a = 1 / 0;
            System.out.println(a);

        } catch (InputMismatchException e){
            System.out.println("Error " + e.getMessage());

        } finally {
            System.out.println("Fin del programa"); // Pasará por el try y como no tendrá ningún catch de ese tipo (ArithmeticException) pasará al finally y el programa rompera y lo que haya después no se ejecutará

        }
         */




        System.out.println("El programa termina con normalidad");

    }
}
