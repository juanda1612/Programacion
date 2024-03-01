package SegundaEvaluacion.examenFake.ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CocheAutomatico cocheAutomatico = new CocheAutomatico("AUT0001");
        CocheManual cocheManual = new CocheManual("MAN0001");
        cocheAutomatico.setNumPuertas(2);
        cocheManual.setNumPuertas(4);

        int velocidad = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            velocidad = teclado.nextInt();
            if (velocidad > cocheAutomatico.velocidad && velocidad > cocheManual.velocidad){
                cocheAutomatico.acelerar(velocidad);
                cocheAutomatico.velocidad = velocidad;
                System.out.println(cocheAutomatico);

                cocheManual.acelerar(velocidad);
                cocheManual.velocidad = velocidad;
                System.out.println(cocheManual);
            } else {
                cocheAutomatico.frenar(velocidad);
                cocheAutomatico.velocidad = velocidad;
                System.out.println(cocheAutomatico);

                cocheManual.frenar(velocidad);
                cocheManual.velocidad = velocidad;
                System.out.println(cocheManual);
            }
        }while (velocidad != 0);
    }
}
