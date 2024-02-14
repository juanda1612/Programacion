package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;
import java.util.Arrays;

public class Programador  extends Empleado{
    protected String[] lenguajes;

    public Programador(String nombre, int añoNacimiento, String dirección, LocalDate fechaInicio, Long salario, String[] lenguajes) {
        super(nombre, añoNacimiento, dirección, fechaInicio, salario);
        this.lenguajes = lenguajes;
    }

    public Programador(){
        super("",0,"",LocalDate.of(2000,12,02),0L);
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this. lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguajes=" + Arrays.toString(lenguajes) +
                ", fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    public void añadirLenguaje(String lenguaje){
        // como este metodo tiene que ser llamado por un programador ya creado
        // que tendra un String[]con un cierto tamaño  que no se puede ampliar
        String[] lenguajesMasUno = new String[lenguajes.length+1];
        for (int i = 0; i < lenguajes.length; i++) {
            lenguajesMasUno[i] = lenguajes[i];
        }
        // en la ultima posicion añado el lenguaje nuevo
        lenguajesMasUno[lenguajesMasUno.length - 1] = lenguaje;
        // y lo asignamos al atributo lenguajes
        this.lenguajes = lenguajesMasUno;
    }
}
