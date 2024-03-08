package SegundaEvaluacion.examen2eva.ejercicio2;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(LocalDate.of(2000,01,1));
        empleado1.setNombreCompleto("Pepito Piedra Palo");

        Empleado empleado2 = new Empleado(LocalDate.of(2000,02,2));
        empleado2.setNombreCompleto("Pablito Pepi Palo");
        empleado2.setFechaContrato(5,12,2020);
        empleado2.aumentarSueldo(50);

        Empleado empleado3 = new Empleado(LocalDate.of(2000,04,3));
        empleado3.setNombreCompleto("Nombre Pepo Palo");

        empleado3.asignarSupervisado(empleado1);
        empleado3.asignarSupervisado(empleado2);

        empleado1.asignarSupervisor(empleado3);
        empleado2.asignarSupervisor(empleado3);

        System.out.println("\n====================");
        System.out.println("Datos empleado 1");
        empleado1.mostrarDatosEmpleados();
        System.out.println("\n");
        System.out.println("\n====================");
        System.out.println("Datos empleado 2");
        empleado2.mostrarDatosEmpleados();
        System.out.println("\n");
        System.out.println("====================");
        System.out.println("Datos empleado 3");
        empleado3.mostrarDatosEmpleados();

        System.out.println("\nNumero de Empleados: " + Empleado.contador);
    }

}
