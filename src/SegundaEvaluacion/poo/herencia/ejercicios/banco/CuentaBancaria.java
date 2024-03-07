package SegundaEvaluacion.poo.herencia.ejercicios.banco;

import java.util.ArrayList;

public abstract class CuentaBancaria {
    Persona titular;
    double saldo;
    String iban;
    boolean remunerada;

    public CuentaBancaria(Persona titular, double saldo, String iban, boolean remunerada) {
        this.titular = titular;
        this.saldo = saldo;
        this.iban = iban;
        this.remunerada = remunerada;
    }
}
