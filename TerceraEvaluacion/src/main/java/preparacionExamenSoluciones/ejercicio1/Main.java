package preparacionExamenSoluciones.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pepito", 20, new double[]{7.5, 8.0, 6.5}));
        estudiantes.add(new Estudiante("Pedro", 22, new double[]{6.0, 7.0, 8.0}));
        estudiantes.add(new Estudiante("Sebas", 21, new double[]{8.5, 7.5, 9.0}));

        System.out.println("Estudiantes sin ordenar:");
        GestorEstudiantes.mostrarEstudiantes(estudiantes);

        GestorEstudiantes.ordenarPorMedia(estudiantes);

        System.out.println("\nEstudiantes ordenados por promedio de calificaciones:");
        GestorEstudiantes.mostrarEstudiantes(estudiantes);

    }
}
