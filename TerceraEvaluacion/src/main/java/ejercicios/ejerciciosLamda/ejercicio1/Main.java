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
        list2.add(2);

        List<Persona> personas = new ArrayList<>();
        Persona persona1 = new Persona("Pepito", 19);
        Persona persona2 = new Persona("Pablito", 25);
        Persona persona3 = new Persona("Pedro", 7);
        Persona persona4 = new Persona("Manolo", 18);
        Persona persona5 = new Persona("Manolito", 35);
        Persona persona6 = new Persona("Benito", 40);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        personas.add(persona6);

        List<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto("Movil",500.0);
        Producto producto2 = new Producto("TV",1000.0);
        Producto producto3 = new Producto("Altavoz",100.0);
        Producto producto4 = new Producto("Palo",9.0);
        Producto producto5 = new Producto("Disfraz",5.0);
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);

        System.out.println("EJERCICIO 1.1");
        ImprimirLista ejercicio1 = lista -> System.out.println(lista);
        ejercicio1.imprimirLista(list);

        System.out.println("\nEJERCICIO 1.2");
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

        System.out.println("\nEJERCICIO 1.3");
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

        System.out.println("\nEJERCICIO 1.4");
        ImprimirSumNumerosPares ejercicio4 = lista -> {
            int numero = 0;
            for (int elemento: lista){
                if (elemento % 2 == 0){
                    numero = numero + elemento;
                }
            }
            return numero;
        };
        System.out.println(ejercicio4.SumanumerosPares(list2));

        System.out.println("\nEJERCICIO 1.5");
        ImprimirPersonaJoven ejercicio5 = lista -> {
            Persona personaJoven = new Persona("",100);
            for (Persona persona : lista){
                if (persona.edad < personaJoven.edad){
                    personaJoven = persona;
                }
            }
            return personaJoven;
        };
        System.out.println(ejercicio5.personaJoven(personas));

        System.out.println("\nEJERCICIO 1.6");
        personas.sort((o1, o2) -> {
            if (o1.edad < o2.edad){
                return -1;
            } else if (o1.edad > o2.edad) {
                return 1;
            }else {
                return 0;
            }
        });
        for (Persona elemento: personas){
            System.out.println(elemento);
        }

        System.out.println("\nEJERCICIO 1.7");
        ImprimirPersonaMayor30 ejercicio7 = lista ->{
            List<Persona> personasMayor = new ArrayList<>();
            for (Persona elemento : personas){
                if (elemento.edad > 30){
                    personasMayor.add(elemento);
                }
            }
          return personasMayor;
        };
        System.out.println(ejercicio7.personasMayor30(personas));

        System.out.println("\nEJERCICIO 1.8");
        ImprimirPrecioTotal ejercicio8 = lista ->{
            double total = 0.0;
          for (Producto elemento : lista) {
                total = total + elemento.precio;
          }
          return total;
        };
        System.out.println(ejercicio8.precioTotal(productos));

        System.out.println("\nEJERCICIO 1.9");
        productos.sort((o1, o2) -> {
            if (o1.precio > o2.precio){
                return -1;
            } else if (o1.precio < o2.precio) {
                return 1;
            }else {
                return 0;
            }
        });
        for (Producto elemento : productos){
            System.out.println(elemento);
        }

        System.out.println("\nEJERCICIO 1.10");
        ImprimirProductoMenor10 ejercicio10 = lista ->{
            List<Producto> productosMenor10 = new ArrayList<>();
            for (Producto elemento: lista){
                if (elemento.precio < 10){
                    productosMenor10.add(elemento);
                }
            }
            return productosMenor10;
        };
        System.out.println(ejercicio10.productoMenor10(productos));
    }
}
