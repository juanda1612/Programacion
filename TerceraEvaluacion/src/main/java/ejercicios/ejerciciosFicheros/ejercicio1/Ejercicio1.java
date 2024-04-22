package ejercicios.ejerciciosFicheros.ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    static String ruta = "TerceraEvaluacion/src/main/java/ejercicios/ejerciciosFicheros/ejercicio1/";
    public static void main(String[] args) {
        File fichero = new File(ruta+teclado.nextLine());
        if (fichero.exists()) {

            System.out.println("El fichero existe: " + fichero.exists());
            if (fichero.isDirectory()) {
                System.out.println("Es un directorio");
            } else if (fichero.isFile()) {
                System.out.println("Es un fichero");
                System.out.println("Nombre: " + fichero.getName());
                System.out.println("Tamaño: " + fichero.getTotalSpace());
                System.out.println("Permisos: " + "\nSe puede ejecutar: " + fichero.canExecute() + "\nSe puede escribir " + fichero.canWrite() + "\nSe puede leer: " + fichero.canRead());
            } else {
                System.out.println("No se que es");
            }
        }else {
            try {
                boolean creado = fichero.createNewFile();
                if (creado){
                    System.out.println("Fichero creado correctamente");
                }

            }catch (IOException error){
                System.out.println("El fichero no se ha creado");
            }
        }

    }
}
