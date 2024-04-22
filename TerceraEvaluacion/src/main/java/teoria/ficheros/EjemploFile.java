package teoria.ficheros;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EjemploFile {
    //truco para averiguar la ruta relativa: empezamos con la ruta absoluta y vamos quitando cosas hasta que exist() debuelve true
    static String ruta = "TerceraEvaluacion/src/main/java/teoria/ficheros/";
    public static void main(String[] args) {
        // este metodo nos dice que caracter separador hay en las rutas;
        System.out.println(File.separator);

        File fichero = new File(ruta +"fichero.txt");

        //Queremos comprobar que ese fichero existe
        System.out.println("El fichero existe: " + fichero.exists());

        //lo porbamos con un fichero .java
        File otrofichero = new File(ruta + "EjemploFile.java");
        System.out.println("El fichero existe: " +otrofichero.exists());

        System.out.println("\nCON LA CLASE FILE PODEMOS ACCEDER A LAS PROPIEDADES DEL FICHERO");
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
        System.out.println("Se puede leer(r): " + fichero.canRead());
        System.out.println("Se puede escribir(w): " + fichero.canWrite());
        fichero.setExecutable(true);
        System.out.println("Se puede ejecutar(x): " + fichero.canExecute());
        // investigar
        System.out.println("Fecha ultima modificacion: " + fichero.lastModified());

        System.out.println("\nCON LA CLASE FILE TAMBIEN PONEDOS GESTIONAR FICHEROS");
        File ficheroNuevo = new File(ruta+"ficheroNuevo.txt");
        try {
            // lo meto en un try porque no quiero error
            boolean creado = ficheroNuevo.createNewFile();
            if (creado){
                System.out.println("El fichero se ha creado correctamente");
            }else {
                if (ficheroNuevo.exists()){
                    System.out.println("El fichero ya existe");
                }
            }
        }catch (IOException exceptionES){
            System.out.println("No se ha podido crear el fichero" + exceptionES.getMessage());
        }

        System.out.println("\nTAMBIEN PODEMOS ELIMINAR FICHEROS.");
        boolean borrado = ficheroNuevo.delete();
        if (borrado){
            System.out.println("Se ha borrado el fichero");
        }else{
            System.out.println("El fichero no se ha podido eliminar");
        }

    }
}
