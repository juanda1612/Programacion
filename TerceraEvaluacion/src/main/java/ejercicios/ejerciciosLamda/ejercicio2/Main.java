package ejercicios.ejerciciosLamda.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Felipe R", 54,new String[]{"Nauseas", "Mareos"});
        Paciente paciente2 = new Paciente("Irene M", 32,new String[]{"Tos", "Cansancio", "Mareos"});
        Paciente paciente3 = new Paciente("Carmen C", 15,new String[]{"Ansiedad"});
        Paciente paciente4 = new Paciente("Santiago A", 8,new String[]{"Fractura de cadera"});
        Paciente paciente5 = new Paciente("Isabel A", 60,new String[]{"Tos", "Amnesia", "Fiebre", "Dolor"});

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);

        System.out.println("SIN ORDENAR");
        for (Paciente elemento : pacientes){
            System.out.println(elemento);
        }

        System.out.println("\nORDENAR POR NOMBRE ASC");
        pacientes.sort((o1, o2) ->
            o1.nombre.compareTo(o2.nombre)
        );
        for (Paciente elemento : pacientes){
            System.out.println(elemento);
        }

        System.out.println("\nORDENAR POR NOMBRE DES");
        pacientes.sort((o1, o2) ->
                o1.nombre.compareTo(o2.nombre)
        );
        for (Paciente elemento : pacientes){
            System.out.println(elemento);
        }


        System.out.println("\nORDENAR POR EDAD ASC");
        pacientes.sort((o1, o2) -> {
            if (o1.edad > o2.edad){
                return -1;
            } else if (o1.edad < o2.edad) {
                return 1;
            } else {
                return 0;
            }
        });
        for (Paciente elemento : pacientes){
            System.out.println(elemento);
        }

        System.out.println("\nORDENAR POR EDAD DES");
        pacientes.sort((o1, o2) -> {
            if (o1.edad < o2.edad){
                return -1;
            } else if (o1.edad > o2.edad) {
                return 1;
            } else {
                return 0;
            }
        });
        for (Paciente elemento : pacientes){
            System.out.println(elemento);
        }

        System.out.println("\nORDENAR POR NUMERO DE SINTOMAS ASC");
        pacientes.sort((o1, o2) -> {
            if (o1.síntomas.length > o2.síntomas.length){
                return -1;
            } else if (o1.síntomas.length < o2.síntomas.length) {
                return 1;
            }else {
                return 0;
            }
        });
        for (Paciente elemento : pacientes){
            System.out.println(elemento);
        }

        System.out.println("\nORDENAR POR NUMERO DE SINTOMAS DES");
        pacientes.sort((o1, o2) -> {
            if (o1.síntomas.length < o2.síntomas.length){
                return -1;
            } else if (o1.síntomas.length > o2.síntomas.length) {
                return 1;
            }else {
                return 0;
            }
        });
        for (Paciente elemento : pacientes){
            System.out.println(elemento);
        }
    }
}
