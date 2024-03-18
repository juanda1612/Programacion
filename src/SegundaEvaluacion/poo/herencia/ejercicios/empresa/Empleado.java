package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

/*
Clase Empleado, que
hereda de Persona y tiene el atributo propio double sueldoBruto;
sobreescribe el método mostrar para que muestre los valores del atributo propio y de los heredados;
tiene el método calcularSalarioNeto():double, que descuenta un 15% al salario bruto y devuelve el valor resultante.
Su constructor recibe todos los atributos como parámetros
ANTES DE ASIGNAR EL SUELDO BRUTO AL ATRIBUTO DEBEMOS COMPROBAR QUE EL PARÁMETRO ES > 0. SI ES NEGATIVO, ASIGNAMOS POR DEFECTO EL SMI (1134*14 = 15876)
 */
public class Empleado extends Persona {
    protected double sueldoBruto;

    public Empleado(String nombre, LocalDate fechaNacimiento, String dni, double sueldoBruto) {
        super(nombre, fechaNacimiento, dni);
        if (sueldoBruto <= 0) {
            this.sueldoBruto = 15786;
        }else {
            this.sueldoBruto = sueldoBruto;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println("\n DATOS DEL EMPLEADO:");
        System.out.println("Esto de persona:");
        System.out.println(super.toString());
        System.out.println("Y esto del empleado:");
        System.out.println(this.toString());
        System.out.println("Sueldo neto: " + this.calcularSalarioNeto() + "$");
    }

    public double calcularSalarioNeto(){
        double salarioNeto = sueldoBruto - sueldoBruto * 15 / 100;
        return salarioNeto;
    }
}
