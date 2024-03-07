package SegundaEvaluacion.poo.herencia.ejercicios.banco;

import java.util.ArrayList;

public class CuentaCorrientePersonal extends CuentaCorriente{
    double comision;

    public CuentaCorrientePersonal(Persona titular, double saldo, String iban, ArrayList<String> entidades, double comision) {
        super(titular, saldo, iban, entidades);
        this.comision = comision;
    }
}
