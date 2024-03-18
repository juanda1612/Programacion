package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

/*
Clase Cliente, que
hereda también de Persona y tiene el atributo propio String telefonoDeContacto. De esta clase no hereda ninguna otra.
También sobreescribe el método mostrar de la misma forma que la clase anterior.
Su constructor recibe todos los atributos como parámetros.

 */
public class Cliente extends Persona {
    private String telefonoDeContacto;


    public Cliente(String nombre, LocalDate fechaNacimiento, String dni, String telefonoDeContacto) {
        super(nombre, fechaNacimiento,dni);
        int cifras = 0;
        if (telefonoDeContacto.length() == 9) {
            for (int i = 0; i < telefonoDeContacto.length(); i++) {
                if (Character.isDigit(telefonoDeContacto.charAt(i))) {
                    cifras++;
                }
            }
        }
        if (cifras == 9){
            this.telefonoDeContacto = telefonoDeContacto;
        } else {
            this.telefonoDeContacto = "Desconocido";
        }
    }

    public Cliente(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.telefonoDeContacto = "Desconocido";
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "telefonoDeContacto='" + telefonoDeContacto + '\'' +
                '}';
    }

    public void mostrar() {
        System.out.println("\n DATOS DEL CLIENTE:");
        System.out.println("Esto de persona:");
        System.out.println(super.toString());
        System.out.println("Y esto del cliente:");
        System.out.println(this.toString());
    }
}
