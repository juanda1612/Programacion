package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para simplificarlo vamos Aplicacion.md suponer que febrero tiene 28 días.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de mes");
        int numeroMes = teclado.nextInt();
        String mesDia = "30 31 28";
        String mesNombre = "Enero Febrero Marzo Abril Mayo Junio Julio Agosto Septiembre Octubre Noviembre Diciembre";

        String[] array = mesDia.split(" ");

        String[] arrayNombre = mesNombre.split(" ");

        int[] arrayDia = new int[array.length];
        for (int i = 0; i < arrayDia.length; i++) {
            arrayDia[i] = Integer.parseInt(array[i]);
        }

        switch (numeroMes){
            case 1:
                System.out.println(arrayDia[1] + " " + arrayNombre[0]);
                break;
            case 2:
                System.out.println(arrayDia[2] + " " + arrayNombre[1]);
                break;
            case 3:
                System.out.println(arrayDia[1] + " " + arrayNombre[2]);
                break;
            case 4:
                System.out.println(arrayDia[0] + " " + arrayNombre[3]);
                break;
            case 5:
                System.out.println(arrayDia[1] + " " + arrayNombre[4]);
                break;
            case 6:
                System.out.println(arrayDia[0] + " " + arrayNombre[5]);
                break;
            case 7:
                System.out.println(arrayDia[1] + " " + arrayNombre[6]);
                break;
            case 8:
                System.out.println(arrayDia[1] + " " + arrayNombre[7]);
                break;
            case 9:
                System.out.println(arrayDia[0] + " " + arrayNombre[8]);
                break;
            case 10:
                System.out.println(arrayDia[1] + " " + arrayNombre[9]);
                break;
            case 11:
                System.out.println(arrayDia[0] + " " + arrayNombre[10]);
                break;
            case 12:
                System.out.println(arrayDia[1] + " " + arrayNombre[11]);
                break;
        }


    }
}
