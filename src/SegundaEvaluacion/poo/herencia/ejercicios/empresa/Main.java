package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;
import java.util.ArrayList;

/*
Clase Main; contiene el método main, crea tres empleados (uno de ellos es un directivo de la categoría que quieras) y dos clientes y con todos ellos crea una empresa.
 */
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Pedro",LocalDate.of(2000,1,1));
        persona.mostrar();

        Empleado empleado = new Empleado("pedro",LocalDate.of(2000,1,1),"1111111" ,35000);
        empleado.mostrar();
        //System.out.println(empleado.calcularSalarioNeto());

        Cliente cliente1 = new Cliente("pedro",LocalDate.of(2000,1,1),"125364879","5115151");
        cliente1.mostrar();

        Cliente cliente2 = new Cliente("pedro",LocalDate.of(2000,1,1));
        cliente2.mostrar();

        Directivo directivo = new Directivo("pepito",LocalDate.of(2000,1,1),"111111",60000,Categoria.CEO);
        directivo.mostrar();
        directivo.asignarPlus();
        System.out.println("************");
        directivo.mostrar();


        // Probamos la clase Empresa
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);
        ArrayList<Cliente>clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        Empresa empresa = new Empresa("sdsad", empleados, clientes);

        empresa.mostrar();

        System.out.println("\n**METODO EQUALS**");
        Empleado empleado1 = new Empleado("pablo",LocalDate.of(2000,1,1),"1111111111", 22.5);
        Empleado empleado2 = new Empleado("Pedro",LocalDate.of(2000,1,1),"1111111111", 25.5);
        if (empleado1.equals(empleado2)){
            System.out.println("ese empleado ya existe");
        }else {
            System.out.println(empleado2);
        }
    }
}
