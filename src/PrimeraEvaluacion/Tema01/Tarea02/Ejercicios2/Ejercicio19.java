package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Realiza un programa que pida las notas finales de todos los módulos de 1º y muestre la nota final del curso. La nota final es la media de las notas de todos los módulos, redondeada Aplicacion.md un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si es 7,4, la nota final es 7).

 */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("Introduce las  notas finales de todos los modulos");
        double modulo1 = teclado.nextDouble();
        double modulo2 = teclado.nextDouble();
        double modulo3 = teclado.nextDouble();
        double modulo4 = teclado.nextDouble();
        double modulo5 = teclado.nextDouble();
        double modulo6 = teclado.nextDouble();
        double notaFinal = (modulo1 + modulo2 + modulo3 + modulo4 + modulo5 + modulo6) / 6;
        long notaFinalr = Math.round(notaFinal);
        System.out.println("La nota final es " + notaFinalr);

         */
        System.out.println("Introduce el numero de modulos");
        int modulos = teclado.nextInt();
        double sumaNotas = 0;
        double notasModulos = 0;

        for (int i = 1; i <= modulos; i++) {
            System.out.printf("Introduce las notas de los modulos %d " , i);
            notasModulos = teclado.nextDouble();
            sumaNotas += notasModulos;
        }
        long notaFinal = Math.round(sumaNotas / modulos);
        System.out.println("La nota final es " + notaFinal);



    }
}
