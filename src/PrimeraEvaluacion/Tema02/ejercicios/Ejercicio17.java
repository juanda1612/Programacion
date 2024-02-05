package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que responda Aplicacion.md un usuario que quiere comprar un helado en una conocida marca de comida rápida cuanto le costará en función del topping que elija.
El helado sin topping cuesta 1.90€.
El topping de oreo cuesta 1€.
El topping de KitKat cuesta 1.50€.
El topping de brownie cuesta 0.75€.
El topping de lacasitos cuesta 0.95€.
En caso de no disponer del topping solicitado por el usuario el programa escribirá por pantalla «no tenemos este topping, lo sentimos. » y Aplicacion.md continuación informará del precio del helado sin ningún topping.
Finalmente, el programa escribe por pantalla el precio del helado resultante.

 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un topping");
        System.out.println("1. topping de oreo, 1€");
        System.out.println("2. topping de KitKat, 1.50€");
        System.out.println("3. topping de brownie, 0.75€");
        System.out.println("4. topping de lacasitos, 0.95€");
        System.out.println("5. sin topping");
        int topping = teclado.nextInt();
        double helado = 1.90;
        switch (topping){
            case 1:
                helado = helado + 1;
                System.out.println("Seran " +helado +"€");
                break;
            case 2:
                helado = helado + 1.50;
                System.out.println("Seran " +helado +"€");
                break;
            case 3:
                helado = helado + 0.75;
                System.out.println("Seran " +helado +"€");
                break;
            case 4:
                helado = helado + 0.95;
                System.out.println("Seran " +helado +"€");
                break;
            default:
                System.out.println("Se acabo ese topping, seran " + helado);
        }
    }
}
