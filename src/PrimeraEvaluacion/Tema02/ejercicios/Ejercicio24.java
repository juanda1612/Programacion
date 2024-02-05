package PrimeraEvaluacion.Tema02.ejercicios;
/*
[FOR ANIDADO] Escribe un programa que reciba dos valores enteros por teclado, Aplicacion.md y b, y dibuje un rectángulo en que la base sea el número mayor y la altura el número menor, con un carácter también introducido por teclado.
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el caracter");
        String caracter = teclado.nextLine();
        System.out.println("Introduce la base y la altura");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        if (a > b){
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print(caracter + " ");
                }
                System.out.println();
            }
        }else{
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(caracter + " ");
                }
                System.out.println();
            }
        }
    }
}
