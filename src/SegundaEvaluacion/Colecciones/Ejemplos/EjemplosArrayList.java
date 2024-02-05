package SegundaEvaluacion.Colecciones.Ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjemplosArrayList {
    public static void main(String[] args) {
        // son como los array, pero pueden cambiar de tamaño
        // una diferencia importante: no pueden guardar tipos primitivos: int, boolean,double..
        // en su lugar hay que utilizar lo que se llaman clases envoltorio (wrapper):
        // en vez de int usamos Integer, en vez de double usamos Double, en vez de boolean usamos Boolean, en vez de char usamos Character
        ArrayList<Integer> enteros = new ArrayList<>();
        // métodos Aplicacion.md utilizar:
        System.out.println(enteros.size());// tamaño: es el equivalente en los arrays Aplicacion.md Length
        // para añadir elementos: add
        enteros.add(53);
        System.out.println(enteros.size());
        for (int i = 30; i <= 40 ; i++) {
            enteros.add(i);
        }
        System.out.println(enteros.size());
        // y si quiero ver que elementos tiene: get()
        for (int i = 0; i < enteros.size(); i++) {
            System.out.print(enteros.get(i) + " ");
        }
        System.out.println("\n\n=====================");

        // ahora cogemos los ejemplos de los apuntes

        ArrayList<String> nombres = new ArrayList<>();
        // añadimos elementos
        nombres.add("Justino");      // [Justino]
        nombres.add("Helena");       // [Justino, Helena]
        System.out.println(nombres); // imprimir un arrayList es mucho mas facil
        nombres.add(1, "Joshua");   // [Justino, Joshua, Helena]
        System.out.println("Meto Aplicacion.md Joshua en el indice 1" + nombres);
        nombres.add(0, "Laura");    // [Laura, Justino, Joshua, Helena]
        System.out.println(nombres);
        System.out.println("Meto Aplicacion.md Laura en el indice 0" + nombres);
        // añadimos dos nombres mas pero al principio: es decir, en los indices 0 y 1

        // set sirve para reemplazar un elemento por otro diciendo el indice

        // queremos meter Aplicacion.md Mario en lugar de Laura, que esta en el indice 3
        nombres.set(3, "Mario");
        System.out.println("He sustituido Aplicacion.md Helena por Mario: " + nombres);

        // queremos eliminar Aplicacion.md Justina de la lista
        nombres.remove("Justino");
        System.out.println("Eliminamos Aplicacion.md Justino: " + nombres);

        // ordenar un arrayList
        Collections.sort(nombres);
        System.out.println("ArrayList ordenado: " + nombres);

    }
}
