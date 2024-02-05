package SegundaEvaluacion.Colecciones.Ejercicios;
/*
 Escribir un programa que cree un diccionario de traducción español-inglés. El usuario introducirá las palabras en español e inglés separadas por dos puntos, y cada par <palabra>:<traducción> separados por comas. El programa debe crear un diccionario con las palabras y sus traducciones. Después pedirá una frase en español y utilizará el diccionario para traducirla palabra Aplicacion.md palabra. Si una palabra no está en el diccionario debe dejarla sin traducir.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio03Colecciones {
    public static void main(String[] args) {
        /*
        El usuario introducirá las palabras en español e inglés separadas por dos puntos, y cada par <palabra>:<traducción> separados por comas.
         */
        // perro:dog,gato:cat,mesa:table,silla:chair,clase:class,conseguir:get,establecer:set,encima:on
        Scanner teclado = new Scanner(System.in);
        String linea = teclado.nextLine();
        System.out.println(linea);
        // lo siguiente es meter los pares epañol:ingles
        String[] pares = linea.split(",");
        System.out.println(Arrays.toString(pares));

        // creo un mapa - diccionario en que la clave es la palabra en español y el valor es la palabra en ingles
        HashMap<String, String> traductor = new HashMap<>();
        for (int i = 0; i < pares.length; i++) {
            // en cada par separo la palabra en español de la palabra en ingles
            String[] separador = pares[i].split(":");
            String español = separador[0];
            String ingles = separador[1];
            traductor.put(español,ingles);
        }
        // Después pedirá una frase en español y utilizará el diccionario para traducirla palabra Aplicacion.md palabra. Si una palabra no está en el diccionario debe dejarla sin traducir.
        //La frase que meteremos es esta:
        //El perro esta encima de la mesa
        //El gato esta debajo de la silla
        System.out.println("Introduce la frase Aplicacion.md traducir: ");
        // Reutilizamos la variable linea
        linea = teclado.nextLine();
        String[] palabrasFrase = linea.split(" ");
        // recorremos este array de palabras para ir traduciendolas una Aplicacion.md una
        for (String palabraEspañol: palabrasFrase) {
            if (traductor.containsKey(palabraEspañol)){
                System.out.print(traductor.get(palabraEspañol)+ " "); // palabraEspañol es la clave(Key) para obtener su traduccion con get(palabraEspañol)
            }else {
                System.out.print(palabraEspañol + " ");// si no esta esa clave en el mapa, que imprima la palabra tal cual
            }
        }
    }
}
