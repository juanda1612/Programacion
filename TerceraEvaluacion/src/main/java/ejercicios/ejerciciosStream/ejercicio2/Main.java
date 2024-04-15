package ejercicios.ejerciciosStream.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static ejercicios.ejerciciosStream.ejercicio2.Arma.*;

public class Main {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();

        personajes.add(new Personaje("Gandalf", Integer.MAX_VALUE, Baston , false));

        personajes.add(new Personaje("Aragorn",88, Espada, true));

        personajes.add(new Personaje("Gimli", 140, Hacha , false));

        personajes.add(new Personaje("Legolas",2931, Arco, false));

        personajes.add(new Personaje("Boromir",41, Espada, true));

        personajes.add(new Personaje("Frodo", 51, Anillo , false));

        personajes.add(new Personaje("Sam",33, Espada, false));

        // Filtrar los personajes que sean jóvenes (menos de 90 años) y lleven espada.
        System.out.println("\n MENORES DE 90 Y ESPADA");
        personajes.stream()
                .filter(personaje -> personaje.getEdad()<90 && personaje.getArma().equals(Espada))
                .forEach(personaje -> System.out.println(personaje));

        //Filtrar los personajes que no usan espada.
        System.out.println("\n NO USAN ESPADA");
        personajes.stream()
                  .filter(personaje -> !personaje.getArma().equals(Espada))
                  .forEach(personaje -> System.out.println(personaje));

        //Muestra los personajes ordenados por orden alfabético.
        System.out.println("\n ORDEN ALFABETICO");
        personajes.stream()
                  .sorted((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()))
                  .forEach(personaje -> System.out.println(personaje));

        //Muestra los personajes humanos.
        System.out.println("\n HUMANOS");
        personajes.stream()
                  .filter(personaje -> personaje.isHumano())
                  .forEach(personaje -> System.out.println(personaje));

        //Muestra el personaje más viejo.
        System.out.println("\n MAS VIEJO");
        System.out.println(personajes.stream()
                                     .mapToInt(personaje -> personaje.getEdad())
                                     .max());

        System.out.println("\n CHATGPT");
        personajes.stream()
                .max(Comparator.comparingInt(Personaje::getEdad))
                .ifPresent(System.out::println);

        System.out.println("\n CHATGPT REDUCIDA POR MI");
        System.out.println(personajes.stream()
                                     .max(Comparator.comparingInt(personaje -> personaje.getEdad())));



    }
}
