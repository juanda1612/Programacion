package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;
import java.util.Scanner;

/*
Clase Directivo, que
hereda de Empleado.
Tiene el atributo categoría, que es un tipo enumerado cuyos valores obtendremos de la siguiente URL: https://economipedia.com/definiciones/directivo.html
También sobreescribe el método mostrar con los valores de todos los atributos heredados más el atributo categoría.
Su constructor recibe todos los atributos como parámetros

 */
public class Directivo extends Empleado {
    private Categoria categoria;

    public Directivo(String nombre, LocalDate fechaNacimiento,String dni, double sueldoBruto, Categoria categoria) {
        super(nombre, fechaNacimiento, dni ,sueldoBruto);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria=" + categoria +
                ", sueldoBruto=" + sueldoBruto +
                '}';
    }
    @Override
    public void mostrar() {
        System.out.println("\n DATOS DEL DIRECTIVO:");
        super.mostrar();
        System.out.println(this.toString());
    }

    public void asignarPlus(){
        sueldoBruto = sueldoBruto + pedirPlus();
    }

    private double pedirPlus(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce plus: ");
        return teclado.nextDouble();
    }

    @Override
    public double calcularSalarioNeto() {
        return  sueldoBruto - sueldoBruto * 5 / 100;
    }
}
