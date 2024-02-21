package SegundaEvaluacion.poo.herencia.teoria.ejemploclaseabstracta;

public abstract class Mascota { // con la pablabra abstract hacemos que esta clase sea abstracta

    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void dice (); // metodo abstracto, pero todas las subclases deberan obligatoriamente desarrollarlo

}
