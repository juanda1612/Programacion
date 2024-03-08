package SegundaEvaluacion.Colecciones.Ejercicios.libreria;

import java.util.*;

public class Colecciones {

    public static ArrayList<Editorial> obtenerEditoriales(){
        Editorial editorial1 = new Editorial(1,"Pepe");
        Editorial editorial2 = new Editorial(2,"Pepi");
        Editorial editorial3 = new Editorial(3,"Pepo");
        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial1);
        editoriales.add(editorial2);
        editoriales.add(editorial3);
        return editoriales;
    }
    public static Editorial buscarEditorial(List<Editorial> editoriales, int id) {
        Iterator<Editorial> iterator = editoriales.iterator();
        while (iterator.hasNext()) {
            Editorial editorial = iterator.next();
            if (editorial.getIdEditorial() == (id)) {
                return editorial;
            }
        }
        return null;
    }

    public static List<Libro> obtenerLibros() {
        // creamos los autores
        Autor autor1 = new Autor();
        autor1.setCodAutor("1");
        autor1.setNombre("Bruce Eckel");
        Autor autor2 = new Autor();
        autor2.setCodAutor("2");
        autor2.setNombre("James McGovern");
        Autor autor3 = new Autor();
        autor3.setCodAutor("3");
        autor3.setNombre("Ivor Horton");

        // creamos las editoriales
        List<Editorial> editorials = obtenerEditoriales();

        // finalmente creamos los libros
        Libro libro1 = new Libro("Thinking in Java", "1-2256" , autor1, editorials.get(0));
        Libro libro2 = new Libro("Java 2 Enterprise","2-7985",  autor2, editorials.get(1));
        Libro libro3 = new Libro("Beginning Java","1-9857",  autor3, editorials.get(2));

        // y los metemos en una lista
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        return libros;
    }

    public static void mostrarLibros(List<Libro> libros) {
        System.out.println("ISBN\t\ttitulo\t\t\teditorial\t\t\tautor");
        System.out.println("________________________________________");
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static Map<String, Editorial> obtenerEditorialesPremiadas() {
        List<Editorial> editoriales = obtenerEditoriales();
        Map<String, Editorial> premiadas = new HashMap<>();
        premiadas.put("1er premio", buscarEditorial(editoriales, 2));
        premiadas.put("2do premio", buscarEditorial(editoriales, 3));
        premiadas.put("3er premio", buscarEditorial(editoriales, 1));
        return premiadas;
    }

    public static void imprimirMapa() {
        Map<String, Editorial> premiadas = obtenerEditorialesPremiadas();
        //System.out.println("Feote: " + premiadas);

        System.out.println("Editoriales premiadas:  ");
        for (Map.Entry<String, Editorial> lineaMapa: premiadas.entrySet()) {
            System.out.println(lineaMapa.getKey() + "\t\t\t" + lineaMapa.getValue().getNombre());
        }
    }
}
