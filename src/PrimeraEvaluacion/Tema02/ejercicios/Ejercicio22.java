package PrimeraEvaluacion.Tema02.ejercicios;
/*
Hacer un programa que genere 10 números aleatoriamente y calcule su media.
 */


import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
        Random generador = new Random();
        //MANERA GPT
        /*int n = 10;
        int [] numeros = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            numeros [i] = generador.nextInt(11);
            suma += numeros[i];
        }
        System.out.println("Los numeros son");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        double media = suma / 10;
        System.out.println("la media de los numeros es " + media);

         */
        //MANERA CLASE
        int suma = 0;
        int numero = 0; // declaramos esta variable antes del for para poder recuperarla despues del for
        for (int i = 0; i < 10; i++) {
             numero = generador.nextInt(1, 11);
             suma = suma + numero;
            System.out.println("Numero: " + numero + " Suma: " + suma);
        }
        double media = suma / 10.0;
        System.out.printf("La media es %.2f ",media );
    }
}

