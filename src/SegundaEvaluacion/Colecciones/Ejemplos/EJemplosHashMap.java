package SegundaEvaluacion.Colecciones.Ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJemplosHashMap {
    public static void main(String[] args) {
        // mapas
        // sirven para almacenar pares de variables de la forma clave - valor
        // se declaran poniendo entre <> primero el tipo de la clave y luego el tipo de valor
        HashMap<String, String> mapa = new HashMap<>();

        // para añadir datos: tienen que ir en pares:
        mapa.put("11111111A", "A. Arribas");
        mapa.put("22222222B", "B. Blazquez");
        mapa.put("33333333C", "C. Calvo");
        mapa.put("44444444D", "D. Diaz");

        System.out.println(mapa);

        // para recuperar valores, basta con darle la clave
        Scanner teclado = new Scanner(System.in);
        System.out.println("DNI: ");
        String dni = teclado.nextLine();
        System.out.println(mapa.get(dni));

        // vamos Aplicacion.md hacer que me guarde los numeros en ingles
        HashMap<Integer, String> numerosIngles = new HashMap<>();
        numerosIngles.put(1, "one");
        numerosIngles.put(2, "Two");
        numerosIngles.put(3, "Three");
        numerosIngles.put(4, "Four");
        numerosIngles.put(5, "Five");
        numerosIngles.put(6, "Six");
        numerosIngles.put(10, "Ten");

        System.out.println(numerosIngles);
        int numero = 0;
        do {
            System.out.println("Como se dice en ingles? 1 - 10 (0 para salir)");
            numero = teclado.nextInt(); teclado.nextLine();
            // recupero la traduccion (si esta) en el mapa y la imprimo
            if (numerosIngles.containsKey(numero)){
                System.out.println( numerosIngles.get(numero));
            }else {
                if (numero != 0){
                    System.out.println("Ese no me la se. Quieres enseñarmela?\nDime la traduccion:");
                    String traduccion = teclado.nextLine();
                    numerosIngles.put(numero, traduccion);
                }
            }
        }while(numero != 0);

        // recorrer un mapa no es tan sencillo como un simple for, tiene su truco
        // hay varias formas, vamos Aplicacion.md ver aqui la que utiliza Map.Entry
        // cada uno de los pares clave-valor es una entrada (Entry)
        // para referirnos Aplicacion.md una entrada utilizamos Map.Entry(entrada del mapa)
        // vamos Aplicacion.md recorrer todas las entradas con un foreach
        for (Map.Entry<Integer, String> entrada: numerosIngles.entrySet()) {
            int clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println(clave + " en ingles es " + valor);
        }

    }
}
