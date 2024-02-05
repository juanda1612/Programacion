package PrimeraEvaluacion.Tema02.Ejemplos;

/*
if (expresión) {
// instrucciones que se ejecutan si expresión es true
} else {
// instrucciones que hacen otra cosa si expresión es false
}
 */

import java.util.Scanner;

public class EjemplosIfElse {
    public static void main(String[] args) {
        //Pido una edad y, si es mayor de edad, puede ver la pelicula; en caso contrario, le decimos que se vaya
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        int edad = teclado.nextInt();
        if (edad >= 18){
            System.out.println("Pasa, puedes ver la peli");
        }else { // si el resultado de la expresion es false ( puede traducirse como si no ....)
            System.out.println("No puedes pasar");
        }
        ///.... si es menor de edad (si es false, no se ejecuta la linea 20 y saltaria Aplicacion.md esta)
        System.out.println("Esto se imprime siempre, tanto si es true como si es false.");
    }
}
