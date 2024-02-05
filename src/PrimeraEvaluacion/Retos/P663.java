package PrimeraEvaluacion.Retos;

import java.util.Scanner;

public class P663 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int prueba = teclado.nextInt();
        int n = 0;
        for (int i = 0; i < prueba; i++) {
            n = teclado.nextInt();
            if (n > 0) {
                n = n - 1;
                System.out.println(n);
            }else {
                System.out.println(n);
            }
        }
    }
}
