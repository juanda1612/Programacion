package PrimeraEvaluacion.Tema02.ejercicios;
/*
El director de una escuela está organizando un viaje de estudios, y quiere determinar cuánto debe cobrar Aplicacion.md cada alumno y cuánto debe pagar Aplicacion.md la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
de 50 Aplicacion.md 99 alumnos, el costo es de 70 euros,
de 30 Aplicacion.md 49, de 95 euros,
y si son menos de 30, el costo del alquiler del autobús es de 4000 euros, sin importar el número de alumnos.
Escribe un programa que permita determinar el pago Aplicacion.md la compañía de autobuses y lo que debe pagar cada alumno por el viaje, si nos dicen el número de alumnos que van de viaje.

 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alumno = teclado.nextInt();
        if (alumno >= 100){
            alumno = alumno * 65;
            System.out.println("Se debe pagar por alumno 65 euros, el alquiler del autobus es de " + alumno);
        } else if (alumno >= 50 && alumno <= 99) {
            alumno = alumno * 70;
            System.out.println(" Se debe pagar por alumno 70 euros, el alquiler del autobus es de " + alumno);
        }else if (alumno >= 30 && alumno <= 49) {
            alumno = alumno * 95;
            System.out.println("Se debe pagar por alumno 95 euros, el alquiler del autobus es de " + alumno);
        }else {
            System.out.println("El alquiler del autobus es de 4000");
        }
    }
}
