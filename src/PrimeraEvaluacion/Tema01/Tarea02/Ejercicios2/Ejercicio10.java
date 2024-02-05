package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que, dado un importe en euros, indique el número mínimo de billetes y monedas que se puede utilizar para obtener dicha cantidad. Por ejemplo:
Ejemplo: 232 euros son 1 billete de 200, 1 billete de 20, un billete de 10, y una moneda de  2 euros.

 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una cifra");
        int num1 = teclado.nextInt();
        int b500 = 500;
        int b200 = 200;
        int b100 = 100;
        int b50 = 50;
        int b20 = 20;
        int b10 = 10;
        int b5 = 5;
        int e2 = 2;
        int e1 = 1;
        int billete500 = num1 / b500;
        int resto = num1 % b500;
        int billete200 = resto / b200;
        int resto2 = resto % b200;
        int billete100 = resto2 / b100;
        int resto3 = resto2 % b100;
        int billete50 = resto3 / b50;
        int resto4 = resto3 % b50;
        int billete20 = resto4 / b20;
        int resto5 = resto4 % b20;
        int billete10 = resto5 / b10;
        int resto6 = resto5 % b10;
        int billete5 = resto6 / b5;
        int resto7 = resto6 % b5;
        int euro2 = resto7 / e2;
        int resto8 = resto7 % e2;
        int euro1 = resto8 / e1;


        System.out.println(billete500 +" y "+ billete200 +" y "+ billete100 +" y " + billete50 +" y "+ billete50 +" y " + billete20 + " y " + billete10 +" y " + billete10 + " y " + billete5 +" y " + euro1 + " y " + euro2);





    }
}
