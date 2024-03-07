package SegundaEvaluacion.poo.herencia.ejercicios.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // creo un cliente:
        Persona cliente1 = crearCliente();
        System.out.println(cliente1);

        // averiguo el tipo de cuenta:
        int tipo = tipoCuenta();

        // pido el saldo
        double saldo = preguntarSaldo();

        // con esto creamos la cuenta

        

    }

    public static Persona crearCliente(){
        System.out.println("Nombre, apellidos y DNI, separados por un espacio: ");
        String datosPersonales = teclado.nextLine();
        String[] datos = datosPersonales.split(" ");
        Persona persona = new Persona(datos[0], datos[1], datos[2]);
        return persona;
    }

    public static int tipoCuenta(){
        System.out.println("\nTipo de cuenta: 1. Ahorro\n2. Cuenta corriente personal\n3. Cuenta corriente empresa\nElige una opcion(1-3)");
        int tipo = teclado.nextInt(); teclado.nextLine();
        return tipo;
    }

    public static double preguntarSaldo(){
        System.out.println("Saldo inicial: ");
        double saldo = teclado.nextDouble();
        return saldo;
    }

    public static int mostrarMenu(){
        int opcion = 0;

        System.out.println("1. Abrir una nueva cuenta.\n" +
                "2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo\n" +
                "actual).\n" +
                "3. Obtener los datos de una cuenta concreta.Realizar un ingreso en una cuenta.\n" +
                "4. Retirar efectivo de una cuenta.\n" +
                "5. Consultar el saldo actual de una cuenta.\n" +
                "6. Salir de la aplicación." +
                "Elija una opcion(1-6)");

        opcion = teclado.nextInt();
        return opcion;
    }

}
