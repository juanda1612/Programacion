package SegundaEvaluacion.poo.herencia.ejercicios.banco;

import java.util.ArrayList;

public class CuentaCorrienteEmpresa extends CuentaCorriente{
    double interesDescubierto;
    double maximoDescubierto;

    public CuentaCorrienteEmpresa(Persona titular, double saldo, String iban, ArrayList<String> entidades, double interesDescubierto, double maximoDescubierto) {
        super(titular, saldo, iban, entidades);
        this.interesDescubierto = interesDescubierto;
        this.maximoDescubierto = maximoDescubierto;
    }
}
