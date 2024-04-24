package ejercicios.ejerciciosFicheros.ejercicio4;

import ejercicios.ejerciciosFicheros.Ruta;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio4 {
    static Ruta ruta = new Ruta();
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        File fichero = new File(ruta.ruta()+teclado.nextLine());
        try {
            boolean creado = fichero.createNewFile();
            if (creado){
                System.out.println("Fichero creado correctamente");
            }

        }catch (IOException error){
            System.out.println("El fichero no se ha creado");
        }


        File borrar = new File(ruta.ruta()+teclado.nextLine());
        if (borrar.exists()){
            borrar.delete();
            System.out.println("El archivo se elimino correctamente");
        }else {
            System.out.println("No se ha podido eliminar el archivo");
        }


    }
}
