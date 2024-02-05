package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que declare e inicialice una variable para cada uno de los tipos primitivos. A continuación, asigna sucesivamente una variable Aplicacion.md todas las demás. Completa la siguiente tabla con las asignaciones válidas (escribe “=” si una variable de la fila se puede asignar Aplicacion.md una de la columna, y “NO” en caso contrario).
 */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Asigna un valor");
        byte b = teclado.nextByte();
        short s = teclado.nextShort();
        int i = teclado.nextInt();
        long l = teclado.nextLong();
        float f = teclado.nextFloat();
        double d = teclado.nextDouble();
        char c = teclado.next().charAt(0);




    }
}
