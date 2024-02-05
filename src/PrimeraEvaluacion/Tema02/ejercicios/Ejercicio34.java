package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos (sin contar el 0 con que finaliza el programa).
 */

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //YO
        /*
        int suma = 0;
        double media = 0;
        while (true){
           int n = teclado.nextInt();
            suma = suma + n;
            media++;
            if (n == 0){
                media--;
                media = suma/media;
                System.out.println(media);
                break;
            }
        }
         */
        //CLASE
        int numero = teclado.nextInt();
        int contador = 0;
        double suma = 0;
        while (numero != 0){
            suma = suma + numero;
            contador++;
            numero= teclado.nextInt();
        }
        double media = suma / contador;
        System.out.printf("Media %.2f" , media);
    }
}
