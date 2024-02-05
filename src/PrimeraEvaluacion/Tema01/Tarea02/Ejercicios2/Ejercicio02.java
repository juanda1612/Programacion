package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;

        int suma = num1 + num2;
        System.out.println("el resultado de la suma es "+ suma);
        int resta = num1 - num2;
        System.out.println("el resultado de la resta es "+ resta);
        int producto = num1 * num2;
        System.out.println("el resultado de la multiplicacion es "+ producto);
        int cociente = num1 / num2;
        System.out.println("el resultado de la division es "+ cociente);
        int resto = num1 % num2;
        System.out.println(" el resultado de el resto es " + resto);

    }
}
