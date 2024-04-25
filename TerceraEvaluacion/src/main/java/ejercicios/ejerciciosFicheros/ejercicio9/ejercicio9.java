package ejercicios.ejerciciosFicheros.ejercicio9;

import ejercicios.ejerciciosFicheros.Ruta;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    static Ruta ruta = new Ruta();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String fragmento = teclado.nextLine();
        Scanner lector = null;
        try {
            File fichero = new File(ruta.ruta()+"datos.txt");
            lector = new Scanner(fichero);
            String[] lineas = new String[0];

            while (lector.hasNext()){
                lineas = lector.nextLine().split(" ");
                for (int i = 0; i < lineas.length; i++) {
                    if (lineas[i].contains(fragmento)){
                        System.out.println(Arrays.toString(lineas));
                    }
                }
            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            lector.close();
        }
    }
}
