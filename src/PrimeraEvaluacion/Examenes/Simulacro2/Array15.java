package PrimeraEvaluacion.Examenes.Simulacro2;
/*
Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar en otro array los elementos pares del primero, y, Aplicacion.md continuación, los elementos impares.
 */

import java.util.Arrays;
import java.util.Random;

public class Array15 {
    public static void main(String[] args) {
        Random generador = new Random();
        int[] numeros = new int[10];
        int[] numeros2 = new int[10];
        int indice = 0;
        // creo una variable para ir avanzando en la posicion del array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generador.nextInt(1, 10);
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
              numeros2[indice] = numeros[i];
              indice++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0){
                numeros2[indice] = numeros[i];
                indice++;
            }
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numeros2));
    }
}
