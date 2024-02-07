package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Programador p = new Programador();

        System.out.println(p);

        // setters heredados de Persona
        p.setAñoNacimiento(2000);
        p.setNombre("Pikachu");
        p.setDirección("Calle Pez 5");

        // setters heredados de Empleados
        p.setFechaInicio(LocalDate.of(2000,12,02));
        p.setSalario(5000L);

        // setter de la propia clase Programador
        p.setLenguajes(new String[] { "Java", "SQL", "HTML" });


        System.out.println("*************");
        System.out.println(p);

    }
}
