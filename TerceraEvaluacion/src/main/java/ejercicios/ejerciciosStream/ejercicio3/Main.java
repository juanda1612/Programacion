package ejercicios.ejerciciosStream.ejercicio3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        String animal = "Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao, Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra, Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo, Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo, Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera, Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga, Urraca, Vaca, Yak, Zorro";

        String[] animales = animal.split(", ");
        System.out.println(animales.length);

        List<String> animalesList = Arrays.stream(animales).toList();

        System.out.println("\nANIMALES QUE COMIENZAN POR LA LETRA INTRODUCIDA");
        String letra = teclado.nextLine();

        animalesList.stream()
                    .filter(a -> a.startsWith(letra))
                    .forEach(System.out::println);

        System.out.println("\nANIMALES NOMBRE MAS LARGO Y MAS CORTO");
        System.out.println(animalesList.stream()
                                       .max((o1, o2) -> o1.length()-o2.length())
                                       .orElseThrow());
        System.out.println(animalesList.stream()
                                       .max((o1, o2) -> o2.length()-o1.length())
                                       .orElseThrow());

        System.out.println("\nNUMERO DE ANIMALES DE LA LISTA");
        System.out.println(animalesList.stream()
                                       .mapToInt(a -> a.length())
                                       .count());


    }
}
