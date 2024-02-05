package PrimeraEvaluacion.Tema02.Ejemplos;


import java.util.Scanner;

public class EjemplosDoWhile {
    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println(i); // en este caso siempre imprime 0
            i++;
        } while (i < 11);

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        i = 1;
        do {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            i++;
            } while (i < n);
        }
}