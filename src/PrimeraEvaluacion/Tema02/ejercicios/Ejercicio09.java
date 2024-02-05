package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta o no. Suponemos que el año no es bisiesto. Ejemplo: 1-1-2001. Para que sea correcta, el año tiene que ser mayor que 0, el mes debe estar entre 1 y 12. Y el día según el mes que sea estará entre 1 y 31, o entre 1 y  30, o entre 1 y 28.
 */

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Introduce una fecha");
        System.out.println("dia");
        int dia = teclado.nextInt();
        System.out.println("mes");
        int mes = teclado.nextInt();
        System.out.println("año");
        int año = teclado.nextInt();


        if (año > 0) {
            if (mes >= 1 && mes <= 12) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("Correcto");
                    }else {
                        System.out.println("Incorrecto");
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 1 && dia <= 30) {
                        System.out.println("Correcto");
                    }else {
                        System.out.println("Incorrecto");
                    }
                } else{
                    if (dia >= 1 && dia <=28){
                        System.out.println("Correcto");
                    }else {
                        System.out.println("Incorrecto");
                    }
                }
            }else {
                System.out.println("Incorrecto");
            }
        }

         */

        //Nueva version
        // meto la fecha como una cadena de texto
        String fecha = teclado.nextLine(); // ejemplo 12-11-2012
        // divido en trozos y los guardo en un array
        String[] arrayFecha = fecha.split("-"); // [12, 11, 2012]
        // saco dia, mes, año en variables de tipo int -> Integer.parseInt
        int dia =Integer.parseInt(arrayFecha[0]);
        int mes =Integer.parseInt(arrayFecha[1]);
        int año =Integer.parseInt(arrayFecha[2]);
        // comprobamos si el año es correcto
        if (año > 0){
            if (mes >= 1 && mes <= 12){
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <=31){
                    System.out.println("Correcto");
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
                    System.out.println("Correcto");
                }else{
                    if (dia >= 1 && dia <= 28){
                        System.out.println("Correcto");
                    } else{
                        System.out.println("fecha incorrecta");
                    }
                }

            } else {
                System.out.println("Fecha incorrecta");
            }
        }else {
            System.out.println("Fecha incorrecta");
        }
    }
}
