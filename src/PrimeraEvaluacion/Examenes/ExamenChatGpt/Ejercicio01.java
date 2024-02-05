package PrimeraEvaluacion.Examenes.ExamenChatGpt;
/*
Escribe un programa en Java que realice operaciones con un array de enteros. El array debe inicializarse con los siguientes valores: {12, 5, 8, 21, 9}. El programa debe realizar las siguientes tareas:

Mostrar el contenido del array.
Calcular y mostrar la suma de todos los elementos del array.
Encontrar y mostrar el valor máximo y mínimo en el array.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] array = {12, 5,  8, 21, 9};
        int suma = 0;

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        System.out.println(suma);

        Arrays.sort(array);
        System.out.println("Valor  minimo " + array[0]);
        System.out.println("Valor  maximo " + array[array.length - 1]);
    }
}
