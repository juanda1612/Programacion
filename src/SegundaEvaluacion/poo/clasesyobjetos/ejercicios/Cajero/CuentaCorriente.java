package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Cajero;

import java.util.Scanner;

public class CuentaCorriente {
    String dni;
    public String nombreTitular;
    private double saldo;
    private Gestor gestor;
    private String nombreBanco;


    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;

    }

    public CuentaCorriente(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;

    }

    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;

    }

    // getters y setters

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                ", gestor=" + gestor +
                ", nombreBanco='" + nombreBanco + '\'' +
                '}';
    }

    static Scanner teclado = new Scanner(System.in);

    public void sacarDinero() {
        System.out.println("Cantidad a retirar");
        int pedir = teclado.nextInt();
        if (saldo > pedir) {
            saldo = saldo - pedir;
            System.out.println("Operacion realizada, nuevo saldo: " + saldo);
        } else {
            System.out.println("Operacion rechazada");
        }
    }
    public void ingresarDinero(){
        System.out.println("Cantidad a Ingresar");
        int ingreso = teclado.nextInt();
        if (ingreso > 5){
            saldo = saldo + ingreso;
            System.out.println("Su saldo es: " + saldo);
        } else {
            System.out.println("No puede ser.");
        }
    }
    public void actualizarLibreta(){
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
        System.out.println("**** Libreta actualizada ****");
    }


}
