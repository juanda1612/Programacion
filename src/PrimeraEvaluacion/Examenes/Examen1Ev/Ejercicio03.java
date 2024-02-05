package PrimeraEvaluacion.Examenes.Examen1Ev;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JuanDaniel
 */
/*
Realizar un programa que lea un número entero entre 0 y 9.999 (no comprobamos que esté en ese
rango, suponemos que se introduce siempre un número correcto) e imprima:
1. El número de dígitos que contiene. (1 punto)
2. La suma de todos sus dígitos. (1 punto)
3. Decir si es primo. Un número es primo si, al dividirlo por todos los números entre 1 y él
mismo, solamente es divisible por él mismo y por el 1. Como el 0 y el 1 no forman parte de
la tabla de números primos, así lo indicaremos en el caso de que sean introducidos. (1
punto)
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numero = teclado.nextLine();
        String[] casiNumero = numero.split("");

        int[] n = new int[numero.length()];
        boolean esPrimo = true;

        int suma = 0;
        for (int i = 0; i < casiNumero.length; i++) {
            n[i] = Integer.parseInt(casiNumero[i]);
        }

        int  esPrimoSi = Integer.parseInt(numero);

        for (int i = 0; i < n.length; i++) {
            suma = suma + n[i];
        }

        for (int i = 2; i < esPrimoSi; i++) {
            if (esPrimoSi % i == 0 ){
                esPrimo = false;
                break;
            }
        }

        System.out.println("Digitos: " + numero.length());
        System.out.println("Suma: " + suma);
        if (suma == 0 || suma == 1){
            System.out.println("No forma parte de la tabla de los primos");
        }else {
            if (esPrimo){
                System.out.println("Es primo");
            }else {
                System.out.println("No es primo");
            }
        }
    }
}
