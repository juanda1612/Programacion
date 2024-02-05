package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.superheroes;

import java.util.Scanner;

public class Figura {
    private String codigo;
    private double precio;
    private SuperHeroe caracteristicas;
    private Dimension dimension;

    public Figura(String codigo, double precio, SuperHeroe caracteristicas, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.caracteristicas = caracteristicas;
        this.dimension = dimension;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public SuperHeroe getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(SuperHeroe caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", caracteristicas=" + caracteristicas +
                ", dimension=" + dimension +
                '}';
    }

    public void subirPrecio( double cantidad){
        if (cantidad > 0){
            this.precio = this.precio + cantidad;
            System.out.println("Nuevo precio: " + this.precio);
        }

    }
}
