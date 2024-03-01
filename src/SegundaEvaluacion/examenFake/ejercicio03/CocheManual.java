package SegundaEvaluacion.examenFake.ejercicio03;

public class CocheManual extends Coche{
    private int marcha;

    public CocheManual(String matricula) {
        super(matricula);
        this.marcha = 0;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    @Override
    public String toString() {
        return super.toString() + " Coche manual y hemos metido la " + marcha + "ª marcha";
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("Acelerando");
        cambiarMarcha(velocidad);
    }

    @Override
    public void frenar(int velocidad) {
        System.out.println("Frenando");
        cambiarMarcha(velocidad);
    }

    public void cambiarMarcha(int velocidad){
        if (velocidad < 10){
            marcha = 1;
        } else if (velocidad >= 10 && velocidad <=30){
            marcha = 2;
        } else if (velocidad >= 31 && velocidad <=50) {
            marcha = 3;
        }
        else if (velocidad >= 51 && velocidad <= 80){
            marcha = 4;
        }else if (velocidad > 80) {
            marcha = 5;
        }
    }
}
