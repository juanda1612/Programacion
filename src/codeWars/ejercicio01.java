package codeWars;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio01 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        int resultado = sumaDigitosIterativa(numero);
        System.out.println("El resultado final es: " + resultado);
    }
    public static int sumaDigitosIterativa(int num) {
        while (num > 9) {
            num = digital_root(num);
        }
        return num;
    }
    public static int digital_root(int n) {
        int suma = 0;
        while (n != 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }
}
