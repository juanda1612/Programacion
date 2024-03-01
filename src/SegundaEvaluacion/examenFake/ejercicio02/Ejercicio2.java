package SegundaEvaluacion.examenFake.ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int edad = pedirEdad();
        String tipo = devolverTipo(edad);
        imprimirTicket(devolverTipo(edad), calcularPrecio(tipo));
    }

    public static int pedirEdad(){
        System.out.println("Edad?");
        return teclado.nextInt();
    }

    public static String devolverTipo(int edad){
        if (edad >= 18) {
            return "Adulto";
        }else {
            return "Niño";
        }
    }

    public static int calcularPrecio(String tipo){
        if (tipo.equalsIgnoreCase("Adulto")){
            return 4;
        }else {
            return 2;
        }
    }

    public static void imprimirTicket(String tipo, int precio){
        System.out.println("-------------------------------");
        System.out.println("|        TIKET DE ENTRADA      |");
        System.out.println("|"+ tipo+ "Precio:" + precio+" |");
        System.out.println("--------------------------------");
    }
}
