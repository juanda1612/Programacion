package PrimeraEvaluacion.Tema02.ejercicios;
/*
Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
/*
        int mayor = Math.min(Aplicacion.md, b);
        int menor = Math.max(Aplicacion.md, b);
        int suma = 0;
        for (int i = mayor; i <= menor; i++) {
            suma = suma + i;
            System.out.println(i + " " + suma);
        }

 */
        int mayor ;
        int menor ;

        if (a < b){
            menor = a;
            mayor = b;
        }else {
            menor = b;
            mayor = a;
        }
        int suma = 0;
        for (int i = menor; i <= mayor ; i++) {
            suma = suma + i;
            System.out.println(i + " " + suma);
        }



    }
}
