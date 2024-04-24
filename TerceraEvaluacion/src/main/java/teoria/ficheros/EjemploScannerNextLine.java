package teoria.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploScannerNextLine {
    //Lectura de ficheros
    static String ruta = "TerceraEvaluacion/src/main/java/teoria/ficheros/";

    public static void main(String[] args) {
        File fichero = new File(ruta + "fichero1.txt");
        Scanner lector = null;
        try {
            lector = new Scanner(fichero);
            while (lector.hasNext()){
                System.out.println(lector.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("No encuentra el fichero: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // el codigo de finally se ejecuta Siempre, tanto si ha saltado una excepcion (y por tanto se ha metido en un catch) como si no
            // aqui nos interesa cerrar todos los objetos q hayamos abierto en try
            lector.close();
        }
    }
}
