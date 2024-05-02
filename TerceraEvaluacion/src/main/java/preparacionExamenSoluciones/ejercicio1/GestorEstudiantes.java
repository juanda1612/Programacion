package preparacionExamenSoluciones.ejercicio1;

import java.util.Comparator;
import java.util.List;

class GestorEstudiantes {
    public static void ordenarPorMedia(List<Estudiante> estudiantes) {
        estudiantes.sort((o1, o2) -> Double.compare(o2.calcularMedia(), o1.calcularMedia()));
    }

    public static void mostrarEstudiantes(List<Estudiante> estudiantes) {
        estudiantes.forEach(estudiante -> System.out.println("Nombre: " + estudiante.getNombre() +
                                                           ", Edad: " + estudiante.getEdad() +
                                                           ", Promedio de Calificaciones: " + estudiante.calcularMedia()));
    }
}
