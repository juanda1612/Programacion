package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArrayTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // tenemos que declarar un array y asignar un tamaño
        // vamos Aplicacion.md meter el tamaño por teclado
        int n = teclado.nextInt();
        teclado.nextLine(); // para que no *salte* Aplicacion.md la hora de meter luego un teclado.nexLine
        // suponemos que queremos rellenar el array con cadenas de texto
        String[] cadenas = new String[n];

        // ahora con un for vamos rellenandolo
        for (int i = 0; i < cadenas.length; i++) {
            // en el elemento con indice i de cadenas guardamos lo que entre por teclado
            // no es necesario creal una variable aparte
            cadenas[i] = teclado.nextLine();
        }

        System.out.print(Arrays.toString(cadenas));
    }
}
