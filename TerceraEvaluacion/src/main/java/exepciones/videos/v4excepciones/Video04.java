package exepciones.videos.v4excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

// THROWS MULTIPLE
public class Video04 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        boolean salir = false;
        int pos;
        int[] array = {15, 2, 8, 19, 8};
        do {
            try{
                pos = obtenerDatos(array);
                System.out.println("array[" + pos + "] = " + array[pos]);
                salir = true;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("ERROR: número no válido");
                teclado.next();
            } catch (Exception e){
                System.out.println("Error desconocido"); // Esta excepción como cubre todas hay que ponerlo al final porque si la ponemos antes de los otros catch dará error ya que van en orden y si se captura en este no se capturarán en los siguientes más especificos.
            }
        }while (!salir);
        teclado.close();



    }

    public static int obtenerDatos(int [] v) throws ArrayIndexOutOfBoundsException, InputMismatchException { // si queremos propagar más de una excepción las ponemos aquí separadas por una coma
        System.out.println("Dime una posición entre 0 y " + (v.length -1));
        int n = teclado.nextInt(); // posible excepción de tipo InputMismatchException
        if (n < 0 || n >= v.length) // posible excepción de tipo ArrayIndexOutOfBoundsException
            throw new ArrayIndexOutOfBoundsException("Error: índice no válido");
        return n;

    }
}
