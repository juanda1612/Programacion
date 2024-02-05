package PrimeraEvaluacion.Tema02.ejercicios;
/*
Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
 */

public class Ejercicio36 {
    public static void main(String[] args) {
        //YO
        /*int n = 1;
        int total = 1;
        while (n <= 20){
            total = n * 5;
            System.out.print(total + " ");
            n++;
        }

         */
        /*
        //CLASE
        int n = 0;
        while (n < 20){
            n = n + 1;
            System.out.print(5 * n + " ");
        }

         */
        //PROFE
        int i = 0;
        int contador = 0; // este contador se incrementa 1 cada vez que encontremos un multiplo de 5
        while (contador < 20){
            if (i % 5 == 0 && i != 0){
                // entra si i es multiplo de 5
                System.out.print(i + " ");
                contador++; // este contador solo se incrementa si el i de la vuelta actual es multiplo de 5
            }
            i++;
        }
    }
}
