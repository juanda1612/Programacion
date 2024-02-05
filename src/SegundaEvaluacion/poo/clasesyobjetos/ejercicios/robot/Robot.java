package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.robot;

public class Robot {
    private String nombre;
    private String modelo;
    private int duracion;

    // constructores
    public Robot(){
        this.nombre = "Anonimo";
        this.modelo = "Desconocido";
    }

    public Robot(String nombre, String modelo, int duracion){
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }

    // El tercer constructor se hace con this()
    public Robot(String nombre, String modelo){
        this(nombre, modelo, 20);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
