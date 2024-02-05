package PrimeraEvaluacion.Tema01.Ejemplos.Operadores;

import java.util.Scanner;

/*
Es un operator ternario que permite asignar un valor u otro Aplicacion.md una variable en función de que se cumpla o no una condición. Es una forma reducida de utilizar una sentencia if .. else en casos específicos.

La síntaxis del operador es:

resultado = condicion ? valorSiVerdadero : valorSiFalso
 */
public class OperadorTernario {
    public static void main(String[] args) {
        // Probar si un numero es par o impar
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        String cadena = numero % 2 == 0 ? " es número par" : " es número impar"; // si al dividirlo da como resto cero guarda en la variable cadena" "es un numero par" y si es falso, guarda en cadena  "es falso"
        System.out.println( numero + cadena);
        // podemos hacer esto tambien de forma que guarde el boolean resultante
        boolean resultado = numero % 2 == 0 ? true : false;
        System.out.println("¿Es par? " + resultado);
    }
}
