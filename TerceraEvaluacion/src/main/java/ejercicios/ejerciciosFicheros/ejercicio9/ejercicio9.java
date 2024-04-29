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
            int contador = 0;
            boolean palabraEncontrada = false;

            //PRIMERA VERSION
            /*
            String[] lineas = new String[0];

            while (lector.hasNextLine()){
                contador++;
                lineas = lector.nextLine().split(" ");
                for (int i = 0; i < lineas.length; i++) {
                    if (lineas[i].equalsIgnoreCase(fragmento)){
                        palabraEncontrada = true;
                        System.out.println(contador + " " + Arrays.toString(lineas));
                    }
                }
            }

             */
            //SEGUNDA VERSION
            while (lector.hasNextLine()){
                contador++;
                String linea = lector.nextLine();
                if (linea.equalsIgnoreCase(fragmento)){
                    palabraEncontrada = true;
                    System.out.println("Numero de linea:"+contador + ", " + linea);
                }
            }
            if (!palabraEncontrada){
                System.out.println("No se encuentra la palabra");
            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            lector.close();
        }
    }
}
