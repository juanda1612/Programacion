package SegundaEvaluacion.poo.herencia.ejercicios.empresa;
/*
Clase Cliente, que
hereda también de Persona y tiene el atributo propio String telefonoDeContacto. De esta clase no hereda ninguna otra.
También sobreescribe el método mostrar de la misma forma que la clase anterior.
Su constructor recibe todos los atributos como parámetros.

 */
public class Cliente extends Persona {
    private String telefonoDeContacto;


    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
}
