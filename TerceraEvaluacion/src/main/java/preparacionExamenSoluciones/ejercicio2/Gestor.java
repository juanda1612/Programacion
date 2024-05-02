package preparacionExamenSoluciones.ejercicio2;

import preparacionExamenSoluciones.Ruta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Gestor {
    static Ruta ruta = new Ruta();
    public static void guardarContactos(List<Contacto> contactos, String nombre) {
        try{
            FileWriter escritor = new FileWriter(ruta.ruta()+nombre, true);
            for (Contacto elemento : contactos) {
                escritor.write(elemento.getNombre() + "" + elemento.getTelefono() + "\n");
            }
            System.out.println("Contactos guardados exitosamente en el archivo " + nombre);
        } catch (IOException e) {
            System.err.println("Error al guardar los contactos: " + e.getMessage());
        }
    }
    public static void imprimirContactos(String nombre){
        Scanner lector = null;
        try {
            lector = new Scanner(ruta.ruta()+nombre);
            while (lector.hasNextLine()) {
                String[] partes = lector.nextLine().split("");
                System.out.println(Arrays.toString(partes));
            }
        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }finally {
            lector.close();
        }
    }

    public static List<Contacto> cargarContactos(String nombre) {
        List<Contacto> contactos = new ArrayList<>();

        Scanner lector = null;
        try {
            lector = new Scanner(ruta.ruta()+nombre);
            while (lector.hasNextLine()) {
                String[] partes = lector.nextLine().split("");
                 contactos.add(new Contacto(partes[0], partes[1]));
            }
        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }finally {
            lector.close();
        }
        return contactos;
    }
}
