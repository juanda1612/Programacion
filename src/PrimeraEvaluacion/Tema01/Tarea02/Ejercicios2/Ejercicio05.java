package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Realiza un programa que reciba una cantidad de minutos y muestre por pantalla Aplicacion.md cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.

 */

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("minutos");
        int minutos = teclado.nextInt();
        int hora = 60;
        int cociente = minutos / hora;
        int resto = minutos % hora;
        System.out.println( minutos + " minutos son " + cociente +" horas y " + resto +" minutos");
    }
}
