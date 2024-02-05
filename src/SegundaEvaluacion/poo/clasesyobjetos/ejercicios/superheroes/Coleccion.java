package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.superheroes;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", listaFiguras=" + listaFiguras +
                '}';
    }

    public void añadirFigura(Figura fig){
        listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id){

    }
}
