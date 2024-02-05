package PrimeraEvaluacion.Tema02.ejercicios2;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int n2 = n;
        if (n < 15) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n2; j++) {
                    if (j == n2 - 1) {
                        n2 = n2 - 1;
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("numero incorrecto");
        }
    }
}
