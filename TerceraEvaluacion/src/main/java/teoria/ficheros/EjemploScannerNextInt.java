package teoria.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploScannerNextInt {
    //Lectura de ficheros
    static String ruta = "TerceraEvaluacion/src/main/java/teoria/ficheros/";

    public static void main(String[] args) {
        File fichero = new File(ruta + "fichero1.txt");
        Scanner lector = null;
        int suma = 0;

        try {
            lector = new Scanner(fichero);
            while (lector.hasNext()){
                // ahora queremos sumarlos -> nextInt
                int numero = lector.nextInt();
                // la sumo
                suma = suma + numero;
            }
            System.out.println(suma);

        } catch (FileNotFoundException e) {
            System.out.println("No encuentra el fichero: " + e.getMessage());
            e.printStackTrace();
        }catch (InputMismatchException e2) {
            System.out.println("El fichero contiene algo que no es un int\n" + e2.getMessage());
        }finally {
            // el codigo de finally se ejecuta Siempre, tanto si ha saltado una excepcion (y por tanto se ha metido en un catch) como si no
            // aqui nos interesa cerrar todos los objetos q hayamos abierto en try
            lector.close();
        }
    }
}
