package SegundaEvaluacion.examenFake.ejercicio03;

public abstract class Coche extends Vehiculo{
    private int numPuertas;

    public Coche(String matricula) {
        super(matricula);
        System.out.println("Se ha creado el vehiculo con matricula: " + matricula);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ". Tiene " + numPuertas + " puertas";
    }
}
