package SegundaEvaluacion.Colecciones.Ejercicios.ejercicio04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "diccionario=" + diccionario +
                '}';
    }

    public void nuevoPar(String español, String ingles){
        diccionario.put(español, ingles);
    }

    public String traduce(String español) {
        return diccionario.get(español);
    }

    public String palabraAleatoria(){
        //System.out.println(indice);
        Random generador = new Random();
        int indice = generador.nextInt(0, diccionario.size()-1);

        String español = (String) diccionario.keySet().toArray()[indice];

        return español;
    }

    public String primeraLetraTraduccion(String español){
        return diccionario.get(español).substring(0,1);
    }
}
