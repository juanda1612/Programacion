package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

/*
Clase Main; contiene el método main, crea tres empleados (uno de ellos es un directivo de la categoría que quieras) y dos clientes y con todos ellos crea una empresa.
 */
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Pedro",LocalDate.of(2000,1,1));
        persona.mostrar();

        Empleado empleado = new Empleado("pedro",LocalDate.of(2000,1,1), 35000);
        empleado.mostrar();
        //System.out.println(empleado.calcularSalarioNeto());

        Cliente cliente1 = new Cliente("pedro",LocalDate.of(2000,1,1),"125364879");
        cliente1.mostrar();

        Cliente cliente2 = new Cliente("pedro",LocalDate.of(2000,1,1));
        cliente2.mostrar();

        Directivo directivo = new Directivo("pepito",LocalDate.of(2000,1,1),20000,Categoria.CEO);
        directivo.mostrar();
    }
}
