package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios.Codeandcoke;
/**
 * @see <Aplicacion.md href="https://java.codeandcoke.com/apuntes:introduccion></Aplicacion.md>
 * Haz un programa que solicite dos números y diga si son o no iguales
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero");
        int numero1 = teclado.nextInt(); teclado.nextLine();
        System.out.print("Introduce el segundo numero");
        int numero2 = teclado.nextInt(); teclado.nextLine();
        // y diga si son o no iguales
        boolean iguales = (numero1 == numero2); //comparo si son iguales y guardo true o false en la variable
        System.out.print("Son iguales: " +iguales);
    }
}
