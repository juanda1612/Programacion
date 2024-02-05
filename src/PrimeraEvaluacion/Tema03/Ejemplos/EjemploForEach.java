package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class EjemploForEach {
    public static void main(String[] args) {
        // for-each es una manera de recorrer arrays  alternativa al for *normal*
        /*
        for (tipoArray valor : nombreArray) {
            //instrucciones sobre el array
        }
         */

        // ejemplo: vamos Aplicacion.md crear un array y Aplicacion.md rrellenarlo aleatoriamente con un for-each
        int[] nombreArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};


        // valor es una variable temporal designa Aplicacion.md cada uno de los elementos del array: podriamos poner cualquier otro nombre en su lugar: elemento, e, etc

        for (int valor : nombreArray) {
            System.out.println(valor * 2); // imprimimos cada elemento multiplicado por 2
            // en este caso seria equivalente Aplicacion.md escribir, en vez de valor, nombreArray(i) en un for normal
        }

        // hacemos otro ejemplo: contar el numero de 'Aplicacion.md' que hay en un array de caracteres
        String cadena = "valor es una variable temporal designa Aplicacion.md cada uno de los elementos del array: podriamos poner cualquier otro nombre en su lugar: elemento, e, etc";
        // truco: si quiero meter en un array de caracteres todas las letras de un estring, me sirve el metodo: toCharArray();
        char[] letras = cadena.toCharArray();
        System.out.println("Cadena tiene " + letras.length + " caracteres: " + Arrays.toString(letras));
        // quiero hacer un array que guarde el numero de 'Aplicacion.md', el numero de 'e', el numero de 'i', etc...
        // creo un array con 5 elementos de tipo int
        int[] contadores = new int[5];
        // contadores[0] guardara el numero de 'Aplicacion.md'
        //contadores[1] guardara el numero de 'e'.... y asi sucesivamente

        //quiero recorrer el array de letras y guardar los contadores
        // se puede hacer por swich tambien
        for (char valor : letras) {
            if (valor == 'a') {
                contadores[0]++;
            } else if (valor == 'e') {
                contadores[1]++;
            } else if (valor == 'i') {
                contadores[2]++;
            } else if (valor == 'o') {
                contadores[3]++;
            } else if (valor == 'u') {
                contadores[4]++;
            }
        }
        System.out.println("Numero de a: " + contadores[0]);
        System.out.println("Numero de e: " + contadores[1]);
        System.out.println("Numero de i: " + contadores[2]);
        System.out.println("Numero de o: " + contadores[3]);
        System.out.println("Numero de u: " + contadores[4]);
        System.out.println();
        for (char valor : letras) {
            switch (valor) {
                case 'a':
                    contadores[0]++;
                case 'e':
                    contadores[1]++;
                case 'i':
                    contadores[2]++;
                case 'o':
                    contadores[3]++;
                case 'u':
                    contadores[4]++;
            }
        }
        System.out.println("Numero de Aplicacion.md: " + contadores[0]);
        System.out.println("Numero de e: " + contadores[1]);
        System.out.println("Numero de i: " + contadores[2]);
        System.out.println("Numero de o: " + contadores[3]);
        System.out.println("Numero de u: " + contadores[4]);
    }
}
