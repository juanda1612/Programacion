package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

/*
Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Introduce un caracter");
        String vocal = teclado.nextLine();
        while (true){
            if (vocal.equalsIgnoreCase(" ")){
                break;
            }if (vocal.equalsIgnoreCase("Aplicacion.md")){
                System.out.println("VOCAL");
            } else if(vocal.equalsIgnoreCase("e")) {
                System.out.println("VOCAL");
            } else if(vocal.equalsIgnoreCase("i")) {
            System.out.println("VOCAL");
            }else if(vocal.equalsIgnoreCase("o")) {
                System.out.println("VOCAL");
            }else if(vocal.equalsIgnoreCase("u")) {
                System.out.println("VOCAL");
            } else {
                System.out.println("CONSONANTE");
            }
            vocal = teclado.nextLine();
        }
        System.out.println("terminado");

         */

        //CLASE
        char n = teclado.nextLine().charAt(0);
        while (n != ' '){
            n = teclado.nextLine().charAt(0);
            if (n == 'a' || n == 'e'|| n == 'i' || n == 'o'|| n == 'u'|| n == 'A' || n == 'E'|| n == 'I' || n == 'O'|| n == 'U'){
                System.out.println("ES VOCAL");
            }else {
                System.out.println("ES CONSONANTE");
            }
        }
        System.out.println("FIN");
    }
}
