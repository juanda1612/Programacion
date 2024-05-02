package preparacionExamenSoluciones.ejercicio3;

import preparacionExamenSoluciones.Ruta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Ruta ruta = new Ruta();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int numero;
        do {
            System.out.println("Elige una opcion\n1) Crear Fichero\n2) Borrar fichero\n3) Escribir\n4) Leer Fichero\n0) Salir");
            numero = teclado.nextInt();teclado.nextLine();
            menu(numero);

        }while (numero != 0);
    }

    public static void crearFichero(String nombreFichero){
        try {
            File fichero = new File(ruta.ruta() + nombreFichero);
            Boolean creado = fichero.createNewFile();
            if (creado){
                System.out.println("Se a creado el fichero " + fichero.getName());
            }else {
                System.out.println("No se ha podido crear el fichero");
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void eliminarFichero(String nombre){
        File archivo = new File(ruta.ruta()+nombre);
        if (archivo.exists()){
            boolean eliminado = archivo.delete();
            if (eliminado){
                System.out.println("Se ha eliminado el fichero");
            }else {
                System.out.println("No se ha podido eliminar el fichero");
            }
        }else {
            System.out.println("No existe el archivo");
        }

    }

    public static void escribirLineas(String nombre) throws IOException {
        FileWriter escritor = null;

        try {
            File fichero = new File(ruta.ruta()+nombre);
            escritor = new FileWriter(fichero, true);
            System.out.println("Linea: ");
            String linea = "";
            do {
                linea = teclado.nextLine();
                if (!linea.equalsIgnoreCase("fin")){
                    escritor.write("\n"+linea);
                }
            }while (!linea.equalsIgnoreCase("fin"));
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            escritor.close();
        }
    }

    public static void leerFicheros(String nombre){
        File fichero = new File(ruta.ruta()+nombre);
        Scanner lector = null;
        try {
            lector = new Scanner(fichero);
            while (lector.hasNext()){
                System.out.println(lector.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());;
        }finally {
            lector.close();
        }
    }

    public static void menu(int numero) throws IOException {
        switch (numero){
            case 1:
                System.out.println("Como se va a llamar el fichero: ");
                crearFichero(teclado.nextLine());
                break;
            case 2:
                System.out.println("Que fichero vas a eliminar: ");
                eliminarFichero(teclado.nextLine());
                break;
            case 3:
                System.out.println("Introduce el nombre del fichero al que quieres ingresar lineas(FIN para salir)");
                escribirLineas(teclado.nextLine());
                break;
            case 4:
                System.out.println("Introduce el nombre del fichero que quieres ver");
                leerFicheros(teclado.nextLine());
        }
    }
}
