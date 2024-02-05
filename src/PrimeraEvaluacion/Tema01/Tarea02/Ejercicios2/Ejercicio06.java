package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos son 3 horas, 30 minutos y 10 segundos.
 */

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribre una cifra en segundos");
        int segundos = teclado.nextInt();
        /*int hora = 3600;
        int minuto = 60;
        int rhoras = segundos / hora;
        int rminuto = segundos / minuto;
        int rsegundo = segundos % minuto;
        System.out.println(segundos +"segundos son" + rhoras +" horas, " + rminuto +" y" + rsegundo + "segundos");

         */
        //PROFE
        int horas = segundos / 3600; // en cada hora hay 3600 segundos, por lo que si divido los segundos entre 3600 y me dan las horas que contienen
        int resto = segundos % 3600; // el resto son los segundos que sobran tras "extraer" las horas; ahora sacamos los minutos que hay en esos segundos
        // para eso dividimos ese resto entre 60 (segundos en cada minutos
        int minutos = resto / 60;
        // el resto de esa division son los segundos que quedan despues de sacar las horas y los minutos
        int segundosQueQuedan = resto % 60;
        System.out.println("En " + segundos + " segundos hay "+ horas + " horas , " + minutos +" minutos y " + segundosQueQuedan +" segundos");
    }
}
