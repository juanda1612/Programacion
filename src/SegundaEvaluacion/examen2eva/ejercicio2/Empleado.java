package SegundaEvaluacion.examen2eva.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Empleado extends Persona{
    public static int contador;
    ArrayList<Empleado> supervisados;
    private LocalDate fechaContrato;
    private double sueldoBruto;
    Empleado supervisor;

    public Empleado(LocalDate fechaNacimiento) {
        super(fechaNacimiento);
        contador++;
        this.sueldoBruto = 15876;
        this.fechaContrato = LocalDate.now();
        this.supervisados = new ArrayList<>();
    }

    @Override
    public String getNombreCompleto() {
        return apellido1+ " " + apellido2+ " " + nombre;
    }

    @Override
    public void setNombreCompleto(String nombreYApellido) {
        String[]nombreCompleto = nombreYApellido.split(" ");
        nombre =nombreCompleto[0];
        apellido1 =nombreCompleto[1];
        apellido2 =nombreCompleto[2];
    }

    public void aumentarSueldo (double porcentaje){
        this.sueldoBruto = this.sueldoBruto + (this.sueldoBruto * (porcentaje /100));
    }

    public void setFechaContrato(int dd, int mm, int aaaa) {
        this.fechaContrato = LocalDate.of(aaaa, mm, dd);
    }

    public void asignarSupervisado(Empleado empleado){
        this.supervisados.add(empleado);
    }
    public void asignarSupervisor(Empleado empleado){
        this.supervisor = empleado;
    }

    public void quitarSupervisado(Empleado empleado){
        this.supervisados.remove(empleado);
    }

    public void mostrarDatosEmpleados(){
        System.out.print("Nombre: " + getNombreCompleto());
        System.out.print("\nFecha Nacimiento: " + fechaNacimiento);
        System.out.print("\nFecha Contrato: " + fechaContrato);
        System.out.printf("\nSalario: %.2f", sueldoBruto);

        if (supervisor == null){
            System.out.println("\nSupervisado por: Nadie");
        }else {
            System.out.print("\nSupervisado por: " + supervisor.nombre);
        }

        if (supervisados != null){
            System.out.print("\nSupervisa a: ");
            for (Empleado empleado : supervisados) {
                System.out.print(empleado.nombre + " ");
            }
        }

    }

}
