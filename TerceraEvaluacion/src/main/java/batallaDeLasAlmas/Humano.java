package batallaDeLasAlmas;

import java.util.ArrayList;
import java.util.Random;

public class Humano extends Ser implements Espiritual{
    ArrayList<Demonio> demonios;
    private double fe;
    ArrayList<Angel> angeles;

    public Humano(double fe) {
        this.fe = fe;
        this.demonios = new ArrayList<>();
        this.angeles = new ArrayList<>();
        añadirAngel();
        añadirDemonios();
    }
    public void rezar(){
        fe++;
        añadirAngel();
    }
    public void pecar(){
        fe--;
        añadirDemonios();
    }

    @Override
    public void mostrar() {
        System.out.println("Datos del Humano:");
        System.out.println("=================");
        System.out.println("Fe: " + fe);
        System.out.println("El humano tiene: " + angeles.size() + " angeles");
        System.out.println("El humano tiene: " + demonios.size() + " demonios");
    }

    static Random generador = new Random();

    public void añadirAngel(){
        Angel angel = new Angel(generador.nextInt(0,100),0);
        angeles.add(angel);
    }

    public void setFe(double fe){

    }

    public void añadirDemonios(){
        Demonio demonio = new Demonio(0, generador.nextInt(0,100));
        demonios.add(demonio);

    }
}
