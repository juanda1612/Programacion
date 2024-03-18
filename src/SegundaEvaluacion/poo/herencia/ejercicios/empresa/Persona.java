package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

/*
Clase Persona, con los atributos nombre y edad (con los modificadores de acceso adecuados teniendo en cuenta que va a ser la clase padre de una jerarquía de clases), y un método mostrar() que muestre sus valores al ser invocado. Su constructor recibe todos los atributos como parámetros.
 */
public class Persona {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String dni;


    public Persona(String nombre, LocalDate fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                '}';
    }

    public void mostrar(){
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona){
            Persona temp = (Persona) obj;
            return this.dni == temp.dni;
        }else {
            return false;
        }
    }
}
