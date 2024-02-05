package PrimeraEvaluacion.Tema02.Ejemplos;

import java.util.Scanner;

public class EjemplosIf {
    public static void main(String[] args) {
        /*
La forma más simple de la instrucción condicional consiste en la palabra clave if, una
expresión booleana y un cuerpo entre llaves.
if (expresión) {
// cuerpo: instrucciones que se ejecutan si expresión es true
}
         */
        //Pido una edad y, si es mayor de edad, puede ver la pelicula; en caso contrario no decimos nada
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        int edad = teclado.nextInt();
        if (edad >= 18){
            System.out.println("Pasa, puedes ver la peli");
        }
            ///.... si es menor de edad (si es false, no se ejecuta la linea 20 y saltaria Aplicacion.md esta)
            System.out.println("Esto se imprime siempre, tanto si es true como si es false.");

        // En vez de una eexpresion, puedo poner una variable boolean directamente
        // Entonces, el ejemplo anterior podria quedar asi:
        boolean mayorDeEdad = edad >= 18;
        if (mayorDeEdad){  // es lo mismo que poner mayorDeEdad == true
            System.out.println("Solo poniendo la variable mayorDeEdad, si es true solo se va Aplicacion.md imprimir esto");
        }

        if (!mayorDeEdad){ // es lo mismo que poner mayorDeEdad == false
            System.out.println("No eres mayor de edad");
        }

    }
}
