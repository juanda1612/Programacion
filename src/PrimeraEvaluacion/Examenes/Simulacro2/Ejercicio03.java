package PrimeraEvaluacion.Examenes.Simulacro2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {
    public static void main(String[] args) {
        int[] n = new int[60];
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        Random generador = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = generador.nextInt(1, 6);
            if (n[i] == 1){
                contador1++;
            } else if (n[i] == 2) {
                contador2++;
            } else if (n[i] == 3) {
                contador3++;
            } else if (n[i] == 4) {
                contador4++;
            } else if (n[i] == 5) {
                contador5++;
            }
        }
        System.out.println(Arrays.toString(n));
        System.out.println("contador1: " + contador1);
        System.out.println("contador2: " + contador2);
        System.out.println("contador3: " + contador3);
        System.out.println("contador4: " + contador4);
        System.out.println("contador5: " + contador5);
    }
}
