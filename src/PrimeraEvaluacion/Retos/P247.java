package PrimeraEvaluacion.Retos;

import java.util.Arrays;
import java.util.Scanner;

public class P247 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        teclado.nextLine();

        while (numero != 0) {
                String cadena = teclado.nextLine();

                String[] array = cadena.split(" ");

                int[] numeros = new int[array.length];

                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = Integer.parseInt(array[i]);

                }
                boolean salimosDeLaCrisis = true;
                for (int i = 0; i < numeros.length -1; i++){ //el -1 es para no salirme del array cuando llegue Aplicacion.md la penultima posicion con i (i + 1 entonces sera la ultima posicion)
                   if (numeros[i] >= numeros[i + 1]){
                       salimosDeLaCrisis = false; // con una vez que entre en este if, no salimos de la crisis
                       break;
                   }
                } // si nunca entro en el if, entonces es que salimos de la crisis (porque sigue en true)
                // imprimimos el resultado
                if (salimosDeLaCrisis){
                    System.out.println("SI");
                }else {
                    System.out.println("NO");
                }
                numero = teclado.nextInt();
                teclado.nextLine();

        }
    }
}
