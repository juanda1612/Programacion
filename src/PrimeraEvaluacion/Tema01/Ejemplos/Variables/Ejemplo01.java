package PrimeraEvaluacion.Tema01.Ejemplos.Variables;

import java.util.Scanner;
/*
    Variable tipo char
 */
public class Ejemplo01 {
    public static void main(String[] args) {
        // la variable char sirve para guardar un unico caracter
        // y se indica con comillas SIMPLES ('')
        char letra = 'a';
        char numero = '7';
        // para introducir valores char por teclado
        Scanner teclado = new Scanner(System.in);
        char caracter = teclado.nextLine().charAt(0); //  cuando necesitamos intoducir un char por teclado añadir siempre el metodo: .charAt(0);

    }
}
