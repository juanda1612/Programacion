package ejercicios.ejerciciosFicheros.ejercicio5;

import ejercicios.ejerciciosFicheros.Ruta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class ejercicio5 {
    static Ruta ruta = new Ruta();

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File(ruta.ruta()+"dataset_91007.txt");
        Scanner lector = new Scanner(archivo);

        System.out.println(lector.nextLine());
    }
}
