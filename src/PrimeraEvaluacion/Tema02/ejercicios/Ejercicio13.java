package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o « mover Aplicacion.md la izquierda », o« mover Aplicacion.md la derecha », o« no mover », según el número introducido). Si es un número que no pertenece Aplicacion.md ninguna de las direcciones enumeradas, el programa debería generar: « ¡error! »
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una direccion");
        System.out.println("1, arriba");
        System.out.println("2, abajo");
        System.out.println("3, izquierda");
        System.out.println("4, derecha");
        System.out.println("0, no mover");
        int num = teclado.nextInt();
        /*if ( num == 1){
            System.out.println("subir");
        } else if (num == 2) {
            System.out.println("bajar");
        }else if (num == 3) {
            System.out.println("mover izquierda");
        }else if (num == 4) {
            System.out.println("mover derecha");
        }else if (num == 0) {
            System.out.println("no mover");
        }else {
            System.out.println("¡error!");
        }

         */
        switch (num){
            case 1:
                System.out.println("subir");
                break;
            case 2:
                System.out.println("bajar");
                break;
            case 3:
                System.out.println("mover izquierda");
                break;
            case 4:
                System.out.println("mover derecha");
                break;
            case 0:
                System.out.println("no mover");
                break;
            default:
                System.out.println("¡error!");
        }
    }
}
