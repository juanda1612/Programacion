package ejercicio2;

import java.time.LocalDate;

public abstract class Persona{
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected LocalDate fechaNacimiento;

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract String getNombreCompleto();

    public abstract void setNombreCompleto(String nombre);

    public void cambiarFechaNacimiento(int dd, int mm, int aaaa){
        fechaNacimiento = LocalDate.of(aaaa,mm,dd);
    }

}
