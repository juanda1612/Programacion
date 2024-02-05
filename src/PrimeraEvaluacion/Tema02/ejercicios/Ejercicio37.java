package PrimeraEvaluacion.Tema02.ejercicios;
/*
Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5, añadiendo un salto de línea cada 10 números.
 */

public class Ejercicio37 {
    public static void main(String[] args) {
        /*
        int contador = 1;
        int multiplo = 5;
        int total = 1;
        int reinicio = 0;
        while (contador <= 50){
            total = contador * multiplo;
            if (reinicio == 10){
                reinicio = 0;
                System.out.println();
            }
            System.out.print(total + " ");
            contador++;
            reinicio++;
        }

         */
        // 2º version

        int contador = 0;
        int i = 0;
        while (contador < 50){
            i++;
            if (i % 5 == 0){
                contador++;
                System.out.print(i + "\t");
                if (contador % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
