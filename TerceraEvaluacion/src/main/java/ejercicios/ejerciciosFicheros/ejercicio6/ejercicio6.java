package ejercicios.ejerciciosFicheros.ejercicio6;

import ejercicios.ejerciciosFicheros.Ruta;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
    static Ruta ruta = new Ruta();
    public static void main(String[] args) {
        File archivo = new File(ruta.ruta()+"br.txt");

        Scanner lector = null;
        String[] lineas = new String[0];
        try {
            lector = new Scanner(archivo);
            lineas = lector.nextLine().split("\\*");

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            lector.close();
        }

        for (String elemento:lineas) {
            System.out.println(elemento);
        }
    }
}
