package PrimeraEvaluacion.Tema02.ejercicios;
/*
A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete, ambas inclusive, Aplicacion.md menos que sea fin de semana, en cuyo caso necesitarán de 15 Aplicacion.md 25 tazas.
Escribe un programa que lea dos valores:
El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
El segundo es un booleano que indica si es fin de semana.
El programa debe imprimir si la fiesta tiene éxito o no (true o false).

 */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //ANTIGUA
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas tazas de mantequilla de cacahuete hay");
        int mantequilla = teclado.nextInt();
        System.out.println("Es fin de semana? si(1)/no(2)");
        int dia = teclado.nextInt();
        boolean exito;
        if (mantequilla >= 10 && mantequilla <= 20 && dia == 2){
            exito = true;
            System.out.println("Tiene exito: " + exito);
        }else if (mantequilla >= 15 && mantequilla <= 25 && dia == 1){
            exito = true;
            System.out.println("Tiene exito: " + exito);
        }else {
            exito = false;
            System.out.println("Tiene exito: " + exito);
        }

         */
        //NUEVA
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas tazas de mantequilla de cacahuete hay");
        int mantequilla = teclado.nextInt();
        System.out.println("Es fin de semana? true/false");
        boolean dia = teclado.nextBoolean();
        boolean exito;
        if (mantequilla >= 10 && mantequilla <= 20 && dia == false){
            exito = true;
            System.out.println("Tiene exito: " + exito);
        }else if (mantequilla >= 15 && mantequilla <= 25 && dia == true){
            exito = true;
            System.out.println("Tiene exito: " + exito);
        }else {
            exito = false;
            System.out.println("Tiene exito: " + exito);
        }
    }
}
