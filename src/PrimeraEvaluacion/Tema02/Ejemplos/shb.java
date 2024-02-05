package PrimeraEvaluacion.Tema02.Ejemplos;

import java.util.Scanner;

public class shb {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String manzana = "manzana";
        int n = teclado.nextInt();
        String u = teclado.next();
        if (u.equals(manzana)) {
            for (int i = 0; i < n; i++) {
                System.out.println("manzana");
            }
        }
    }
}
