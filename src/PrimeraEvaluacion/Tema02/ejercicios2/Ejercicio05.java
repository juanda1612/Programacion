package PrimeraEvaluacion.Tema02.ejercicios2;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if (n % 2 != 0){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n; j++) {
                    if (j % 2 == 0){
                        System.out.println("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
