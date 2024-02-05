package PrimeraEvaluacion.Tema02.Ejemplos;

import java.util.Random;

public class EjemplosRandom {
    public static void main(String[] args) {
        // La clase Random sirve para generar numeros al azar.
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt( 10);
        // Vamos Aplicacion.md generar y mostrar 100 numeros aleatorios con un for
        for (int i = 0; i < 100; i++) {
            System.out.print(numeroAleatorio + " ");
            //numeroAleatorio = generador.nextInt( 10); //Genera numeros entre 0 y 9
            numeroAleatorio = generador.nextInt( 1, 11); //Genera numeros entre 1 y 10
            //En general, si quieres generar numeros entre min y max,
            //haces generador.nextInt(min , max + 1)
        }
        //Otro ejemplo: queremos generar 50 numeros aleatorios entre -10 y 10, ambos inclusive
        System.out.println("50 Numeros entre -10 y 10");
        for (int i = 0; i < 50; i++) {
            System.out.print(generador.nextInt(-10, 11) + " ");

        }
    }
}
