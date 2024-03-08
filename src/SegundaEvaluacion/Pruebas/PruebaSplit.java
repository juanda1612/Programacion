package SegundaEvaluacion.Pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class PruebaSplit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un nombre separado por espacios");
        String split = teclado.nextLine();
        String[] nombres = split.split(" ");
        System.out.println("ARRAY");
        System.out.println(Arrays.toString(nombres));

        System.out.println("STRING OTRA VEZ");
        split = String.join("", nombres);
        System.out.println(split);
    }
}
