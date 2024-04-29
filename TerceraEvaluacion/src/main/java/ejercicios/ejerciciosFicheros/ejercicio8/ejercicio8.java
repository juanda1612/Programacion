package ejercicios.ejerciciosFicheros.ejercicio8;

import ejercicios.ejerciciosFicheros.Ruta;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    static Ruta ruta = new Ruta();
    public static void main(String[] args) {
        System.out.println(fraseLarga("quijote.txt"));
    }


    public static String fraseLarga(String nombreFichero){
        Scanner lector = null;
        String fraseLarga = "";

        try {
            File fichero = new File(ruta.ruta()+nombreFichero);
            lector = new Scanner(fichero);
            while (lector.hasNextLine()){
               String linea = lector.nextLine();
                if (linea.length()>fraseLarga.length()){
                    fraseLarga = linea;
                }
            }
        }catch (NullPointerException e){
            System.out.println("Error: " +e.getMessage());
        } catch (FileNotFoundException e2) {
            System.out.println("Error2: " + e2.getMessage());
        } finally {
            lector.close();
        }
        return fraseLarga;
    }
}
