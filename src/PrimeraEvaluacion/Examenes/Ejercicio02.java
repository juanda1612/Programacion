package PrimeraEvaluacion.Examenes;

import java.util.Scanner;

/**
 * @author Juan Daniel
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la presion");
        String presion = teclado.nextLine();
        String humedad = teclado.nextLine();
        if (presion.equalsIgnoreCase("B")){
            if (humedad.equalsIgnoreCase("A")){
                System.out.println("Probabilidad de lluvia: media");
            } else if (humedad.equalsIgnoreCase("M")) {
                System.out.println("Probabilidad de lluvia: Alta");
            } else if (humedad.equalsIgnoreCase("B")) {
                System.out.println("Probabilidad de lluvia: Media");
            } else {
                System.out.println("Probabilidad de lluvia: Baja");
            }

        }else if (presion.equalsIgnoreCase("M")) {
            if (humedad.equalsIgnoreCase("M")) {
                System.out.println("Probabilidad de lluvia: media");
            } else {
                System.out.println("Probabilidad de lluvia: Baja");
            }
        }else {
            System.out.println("Probabilidad de lluvia: Baja");
        }


    }
}
