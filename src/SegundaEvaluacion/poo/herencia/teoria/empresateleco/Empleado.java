package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;

public class Empleado extends Persona{
    protected LocalDate fechaInicio;
    protected Long salario;

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }
}
