package PrimeraEvaluacion.Tema02.ejercicios;
/*
Realizar un programa que pida un número entero por teclado y visualice el dia de la semana correspondiente.
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("que dia es: 1 lunes - 7 domingo");
        int dia = teclado.nextInt();
        switch (dia){
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
            break;
            case 3:
                System.out.println("Miercoles");
            break;
            case 4:
                System.out.println("Jueves");
            break;
            case 5:
                System.out.println("Viernes");
            break;
            case 6:
                System.out.println("Sabado");
            break;
            case 7:
                System.out.println("Domingo");
            break;
            default:
                System.out.println("No has introducido un dia valido");
        }
    }

}
