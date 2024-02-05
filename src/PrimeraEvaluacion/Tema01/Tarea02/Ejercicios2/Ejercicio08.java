package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que pida un número de dos cifras, escribe un programa que permita obtener el número invertido. Ejemplo, si se introduce 23 que muestre 32.

 */

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de dos cifras");
        int num1 = teclado.nextInt();
        if (num1 >= 10 && num1 <= 99){
            int decena = num1 / 10;
            int unidades = num1 % 10;
            int invertido = unidades * 10 + decena;
            System.out.println(invertido);
        }
        }
    }

