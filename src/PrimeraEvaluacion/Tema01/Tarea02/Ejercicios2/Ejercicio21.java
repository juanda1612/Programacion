package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Realiza un programa que pida el precio de venta de un producto, la cantidad de productos comprados y el porcentaje de IVA aplicado. El programa mostrará el importe total Aplicacion.md abonar.
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad de producto");
        int producto = teclado.nextInt();
        System.out.println("Precio del producto");
        double precio = teclado.nextDouble();
        System.out.println("% IVA");
        double porcentajeiva = teclado.nextDouble();
        double subTotal = producto * precio;
        double total = subTotal + (subTotal * porcentajeiva) / 100;
        System.out.println("Son " + total + " $");
    }
}
