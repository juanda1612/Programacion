package ejercicios.ejerciciosLamda.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Holas");
        list.add("Hola que tal");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(0);
        list2.add(3);
        list2.add(2);
        list2.add(4);

        System.out.println("EJERCICIO 1.1");
        ImprimirLista ejercicio1 = lista -> System.out.println(lista);
        ejercicio1.imprimirLista(list);

        System.out.println("EJERCICIO 1.2");
        ImprimirLista5Caracteres ejercicio2 = lista -> {
            int contador = 0;
            for(String elemento: lista){
                if (elemento.length() > 5){
                    contador++;
                }
            }
            return contador;
        };
        System.out.println(ejercicio2.masDe5(list));

        System.out.println("EJERCICIO 1.3");
        ImprimirNumeroMayor ejercicio3 = lista -> {
            int numeroMayor = 0;
            for(int elemento: lista){
                if (elemento > numeroMayor){
                    numeroMayor = elemento;
                }
            }
            return numeroMayor;
        };
        System.out.println(ejercicio3.numeroMayor(list2));

        System.out.println("EJERCICIO 1.4");



    }
}
