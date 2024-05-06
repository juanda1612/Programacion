package exepciones.videos.v3excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;



// THROW Y THROWS
public class Video03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int minutos;
        System.out.println("Indica los minutos");

        try {
            minutos = teclado.nextInt();
            teclado.close();
            if (minutos < 0 || minutos >= 60){
                throw new InputMismatchException("Valor fuera de rango, de 0 a 60");
            }
            System.out.println("El número introducido es válido");
        } catch (Exception e){
            if (e.getMessage() == null){
                System.out.println("ERROR: El número introducido NO es válido "); // se imprime con el getMessage lo que hemos lanzado en el throw si escribimos un número fuera de rango. si introducimos otra cosa como letras, el mensaje que mostrará es null porque no hemos lanzado esa excepción con un if else solucionamos que si getMessage es null, que imprima por pantalla otra cosa.
            } else {
                System.out.println("ERROR: " + e.getMessage()); // se imprime con el getMessage lo que hemos lanzado en el throw si escribimos un número fuera de rango.
            }

        }


        try {
            dividir(3, 0);
        } catch (ArithmeticException e){
            System.out.println("Capturando la excepción en el main");
        }


        try {
            dividir2(3, 0);
        } catch (ArithmeticException e){
            System.out.println("Capturando la excepción en el main");
        }

    }

    static void dividir (int n, int m) throws ArithmeticException{
        if (m == 0)
            throw new ArithmeticException(); // lanzamos la excepción
        else
            System.out.println(n + " / " + m + " = " + (n / m));

    }

    static void dividir2 (int n, int m){
        try {
            if (m == 0)
                throw new ArithmeticException(); // lanzamos la excepción
            else
                System.out.println(n + " / " + m + " = " + (n / m));
        } catch (ArithmeticException e){
            System.out.println("Capturando la excepción dentro del método");
        }

    }
}
