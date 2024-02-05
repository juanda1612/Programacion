package PrimeraEvaluacion.Examenes.Simulacro2;

import java.util.Arrays;
import java.util.Random;

public class Array15Profe {
        public static void main(String[] args) {
            Random generador = new Random();
            int[] numeros = new int[10];
            int[] numeros2 = new int[10];
            int indicePares = 0;
            int indiceImpares = -1;
            // creo una variable para ir avanzando en la posicion del array
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = generador.nextInt(1, 10);
            }
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0){
                    numeros2[indicePares] = numeros[i];
                    indicePares++;
                }else {
                    numeros2[indiceImpares] = numeros[i];
                    indiceImpares--;
            }

            System.out.println(Arrays.toString(numeros));
            System.out.println(Arrays.toString(numeros2));
        }
    }

}
