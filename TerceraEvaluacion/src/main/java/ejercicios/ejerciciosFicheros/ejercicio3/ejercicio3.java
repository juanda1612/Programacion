package ejercicios.ejerciciosFicheros.ejercicio3;

import ejercicios.ejerciciosFicheros.Ruta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    static Ruta ruta = new Ruta();
    public static void main(String[] args) throws IOException {
        File archivo = new File(ruta.ruta()+"nombres.csv");

        Scanner lector = new Scanner(archivo);
        Scanner teclado = new Scanner(System.in);

        try (FileWriter nuevoUsuario = new FileWriter(archivo, true)){
            System.out.println("Escribe un nuevo usuario(Nombre|Apellido1|Apellido2)");
            nuevoUsuario.write(teclado.nextLine()+"\n");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        while (lector.hasNext()){
            System.out.println(lector.nextLine());
        }
    }
}
