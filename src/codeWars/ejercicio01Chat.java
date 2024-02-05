package codeWars;

import java.util.Scanner;

public class ejercicio01Chat {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        int resultado = sumaDigitosIterativa(numero);
        System.out.println("El resultado final es: " + resultado);

    }
    // Método para sumar los dígitos de un número de forma iterativa


    public static int sumaDigitosIterativa(long num) {
        while (num > 9) {
            num = sumaDigitos(num);
        }
        return (int) num;
    }

    // Método para sumar los dígitos de un número
    public static long sumaDigitos(long num) {
        long suma = 0;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}
