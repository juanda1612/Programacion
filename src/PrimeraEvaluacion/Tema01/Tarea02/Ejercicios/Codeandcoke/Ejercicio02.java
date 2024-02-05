package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios.Codeandcoke;
//Realiza un programa que solicite un número y diga si es positivo o negativo

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es igual Aplicacion.md 0");
        }
    }
}
