package SegundaEvaluacion.EjerciciosCasa;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class ahorcado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        boolean juego = true;
        String palabra = "ahorcado";
        ArrayList<String> miPalabra = new ArrayList<>();
        String letra;
        ArrayList<String> muneco2 = new ArrayList<>();

        int indice = 0;
        int errores = 0;

        do {
            System.out.println("Elige una letra");
            letra = teclado.nextLine();

            if (letra.equals(palabra)){
                System.out.println("Ganaste");
                juego = false;

            } else if (letra.equals(String.valueOf(palabra.charAt(indice)))) {
                miPalabra.add(letra);
                indice++;

                StringJoiner cadena = new StringJoiner("");
                for (String i: miPalabra) {
                    cadena.add(i);
                }
                String palabra2 = cadena.toString();
                if (palabra2.equals(palabra)) {
                    System.out.println("Ganaste \nla palabra era: " + palabra2);
                    juego = false;
                } else {
                    System.out.println("Palabrra actual: " + palabra2);
                }

            } else {
                System.out.println("No es esa letra");
               if (errores == 0){
                   muneco2.add("____\n");
                   System.out.println("No esta esa letra\n" + muneco2);
                   errores++;
               } else if (errores == 1) {
                   muneco2.add("  |\n\t0\n");
                   System.out.println("No esta esa letra\n" + muneco2);
                   errores++;
               } else if (errores == 2) {
                   muneco2.add(" /|\\\n");
                   System.out.println("No esta esa letra\n" + muneco2);
                   errores++;
               } else if (errores == 3) {
                   muneco2.add("  |\n");
                   System.out.println("No esta esa letra\n" + muneco2);
                   errores++;
               } else if (errores == 4) {
                   muneco2.add(" /'\\\n");
                   System.out.println("No esta esa letra\n" + muneco2);
                   System.out.println("Perdiste, la palabra era: " + palabra);
                   juego = false;
               }
            }
        }while (juego);
    }
}
