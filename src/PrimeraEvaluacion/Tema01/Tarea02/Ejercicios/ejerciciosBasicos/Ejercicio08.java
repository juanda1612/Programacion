package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios.ejerciciosBasicos;
/*
Imagina que eres un gerente de recursos humanos en un restaurante y necesitas contratar Aplicacion.md un chef. Para hacer eso, necesitas recopilar algunos datos preliminares sobre los candidatos, concretamente 5 campos: nombre, edad, años de experiencia, preferencia de cocina. Escribe un programa que lea todas las palabras (o números) una Aplicacion.md una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos con usted si necesitamos Aplicacion.md alguien que cocine comida <PREFERENCIA DE COCINA>".
Entrada:
Eugenio
33
8
vegetariana
Salida:
El formulario de Eugenio, de 33 años y 8 de experiencia, está completo. Nos nos comunicaremos con usted si necesitamos alguien que cocine comida vegetariana.

 */

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        // para pedir los datos al usuario
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre");
        String nombre = teclado.nextLine();
        System.out.println("Edad");
        int edad = teclado.nextInt();
        //SIEMPRE QUE UTILICEMOS nextInt(), para que imprima despues del nextInt hay que poner: teclado.nextLine();
        teclado.nextLine();
        System.out.println("Años de experiencia");
        int añosExperiencia = teclado.nextInt(); teclado.nextLine();
        System.out.println("Preferencia de cocina");
        String preferenciaCocina = teclado.nextLine();
        // para incluir una variable en sout para imprimir se tiene que poner: " + variable + "
        System.out.println("El formulario de " + nombre +", de " + edad + " años y " + añosExperiencia + " de experiencia, está completo. Nos nos comunicaremos con usted si necesitamos alguien que cocine comida " + preferenciaCocina + ".");

    }
}
