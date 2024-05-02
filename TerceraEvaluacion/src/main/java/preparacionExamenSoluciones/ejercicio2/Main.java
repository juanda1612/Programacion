package preparacionExamenSoluciones.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contacto> listaContactos = new ArrayList<>();
        listaContactos.add(new Contacto("Juan", "123456789"));
        listaContactos.add(new Contacto("María", "987654321"));

        Gestor.guardarContactos(listaContactos, "contactos2.csv");

        /*
        List<Contacto> contactosCargados = Gestor.cargarContactos("contactos2.csv");

        System.out.println("Contactos cargados desde el archivo:");
        for (Contacto elemento : contactosCargados) {
            System.out.println("Nombre: " + elemento.getNombre() + ", Teléfono: " + elemento.getTelefono());
        }

         */
        Gestor.imprimirContactos("contactos2.csv");
    }
}
