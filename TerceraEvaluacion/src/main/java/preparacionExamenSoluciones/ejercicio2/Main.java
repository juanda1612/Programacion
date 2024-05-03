package preparacionExamenSoluciones.ejercicio2;

import preparacionExamenSoluciones.Ruta;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Ruta ruta = new Ruta();
    public static void main(String[] args) {
        List<Contacto> listaContactos = new ArrayList<>();
        listaContactos.add(new Contacto("Juan", "123456789"));
        listaContactos.add(new Contacto("María", "987654321"));

        System.out.println("\nCreando fichero");
        Gestor.crearFichero("Prueba.txt");
        System.out.println("\nGuardando los contactos");
        Gestor.guardarContactos(listaContactos,"Prueba.txt");
        System.out.println("\nMostrando los datos");
        Gestor.imprimirContactos("Prueba.txt");

    }
}
