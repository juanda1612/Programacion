package PrimeraEvaluacion.Tema01.Ejemplos.metodosPrint;

public class Ejemplos {
    public static void main(String[] args) {
        // println: imprime el contenido dentro de los parentesis y hace un salto de linea
        System.out.println("Hola, mundo");
        System.out.println("Otra línea");
        System.out.println();
        // print: imprime el contenido pero no añade un salto, por lo que si ponemos contenido al lado de otro saldra en la misma linea
        System.out.print("Hola, ");
        System.out.print("mundo");
        System.out.println();

        // printf: imprime con formato
        /*
        Este método permite formatear y mostrar datos utilizando especificadores de formato, como
        %s para cadenas,
        %d para enteros,
        %f para números de punto flotante, etc.
         */

        String nombre = "Juan";
        System.out.printf("Nombre: %s \n" , nombre); // en lugar de poner un +, ponemos %s dentro de las comillas y, despues de la , la variable

        int edad = 25;
        System.out.printf("Edad: %d\n" , edad); // para los numeros enteros se pone %d

        double altura = 1.75;
        System.out.printf("Altura: %.2f\n" , altura); // para poner con decimales se pone %.2f

        System.out.printf("\n\n las tres variavales en el mismo texto: %s, Edad: %d, Altura: %.2f metros", nombre, edad, altura);


    }
}
