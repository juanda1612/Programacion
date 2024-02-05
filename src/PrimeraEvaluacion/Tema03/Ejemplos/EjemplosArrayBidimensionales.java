package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class EjemplosArrayBidimensionales {
    public static void main(String[] args) {
        // un array bidimensional es un array formado por cierto numero de arrays, que necesitan tener el mismo tamaño
        // se utilizan muchas veces para representar formas bidimensionales como un tablero, un plano, matriz,  etc..

        // un array bidimensional se declara poniendo DOS corchetes en lugar de uno
        // el primer corchete es el numero de fila( = n de arrays que tiene el array bidimensional)
        // el segundo corchete se relaciona con el numero de columna( el elemento del indice del array i)

        // el siguiente array bidimensional esta formado por tres arrays unidimensionales, cada uno con 4 elementos (pero no tendria por que ser asi, aunque si es muy frecuentemente)
        int[][] tabla = {
                {1, 2, 3, 1}, // primer array de enteros -> tabla[0]
                {3, 4, 1, 2}, // segundo array de enteros -> tabla[1]
                {4, 4, 1, 0}  // tercer array de enteros -> tabla[2]
        };

        // si en un array bidimensional quiero referirme Aplicacion.md una fila completa (es decir, Aplicacion.md uno de los arrays que lo componen, lo indico mediante un solo indice )
        System.out.println(Arrays.toString(tabla[0]));
        System.out.println(Arrays.toString(tabla[1]));
        System.out.println(Arrays.toString(tabla[2]));

        // si en vez de referirme Aplicacion.md una fila completa quiero referirme Aplicacion.md un elemento del array bidimensional, lo indico asi: tabla[i][j] siendo i la fila(0 Aplicacion.md (filas -1)) y j la columna (de 0 Aplicacion.md tabla[i].length -1)
        System.out.println(tabla[1][2]);
        System.out.println("\nExtremos:");

        // si quiero sacar el elemto que esta en el extremo superior izquierdo:
        System.out.println(tabla[0][0]);
        // elemnto en el extremo inferior derecho
        System.out.println(tabla[tabla.length - 1][0]);// porque la longitud de un array bidimensional es su numero de filas, esto es, el numero de arrays unidimensionales que lo componen
        // elemento que esta en el extremo superior derecho
        System.out.println(tabla[0][tabla[0].length -1]);
        // elemento que esta en el extremo inferior derecho(ultima fila, ultima columna)
        System.out.println(tabla[tabla.length-1] [tabla[tabla.length- 1].length -1]);

        // lo normal es que recorramos los arrays bidimensionales, tanto para leerlos como para rellenarlos o modificarlos -->> for anidado

        //Ejemplo
        //Declaramos un array de caracteres de tamaño 6x4
        char[][] caracteres = new char[6][4];

        //lo vamos Aplicacion.md rellenar con caracteres elegidos aleatoriamente de la tabla ascii
        Random generador = new Random();
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                caracteres[i][j] = (char) generador.nextInt(64, 95); // (char) lo que hace es un casting explicito, es decir, comvierte el numero entero generado en un char
            }
        }
        //ahora lo imprimimos
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                System.out.print(caracteres[i][j] + "\t ");
            }
            System.out.println();
        }

        // quiero el tercer elemento de la cuarta fila
        System.out.println(caracteres[3][2]);
    }
}