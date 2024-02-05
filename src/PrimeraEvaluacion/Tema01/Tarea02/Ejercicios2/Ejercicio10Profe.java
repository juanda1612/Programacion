package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;

import java.util.Scanner;

public class Ejercicio10Profe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int euros = teclado.nextInt();
        int b500 = euros / 500;
        System.out.println(b500 + " billete de 500");
        int resto = euros % 500;
        int b200 = resto / 200;
        System.out.println(b200 + " billete de 200");
        int b100 = resto / 100;
        System.out.println(b100 + " billete de 100");
        resto = resto % 100;
        int b50 = resto / 50;
        System.out.println(b50 + " billete de 50");
        resto = resto % 50;
        int b20 = resto / 20;
        System.out.println(b20 + " billete de 20");
        resto = resto % 20;
        int b10 = resto / 10;
        System.out.println(b10 + " billete de 10");
        resto = resto % 10;
        int b5 = resto / 5;
        System.out.println(b5 + " billete de 5");
        resto = resto % 5;
        int e2 = resto / 2;
        System.out.println(e2 + " billete de 2");
        resto = resto % 2; // esto son las monedas de 1 euro


        System.out.println(resto);

    }
}
