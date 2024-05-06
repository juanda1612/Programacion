package exepciones.videos.v3excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Video03While {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int pos;
        int[] elArray = {1, 2, 3};
        do {
            try{
                System.out.println("Dime una posición para saber el valor: 0-2");
                pos = teclado.nextInt();
                ejemplo(pos, elArray);
                salir = true;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error: " + e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("Error: el número introducido no es válido");
                teclado.next();
            }
        } while (!salir);
        teclado.close();

    }

    public static void ejemplo(int x, int[] v) throws ArrayIndexOutOfBoundsException{
        if(x < 0 || x >= v.length){
            throw  new ArrayIndexOutOfBoundsException("Posición no válida");
        }
        System.out.println(v[x]);

    }
}
