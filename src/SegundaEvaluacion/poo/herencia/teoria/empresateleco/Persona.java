package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

public class Persona {
    protected String nombre;
    protected int añoNacimiento;
    protected String dirección;

    // constructor de la superclase


    public Persona(String nombre, int añoNacimiento, String dirección) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
