package PrimeraEvaluacion.Tema02.ejercicios;
/*
Hacer un programa que calcule la suma y el producto de los 30 primeros números naturales. (El 0 no cuenta)
 */

public class Ejercicio26 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i < 31; i++) {
            suma = suma + i;
        }
        System.out.println("Suma = " + suma);
        System.out.println();
        int producto = 1;
        for (int i = 1; i < 31 ; i++) {
            producto = producto * i;
        }
        System.out.println("El producto es " + producto);
    }
}
