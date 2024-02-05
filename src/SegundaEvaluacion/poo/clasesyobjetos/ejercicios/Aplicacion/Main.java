package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Aplicacion;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Usuario usuario = crearUsuario();
        System.out.println(usuario);
        System.out.println("Tienes que esperar un poco");
        usuario.mensajeEstado();
        // se puede cambiar sin metodo
        usuario.setEstado(Estado.Activo);
    }
    public static Usuario crearUsuario(){
        //Usuario meterUsuario = new Usuario(teclado.nextLine(), teclado.nextLine(), teclado.nextLine(), Estado.Pendiente);
        return new Usuario(teclado.nextLine(),teclado.nextLine(), teclado.nextLine(), null);
    }


}
