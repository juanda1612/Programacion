package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Arrays;

public class EjemplosArrays {
    public static void main(String[] args) {
        int a = 5; // solo puedo guardar un numero, un valor
        double alumno1 = 5.5;
        double alumno2 = 8.5;
        //que pasa si quiero guardar las notas de Programacion de una clase con 16 alumnos?
        //tendria que crear 16 variables

        //o bien...
        // utilizar una estructura que me permita guardar un conjunto de valores DEL MISMO TIPO
        // y para eso un array

        int[] notas = {6, 5, 4, 8, 10, 3, 7, 7, 5, 5}; // declaro el array notas, que guarda numeros enteros
        // quiero recuperar la primera nota, por ejemplo para imprimirla --> accedo Aplicacion.md traves del indice
        System.out.println("Primera posicion:");
        System.out.println(notas[0]);
        // tamaño array
        System.out.println("Tamaño del array:");
        System.out.println(notas.length);
        System.out.println("Ultima posicion del array:");
        // ultima posicion:
        System.out.println(notas[notas.length - 1]);
        // si quiero cambiar un dato lo puedo hacer Aplicacion.md traves de su indice (cosa que no puedo hacer con String)
        System.out.println("***Cambio la primera nota ***");
        notas[0] = 7;
        System.out.println(notas[0]);

        // FORMAS DE DECLARAR Y RELLENAR UN ARRAY
        // Una es la de la linea 15: lo declaro y enumero los datos en orden dentro de {}
        // lo mas habitual es que no sepas los datos antes de declararlo, entonces se hace
        int[] numeros = new int[10]; // 10 es el tamaño del array, INMODIFICABLE
        // despues, puedo utilizar un for (muy frecuentemente) para rellenarlo
        //por ejemplo, vamos Aplicacion.md rellenar el array numeros con el valor de sus indices: 0, 1, 2, ..
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        // Como imprimo todos los elementos del array?
        //Opcion A: con un for
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        //Opcion B: con el metodo toString() de la clase Arrays
        System.out.println(Arrays.toString(numeros));

    }
}
