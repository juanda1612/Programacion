package ejercicios.ejerciciosFicheros.ejercicio2;

import ejercicios.ejerciciosFicheros.Ruta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    static Ruta ruta = new Ruta();

    public static void main(String[] args) throws FileNotFoundException {
        File fichero = new File(ruta.ruta() +"Restaurantes.csv");
        Scanner lector = new Scanner(fichero);

        while (lector.hasNext()){
            String[]datos = lector.nextLine().split(",");
            if (datos[4].startsWith("6")){
                System.out.println(Arrays.toString(datos));
            }
        }
    }
}
