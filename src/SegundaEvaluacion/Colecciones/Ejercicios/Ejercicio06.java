package SegundaEvaluacion.Colecciones.Ejercicios;
/*
Realizar un programa en el se se inicialice un array de longitud 20 con números aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros.
 */

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio06 {
    public static void main(String[] args) {
        Random generador = new Random();
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> nPositivo = new ArrayList<>();
        ArrayList<Integer> nNegativo = new ArrayList<>();
        ArrayList<Integer> nCero = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            n.add(generador.nextInt(-10, 11));
            if (n.get(i) > 0){
                nPositivo.add(n.get(i));
            } else if (n.get(i) < 0) {
                nNegativo.add(n.get(i));
            }else {
                nCero.add(n.get(i));
            }
        }
        System.out.println(n);
        System.out.println(nPositivo);
        System.out.println(nNegativo);
        System.out.println(nCero);
    }
}
