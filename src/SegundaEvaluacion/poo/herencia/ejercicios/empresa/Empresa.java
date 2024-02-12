package SegundaEvaluacion.poo.herencia.ejercicios.empresa;
/*Clase Empresa;
tiene el atributo nombre y además empleados y clientes, que representaremos con sendos ArrayList que añadiremos también como atributos.
Su constructor recibe todos los atributos como parámetros.
Añade un método mostrar(), que mostrará el resultado del método toString()
*/

public class Empresa {
    private String nombre;


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void mostrar(){
        System.out.println(toString());
    }
}
