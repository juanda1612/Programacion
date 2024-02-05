package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;

import java.util.Scanner;
/*Unas ardillas encuentran unas nueces y deciden dividirlas equitativamente. Escribe un programa que pregunte por el número de ardillas y nueces, y, Aplicacion.md continuación, calcule (y muestre) cuántas nueces corresponden Aplicacion.md cada ardilla y cuántas sobrarán tras el reparto.

 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("cuantas ardillas hay");
        int ardilla = teclado.nextInt();
        System.out.println(" cuantas nueces hay");
        int nueces = teclado.nextInt(); teclado.nextLine();

        int nardilla = nueces / ardilla;
        int resto = nueces % ardilla;
        System.out.println("Hay " + nardilla +" para cada ardilla y sobran "+ resto);
    }
}
