package PrimeraEvaluacion.Tema02.ejercicios;
/*
Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una cadena que represente una casa (puedes asociarla Aplicacion.md un número para hacer más fácil la entrada por teclado) y que obtenga lo siguiente:
si es "gryffindor" , salida "valentía" ;
si es "hufflepuff" , salida "lealtad" ;
si es "slytherin" , salida "astucia" ;
si es "ravenclaw" , salida "intelecto" ;
de lo contrario, se muestra "no es una casa válida" .

 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una casa: ");
        System.out.println("1. gryffindor");
        System.out.println("2. hufflepuff");
        System.out.println("3. slytherin");
        System.out.println("4. ravenclaw");
        int casa = teclado.nextInt();
        // una vez seleccionada una opcion, escribimos una u otra cosa en funcion de esa opcion
       /* if (casa == 1){
            System.out.println("valentía");
        } else if (casa == 2) {
            System.out.println("lealtad");
        } else if (casa == 3) {
            System.out.println("astucia");
        } else if (casa == 4) {
            System.out.println("intelecto");
        } else {
            System.out.println("no es una casa válida");
        }

        */
        switch (casa){
            case 1:
                System.out.println("valentia");
                break;
            case 2:
                System.out.println("lealtad");
                break;
            case 3:
                System.out.println("astucia");
                break;
            case 4:
                System.out.println("intelecto");
                break;
            default:
                System.out.println("no es una casa valida");
        }
    }
}
