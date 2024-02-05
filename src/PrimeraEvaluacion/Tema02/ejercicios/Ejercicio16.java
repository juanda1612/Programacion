package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        System.out.println("Introduce la operacion: 1 = + | 2 = - | 3 = * | 4 = /");
        int operacion = teclado.nextInt();
        int resultado;
        switch (operacion){
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma es " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("la resta es " + resultado );
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("la multiplicacion es " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("La division es " + resultado);
                break;
            default:
                System.out.println("Operacion incorrecta");
        }
    }
}
