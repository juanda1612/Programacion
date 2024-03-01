package SegundaEvaluacion.examenFake.ejercicio03;

public abstract class Vehiculo{
    private String matricula;
    int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "El vehiculo con matricula " + matricula +" va a " + velocidad + "km/h";
    }

    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);
}
