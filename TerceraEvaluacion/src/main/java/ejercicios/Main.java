package ejercicios;

import teoria.biblioteca.CompararEdad;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", 22, 152);
        Persona persona2 = new Persona("Pepe", 23, 172);
        Persona persona3 = new Persona("Pepe", 24, 192);
        Persona persona4 = new Persona("Pepe", 25, 162);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        ComparadorAltura comparadorAltura = new ComparadorAltura();


        System.out.println("COMPARAR ALTURA");
        personas.sort(comparadorAltura);

        for(Persona elemento: personas){
            System.out.println(elemento);
        }

        CompararEdad compararEdad = new CompararEdad();

        System.out.println("COMPARAR EDAD");
        personas.sort(compararEdad);

        for(Persona elemento: personas){
            System.out.println(elemento);
        }


    }
}
