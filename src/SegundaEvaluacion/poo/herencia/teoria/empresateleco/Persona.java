package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.util.HashMap;

public class Persona {
    protected String nombre;
    protected int añoNacimiento;
    protected String dirección;

    protected String dni;

    // constructor de la superclase


    public Persona(String nombre, int añoNacimiento, String dirección, String dni) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.dirección = dirección;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona){
            Persona temp = (Persona) obj;
            return this.dni == temp.dni;
        }else {
            return false;
        }
    }

}
