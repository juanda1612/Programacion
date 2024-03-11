package SegundaEvaluacion.examen2eva.ejercicio1;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Mostramos mapas");
        System.out.println(HEXaDEC());
        System.out.println(DECaHEX());

        String color = colorHexadecimal(DECaHEX(),generarNumeros());
        System.out.println("\nMostramos color hexadecimal");
        System.out.println("#"+color);

        System.out.println("\nMostramos color rgb");
        String colorHexa = hexadecimalaRGB(HEXaDEC(),color);
        System.out.println(colorHexa);

    }

    public static HashMap<String,Integer> HEXaDEC(){
        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("0",0);
        mapa.put("1",1);
        mapa.put("2",2);
        mapa.put("3",3);
        mapa.put("4",4);
        mapa.put("5",5);
        mapa.put("6",6);
        mapa.put("7",7);
        mapa.put("8",8);
        mapa.put("9",9);
        mapa.put("A",10);
        mapa.put("B",11);
        mapa.put("C",12);
        mapa.put("D",13);
        mapa.put("E",14);
        mapa.put("F",15);
        return mapa;
    }
    public static HashMap<Integer,String> DECaHEX(){
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(0,"0");
        mapa.put(1,"1");
        mapa.put(2,"2");
        mapa.put(3,"3");
        mapa.put(4,"4");
        mapa.put(5,"5");
        mapa.put(6,"6");
        mapa.put(7,"7");
        mapa.put(8,"8");
        mapa.put(9,"9");
        mapa.put(10,"A");
        mapa.put(11,"B");
        mapa.put(12,"C");
        mapa.put(13,"D");
        mapa.put(14,"E");
        mapa.put(15,"F");
        return mapa;
    }
    public static int[] generarNumeros(){
        Random generador = new Random();
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generador.nextInt(0, 16);
        }
        System.out.println("\nMostramos numeros aleatorios");
        System.out.println(Arrays.toString(numeros));
        return numeros;
    }

    public static String colorHexadecimal(HashMap<Integer, String> mapa, int[] numeros){
        String[] colorHexa = new String[6];
        String colorHex = "";
        for (int i = 0; i < colorHexa.length; i++) {
            colorHexa[i]= mapa.get(numeros[i]);
        }
        colorHex = String.join("",colorHexa);
        return colorHex;
    }

    public static String hexadecimalaRGB(HashMap<String, Integer> mapa, String rgb){
        int colorRojo1 =  mapa.get(rgb.substring(0,1));
        int colorRojo2 =  mapa.get(rgb.substring(1,2));

        int colorRojo = colorRojo1 * 16 + colorRojo2;

        int colorVerde1 =  mapa.get(rgb.substring(2,3));
        int colorVerde2 =  mapa.get(rgb.substring(3,4));

        int colorVerde = colorVerde1 * 16 + colorVerde2;

        int colorAzul1 =  mapa.get(rgb.substring(4,5));
        int colorAzul2 =  mapa.get(rgb.substring(5,6));

        int colorAzul = colorAzul1 * 16 + colorAzul2;

        String[] coloresRgb = new String[3];
        coloresRgb[0] = String.valueOf(colorRojo);
        coloresRgb[1] = String.valueOf(colorVerde);
        coloresRgb[2] = String.valueOf(colorAzul);

        String colorRgb = String.join(" ", coloresRgb);

        return colorRgb;
    }
}
