package PrimeraEvaluacion.Tema02.Ejemplos;

public class EjemplosFor {
    public static void main(String[] args) {
        // Ejemplo: hacer un programa que imprima 5 veces hola
       /* for (int i = 0; // aqui inicializamos la variable del bucle "desde ..."
             i < 5; // condicion: mientras sea true el resultado de la condicion, seguiremos en el bucle
             i++){ // modificacion: aqui ponemos algo que modifique en cada iteracion el valor i, para que alguna vez false la condicion y podamos salir del bucle
            System.out.println("hola");
        }

        */

        System.out.println("Cuando finaliza el programa sigue por aqui ");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " "); // imprime 10 numeros: de 0 Aplicacion.md 9
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " "); // imprime 10 numeros: de 1 Aplicacion.md 10
        }
        System.out.println();
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " "); // imprime 21 numeros: de 0 Aplicacion.md 20
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " "); // imprime 10 numeros: de 10 Aplicacion.md 1

        }
        System.out.println();
        // Los numeros de la inicializacion, etc. pueden ser variables
        int inicio = 0;
        int fin = 10;
        for (int i = inicio; i < fin; i++) {
            System.out.print(i + " "); // imprime 10 numeros: de 0 Aplicacion.md 9
        }
        // una de lass aplicaciones de los bucles for es el ir acumulando, sumando, valores que se van generando en cada iteracion
        //Ejemplo: queremos sumar todos los numeros que van del 1 al 10(ambos inclusive). o sea, tengo que sumar 1 + 2 + 3 ...
        // el 1, el 2, el 3... son los valores de i en cada iteracion
        //solo necesito añadir una variable que los vaya acumulando
        System.out.println();
        System.out.println();
        int suma = 0;
        for (int i = 1; i < 11; i++) {
            suma = suma + i; // suma lo que tengo en suma hasta ese momento, le añade lo que vale i en esa iteracion
            System.out.println("sum amos " + i + ": " + suma);
        }


        }
    }

