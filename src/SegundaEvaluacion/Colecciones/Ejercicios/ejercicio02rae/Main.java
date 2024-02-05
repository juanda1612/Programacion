package SegundaEvaluacion.Colecciones.Ejercicios.ejercicio02rae;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Los miembros de la Real Academia de la Lengua ocupan sillones con las letras del abecedario español, minúsculas y mayúsculas (en la práctica, las letras v, w, x, y, z, Ñ, W, Y nunca se ocupan, pero nosotros no lo tendremos en cuenta). Cuando un sillón queda vacante, se nombra un nuevo académico para ocuparlo.
Implementar la clase Académico, cuyos atributos son el nombre y el año de ingreso.
Implementar un programa donde se crean cinco objetos Académico, que se insertan en un mapa en el que la clave es la letra del sillón que ocupan, y el valor un objeto de la clase Académico. Para ello implementar el método estático:
static boolean nuevoAcadémico(Map<Character, Académico> academia, Académico nuevo, Character letra),
donde se lleva Aplicacion.md cabo la inserción después de comprobar que el carácter pasado como parámetro es una letra del abecedario.

 */
public class Main {
    public static void main(String[] args) {
        // crear cinco academicos
        Academico academico1 = crearAcademico("Maria", 2004);
        Academico academico2 = crearAcademico("Pepito", 2005);
        Academico academico3 = crearAcademico("Alvaro", 2006);
        Academico academico4 = crearAcademico("Antonio", 2007);
        Academico academico5 = crearAcademico("Jose Manuel", 2008);

        HashMap<Character, Academico> academia = new HashMap<>();
        // me piden que inserte los academicos con un metodo
        // creo una variable de tipo boolean para ver si se ha podido insertar o no
        //boolean insertado = nuevoAcadémico(academia, academico1, 'A');
        /*if (insertado){
            System.out.println("Academico insertado con exito.");
        } else {
            System.out.println("No se ha podido insertar el academico");
        }
         */

        nuevoAcadémico(academia, academico1, 'A');
        nuevoAcadémico(academia, academico2, 'B');
        nuevoAcadémico(academia, academico3, 'C');
        nuevoAcadémico(academia, academico4, 'D');
        nuevoAcadémico(academia, academico5, 'E');

        //academia.put('A', academico1);
        //academia.put('B', academico2);
        //academia.put('C', academico3);
        //academia.put('D', academico4);
        //academia.put('E', academico5);

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = teclado.next().charAt(0);
        System.out.println(academia.get(letra));
         */

        //imprimirAcademico(academico2);
        imprimirAcademia(academia);

        }

    // vamos Aplicacion.md hacer un metodo que me imprima los academicos con sus datos: letra, nombre y año

    public static void imprimirAcademico(Academico a){
        System.out.println("Año\t\tNombre");
        System.out.println(a.getAño()+"\t"+a.getNombre());
    }
    // imprimir toda la academia, con este formato: letra - año - nombre
    public static void imprimirAcademia(HashMap<Character, Academico> academia){ // academia puede llamarse como sea, mapa, etc...
        System.out.println("Letra\t\tAño\t\tNombre");
        System.out.println("===========================");
        // recorremos el mapa
        for (Map.Entry<Character, Academico> entrada: academia.entrySet()) {
            System.out.println(entrada.getKey() + "\t\t" + entrada.getValue().getAño() + "\t\t" + entrada.getValue().getNombre());
        }
    }

    public static boolean nuevoAcadémico(Map<Character, Academico> academia, Academico nuevo, Character letra){
        // tenemos que insertar el academico en el mapa comprobando antes si la letra lo es
        if (Character.isLetter(letra)){ // isLetter comprueba si es una letra
            // inserto el academico y devuelvo true
            academia.put(letra, nuevo);
            return true;
        } else {
            return false;
        }
    }

    // vamos Aplicacion.md crear los academicos con un metodo
    public static Academico crearAcademico(String nombre, int año){
        Academico academico = new Academico(nombre, año);
        return academico;
    }
}
