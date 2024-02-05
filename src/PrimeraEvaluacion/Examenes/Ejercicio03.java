package PrimeraEvaluacion.Examenes;

import java.util.Scanner;

/**
 * @author Juan Daniel
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //YO
        int n1 ;
        int n2 ;
        do {
            System.out.println("Introduce dos numeros enteros");
            n1 = teclado.nextInt();
            n2 = teclado.nextInt();

            if (n2 < n1) {
                for (int i = n2; i <= n1; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            } else if (n1 < n2) {
                for (int i = n1; i <= n2; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            }else {
                System.out.println("Error, intentalo de nuevo");
            }
        }while (n1 == n2);
    }
}
