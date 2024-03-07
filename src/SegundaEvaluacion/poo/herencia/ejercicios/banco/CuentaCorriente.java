package SegundaEvaluacion.poo.herencia.ejercicios.banco;

import java.util.ArrayList;

public abstract class CuentaCorriente extends CuentaBancaria{
    ArrayList<String> entidades;

    public CuentaCorriente(Persona titular, double saldo, String iban, ArrayList<String> entidades) {
        super(titular, saldo, iban, false);
        this.entidades = entidades;
    }
}
