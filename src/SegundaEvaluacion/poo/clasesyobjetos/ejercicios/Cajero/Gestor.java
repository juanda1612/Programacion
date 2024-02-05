package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Cajero;

public class Gestor {
    public String nombre;
    private String telefono;
    double importeMaximo; // default package, proteccion de paquete


    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000;
    }

    // para asignar un importe maximo al crear un gestor tenemos que crear otro constructor que si lo incluya

    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", importeMaximo=" + importeMaximo +
                '}';
    }
}
