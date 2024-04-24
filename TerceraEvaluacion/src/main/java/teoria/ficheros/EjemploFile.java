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

        // CREAR DIRECTORIO

        try{
            File directorio = new File(ruta+"carpeta");
            boolean creada = directorio.mkdir();
            if (creada){
                System.out.println("Se ha creado la carpeta");
            }else {
                System.out.println("no se ha creado");
            }
        }catch (Exception e){
            System.out.println("Error. " + e.getMessage());
        }
        // RENOMBRAR: EN LINUX mv sirve para renombrar como para cambiar de sitio (porque cuando haces eso en realidad para el sistema operativo el nombre de cada fichero es cambiar su ruta completa).
        // pues aqui lo mismo, pero con el metodo renameTo.
        // ejemplo: vamos a renombrar fichero.txt por fichero.md
        try{
            // 1) Creo un objeto file con el nuevo nombre
            File nuevoNombre = new File(ruta + "fichero.md");

            // 2) Crea un objeto file con el fichero en su sitio actual o con su nombre actual
            File nombreActual = new File(ruta + "fichero.txt");

            // 3) renombramos el fichero
            boolean renombrado = nombreActual.renameTo(nuevoNombre);

            if (renombrado){
                System.out.println("Nombre cambiado");
            }else {
                System.out.println("Nombre no cambiado");
            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        // ahora metemos el fichero fichero.md en el directorio carpeta
        // 1) Objeto con la nueva ruta
        File nuevoSitio = new File(ruta + "carpeta/fichero.md");

        // 2) Objeto con el fichero donde esta actualmente
        File sitioActual = new File(ruta+"fichero.md");
        // 3) aplicamos el renameTo al fichero actual

       try {
           boolean movido = sitioActual.renameTo(nuevoSitio);
           if (movido){
               System.out.println("reubicado");
           }else{
               System.out.println("no se ha reubicado");
           }
       }catch (Exception e){
           System.out.println("Error: " + e.getMessage());
       }


    }
}
