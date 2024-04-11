package teoria.function;

import ejercicios.ejerciciosLamda.ejercicio1.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class EjemplosFunction {
    public static void main(String[] args) {
        Function<Double, Double> cuadrado = x -> Math.pow(x,2);
        Double resultado = cuadrado.apply(1.25);
        System.out.println(resultado);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepito", 19));
        personas.add(new Persona("Pablito", 25));
        personas.add(new Persona("Pedro", 7));
        personas.add(new Persona("Manolo", 18));
        personas.add(new Persona("Manolito", 35));
        personas.add(new Persona("Benito", 40));

        Map<String, Integer> mapaEdades = new HashMap<>();
        mapaEdades.put("Pepito", 19);
        mapaEdades.put("Pablito", 25);
        mapaEdades.put("Pedro", 7);
        mapaEdades.put("Manolo", 18);
        mapaEdades.put("Manolito", 35);
        mapaEdades.put("Benito", 40);
        System.out.println(mapaEdades);
        mapaEdades.forEach((nombre, edad)-> System.out.println(nombre + " " + edad));
        Function<Integer, Integer> aumentarEdad = edad -> edad +1;

        mapaEdades.replaceAll((nombre,edad) -> aumentarEdad.apply(edad));
        mapaEdades.forEach((nombre, edad)-> System.out.println(nombre + " " + edad));
    }
}
