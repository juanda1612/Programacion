package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Un vendedor recibe un sueldo base mas un 10% de comisión por comisión sobre el total de las ventas que realice. El vendedor realiza tres ventas este mes y quiere saber cuánto dinero obtendrá por concepto de comisiones y el total que cobrará. Todos los datos que se desconocen se piden por teclado.
 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el sueldo base");
        double sueldo = teclado.nextDouble();
        System.out.println("Introduce el numero de ventas");
        int ventas = teclado.nextInt();
        System.out.println("Introduce dinero de venta");
        int ingresoVentas = teclado.nextInt();
        System.out.println("Introduce el % de comision");
        double porcentajeComision = teclado.nextDouble();

        int comisionVenta = ventas * ingresoVentas;
        double comisionTotal = (comisionVenta * porcentajeComision) / 100;
        double total = comisionTotal + sueldo;
        System.out.println("Por comisiones cobrara " + comisionTotal + "$ y en total cobrara " + total);



    }
}
