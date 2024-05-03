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
    public static void crearFichero(String nombreFichero){
        try {
            File fichero = new File(ruta.ruta() + nombreFichero);
            Boolean creado = fichero.createNewFile();
            if (creado){
                System.out.println("Se a creado el fichero " + fichero.getName());
            }else {
                System.out.println("No se ha podido crear el fichero");
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void guardarContactos(List<Contacto> contactos, String nombre) {
        FileWriter escritor = null;
        try{
            File fichero = new File(ruta.ruta() + nombre);
            escritor = new FileWriter(fichero, true);

            if (fichero.exists()){
                for (Contacto contacto : contactos) {
                    escritor.write("Nombre:"+contacto.getNombre() + " ," +"Telefono:"+ contacto.getTelefono() + "\n");
                }
                System.out.println("Contactos guardados exitosamente en el archivo " + nombre);
            }else {
                System.out.println("El fichero no existe");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los contactos: " + e.getMessage());
        }finally {
            try {
                escritor.close();
            } catch (IOException e) {
                System.out.println("Erorr" + e.getMessage());;
            }
        }
    }
    public static void imprimirContactos(String nombre){
        Scanner lector = null;
        try {
            File fichero = new File(ruta.ruta() + nombre);
            lector = new Scanner(fichero);
            while (lector.hasNextLine()) {
                String[] partes = lector.nextLine().split(" ,");
                System.out.println(Arrays.toString(partes));
            }
        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }finally {
            lector.close();
        }
    }
}
