package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.hotel;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        // aquí creamos los objetos
        Hotel hotel1 = new Hotel(1, Zona.PLAYA, 75);
        Hotel hotel2 = new Hotel(2, Zona.MONTAÑA, 90);
        Hotel hotel3 = new Hotel(3, Zona.PLAYA, 95);
        Hotel hotel4 = new Hotel(4, Zona.MONTAÑA, 85);

        //System.out.println(hotel1);
        //hotel1.setPrecio(600);
        //System.out.println(hotel1);
        //hotel1.setPrecio(60);
        //System.out.println(hotel1);

        System.out.println("Son iguales? " + hotel1.equals(hotel2));

        ArrayList<Hotel> hoteles = new ArrayList<>();
        hoteles.add(hotel1);
        hoteles.add(hotel2);
        hoteles.add(hotel3);
        hoteles.add(hotel4);

        Collections.sort(hoteles);

        System.out.println("ORDENAR");

        for(Hotel elemento: hoteles){
            System.out.println(elemento);
        }

    }
}