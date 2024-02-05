package PrimeraEvaluacion.Examenes;

import java.util.Scanner;

/**
 * @author Juan Daniel
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
        System.out.println("Elige una opción");
        System.out.println("1. Sumar números.");
        System.out.println("2. Multiplicar números.");
        System.out.println("3. Contar numeros.");
        numero = teclado.nextInt();
        int nP;
        int n1;

        int suma = 0;
        int producto = 1;
        int contador = 0;

        switch (numero) {
            case 1:
                System.out.println("Cuantos numeros vamos Aplicacion.md sumar?");
                nP = teclado.nextInt();
                System.out.println("introduce los " + nP + " números");
                for (int i = 0; i < nP; i++) {
                    n1 = teclado.nextInt();
                    suma = suma + n1;
                }
                System.out.println("Suma = " + suma);
                break;
            case 2:
                System.out.println("Cuantos numeros vamos Aplicacion.md multiplicar?");
                nP = teclado.nextInt();
                System.out.println("introduce los " + nP + " números");
                for (int i = 0; i < nP; i++) {
                    n1 = teclado.nextInt();
                    producto = producto * n1;
                }
                System.out.println("Producto = " + producto);
                break;

            case 3:
                System.out.println("Introduce numeros (0 para terminar)");
                do {
                    n1 = teclado.nextInt();
                    if (n1 != 0) {
                        contador++;
                    }
                } while (n1 != 0);
                System.out.println("Has introducido " + contador + " números");
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        }while (numero < 1 || numero > 3) ;
    }
}
