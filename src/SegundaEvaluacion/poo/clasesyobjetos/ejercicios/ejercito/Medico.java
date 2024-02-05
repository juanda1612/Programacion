package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.ejercito;

public class Medico {
    private String nombre;
    static int medicos;

    public Medico(String nombre) {
        this.nombre = nombre;
        medicos++;
    }
}
