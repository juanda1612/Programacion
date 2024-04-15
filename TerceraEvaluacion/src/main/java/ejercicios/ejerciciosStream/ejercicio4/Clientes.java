package ejercicios.ejerciciosStream.ejercicio4;

import java.time.LocalDate;

public class Clientes {
    private String DNI;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Clientes(String DNI, String nombre, LocalDate fechaNacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return    "DNI=" + DNI +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento;
    }
}
