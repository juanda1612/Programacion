package PrimeraEvaluacion.Retos;
/*
    1. insectos -> 6 patas
    2. aracnidos -> 8 patas
    3. crustaceos -> 10 patas
    4. escolopendras
    5. nº de anillos de los escolopendras

    1 1 1 1 15
    nº de patas: 1*6 + 1 * 8 + 1 * 10 + (1 * 15 * 2)
    hay 1 escolopendra que tiene 15 anillos

 */

import java.util.Scanner;

public class P293 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidadDeCasos = teclado.nextInt(); teclado.nextLine();

        for (int i = 0; i < cantidadDeCasos; i++) {
            String cadena = teclado.nextLine();


            String[] array = cadena.split(" ");

            int[] numeros = new int[array.length];

            for (int j = 0; j < 5; j++) {
                numeros[j] = Integer.parseInt(array[j]);
            }
            int resultado = numeros[0] * 6 + numeros[1] * 8 + numeros[2] * 10 + (numeros[3] * numeros[4] * 2);
            System.out.println(resultado);
        }
        teclado.close();


    }
}
