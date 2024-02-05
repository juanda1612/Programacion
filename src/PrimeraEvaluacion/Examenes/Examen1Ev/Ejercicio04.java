package PrimeraEvaluacion.Examenes.Examen1Ev;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JuanDaniel
 */
/*
Escribe un programa que lea una cadena por teclado y muestre
1. El número de veces que aparece cada vocal en la cadena (sin importar si aparece en
mayúscula o en minúscula). (1 punto)
2. El número de palabras que contiene (la cadena no contiene signos de puntuación). (0,5
puntos)
3. La longitud de la palabra más larga. Si hay más de una palabra con el tamaño máximo en esa
cadena, se deben mostrar todas ellas. Ejemplo: “En un lugar de La Mancha de cuyo nombre
no quiero acordarme” mostraría “La palabra más larga es “acordarme”, con 7 letras”. (1,5
puntos)
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
        String[]cadena2 = cadena.split(" ");
        String[] palabraLarga = {"Aplicacion.md"};
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        char a = 'a';
        char e = 'e';
        char ii = 'i';
        char o = 'o';
        char u = 'u';

        palabraLarga[0] = cadena2[0];

        for (int i = 0; i < cadena2.length; i++) {
            if (palabraLarga[0].length() < cadena2[i].length()){
                palabraLarga[0] = cadena2[i];
            }
        }

        cadena  = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == a){
                contadorA++;
            } else if (cadena.charAt(i) == e) {
                contadorE++;
            } else if (cadena.charAt(i) == ii) {
                contadorI++;
            } else if (cadena.charAt(i) == o) {
                contadorO++;
            } else if (cadena.charAt(i) == u) {
                contadorU++;
            }
        }
        System.out.println(palabraLarga[0]);
        System.out.print("Tiene: " + contadorA+ " Aplicacion.md, " + contadorE+ " e," + contadorI+ " i, " + contadorO+ " o, " + contadorU + " u, ");
        System.out.println("\nTiene: " +cadena2.length + " palabras");



    }
}
