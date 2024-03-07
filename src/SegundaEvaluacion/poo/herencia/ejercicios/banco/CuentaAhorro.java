package SegundaEvaluacion.poo.herencia.ejercicios.banco;

public class CuentaAhorro extends CuentaBancaria{
    int interes;

    public CuentaAhorro(Persona titular, double saldo, String iban) {
        super(titular, saldo, iban, true);
        this.interes = interes;
    }
}
