package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Haz el ejercicio anterior aplicando, además, un descuento del 15% sobre el total de la compra.
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad de producto");
        int producto = teclado.nextInt();
        System.out.println("Precio del producto");
        double precio = teclado.nextDouble();
        System.out.println("% IVA");
        double porcentajeIva = teclado.nextDouble();
        System.out.println("% Descuento");
        double porcentajeDescuento = teclado.nextDouble();

        double subTotal = producto * precio;
        double descuento = subTotal - (subTotal * porcentajeDescuento) / 100;
        subTotal = descuento;
        double total = subTotal + (subTotal * porcentajeIva) / 100;
        System.out.printf("Son %.2f", total, " $");
    }
}
