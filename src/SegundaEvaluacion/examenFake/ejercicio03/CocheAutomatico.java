package SegundaEvaluacion.examenFake.ejercicio03;

public class CocheAutomatico extends Coche{
    public CocheAutomatico(String matricula) {
        super(matricula);
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("Acelerando");
    }

    @Override
    public void frenar(int velocidad) {
        System.out.println("Frenando");
    }

    @Override
    public String toString() {
        return super.toString() + " Coche automatico";
    }
}
