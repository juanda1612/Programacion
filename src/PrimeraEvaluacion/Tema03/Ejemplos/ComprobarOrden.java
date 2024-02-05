package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Arrays;

public class ComprobarOrden {
    public static void main(String[] args) {
        int[] arrayDesordenado = new   int[5];
        for (int i = 0; i < arrayDesordenado.length; i++) {
            if (i % 2 == 0 ){
                arrayDesordenado[i] = i + 2 * i;
            }else {
                arrayDesordenado[i] = i - 2 * i;
            }
        }
        System.out.println(Arrays.toString(arrayDesordenado));
        int[] arrayOrdenado = {-5, 10, 16, 18, 100};
        // imaginemos que no sabemos que contiene el array
        // queremos averiguar si esta ordenado de esta forma
        boolean ordenAscendente = true;
        // Truco: si esta ordenado ascendentemente,cada elemento tiene que ser menor igual que el siguiente
        // y tendria en este caso todo el array comparando los elementos dos Aplicacion.md dos
        // es mas corto pensar asi: si no esta ordenado, basta que un elemento sea mayor que el siguiente

        for (int i = 0; i < 5; i++) {
            if (arrayDesordenado[i] > arrayDesordenado[i + 1]){ //con una vez que se cumple esto, ya esta desordenado
                ordenAscendente = false;
                break;
            }
        }
        System.out.println("Array1 "+ordenAscendente);

        //Comprobamos es segundo array
        ordenAscendente = true;
        for (int i = 0; i < 4; i++) {
            if (arrayOrdenado[i] > arrayOrdenado[i + 1]){
                ordenAscendente = false;
                break;
            }
        }
        System.out.println("Array2 "+ordenAscendente);

        if (ordenAscendente){
            System.out.println("El array esta ordenado de forma ascendente");
        }
    }
}
