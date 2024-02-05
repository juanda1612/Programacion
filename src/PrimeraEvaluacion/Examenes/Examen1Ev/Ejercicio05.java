package PrimeraEvaluacion.Examenes.Examen1Ev;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author JuanDaniel
 */
/*
Crea un array para almacenar 20 números enteros, rellénalo con números aleatorios entre 1 y 100
(ambos inclusive). Muestra el contenido del array. A continuación, se introduce por teclado un
número entre 2 y 5 (ambos inclusive). Calcula y muestra la media de los números del array cuyos
índices sean múltiplo del número introducido. El elemento con índice 0 debe excluirse de los
cálculos.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Random generador = new Random();
        Scanner teclado = new Scanner(System.in);
        int indice = 0;
        double suma = 0;
        double media = 0;
        int[] numero = new int[20];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = generador.nextInt(1 , 101);
        }
        System.out.println(Arrays.toString(numero));
        System.out.println("Introduce un numero entre 2 y 5");
        int numero2 = teclado.nextInt();
        for (int i = 0; i < numero.length; i++) {
            if (i % numero2 == 0 && i != 0){
                suma = suma + numero[i];
                indice++;
            }
        }
        media = suma / indice;
        System.out.println(suma + " / " + numero2 + " = " + media);
    }
}
