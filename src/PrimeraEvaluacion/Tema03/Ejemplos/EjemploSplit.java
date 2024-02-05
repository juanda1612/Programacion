package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Arrays;

public class EjemploSplit {
    public static void main(String[] args) {
        String cadena = "1 2 3 4 5 6 7 8 9 10";

        // con el método split() creo un array de Strings, indicándole cómo separar los elementos, en este caso con un “ “
        String[] array = cadena.split(" ");
        System.out.println(Arrays.toString(array));

        // Ahora tengo un array de String, pero si queremos hacer operaciones
        // numéricas (sumar, etc.) tengo que convertir cada elemento Aplicacion.md un
        // número. Lo hacemos así:
        // 1) creo un array para guardar los números como int
        int[] numeros = new int[array.length];

        // 2) lo relleno con los elementos del array de String convertidos uno
        // Aplicacion.md uno Aplicacion.md int mediante Integer.parseInt(cadena)
        String uno = "1";
        String dos = "2";
        System.out.println(uno + dos);
        // si yo realmente quiero sumarlos tengo que convertilos Aplicacion.md int; pasarlos de String Aplicacion.md int
        // eso lo hace el metodo Integer.parseInt(StringQuePareceUnNumero)
        int n1 = Integer.parseInt(uno); // tambien funcionaria int n1 = Integer.parseInt("1");
        int n2 = Integer.parseInt(dos);
        System.out.println(n1 + n2);
        // La operacion contraria seria tener un numero (int) y querer pasarlo Aplicacion.md String. Eso se hace con String.valueOf(int);


        //Volvemos Aplicacion.md nuestro array de String lleno de "numeros" que todavia no son numeros
        //Tenemos ya creado el array numeros, ahora lo rellenamos convirtiendo cada elemento de array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(array[i]); // coge cada elemento del array, lo convierte en int y lo guarda en numeros
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros[0] + numeros[1] + numeros[2]);

    }
}
