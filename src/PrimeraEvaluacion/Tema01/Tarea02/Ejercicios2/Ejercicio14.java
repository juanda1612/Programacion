package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Hacer un programa que lea una temperatura en grados centígrados y la visualice en las escalas reamur, Fahrenheit y kelvin, teniendo en cuenta que
		Reamur = Centígrados x 0.8
           		Fahenheit = (Centígrados * 9/5)+32
           		Kelvin = Centígrados + 273
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double centigrados = teclado.nextDouble();
        double reamur = centigrados * .8;
        double fahenheit = (centigrados * 9/5) + 32;
        double kelvin = centigrados + 273;
        System.out.println("Reamur = " + reamur+"\n Fahenheit =" + fahenheit +"\n Kelvin = " + kelvin);
    }
}
